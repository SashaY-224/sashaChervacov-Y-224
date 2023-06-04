import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String HISTORY_FILE = "history.txt";

    public static void main(String[] args) {
        System.out.println("Калькулятор");

        List<String> history = loadHistory();

        Scanner scanner = new Scanner(System.in);
        String expression;

        while (true) {
            System.out.print("Введите выражение (или 'history' для просмотра истории, 'exit' для выхода): ");
            expression = scanner.nextLine();

            if (expression.equalsIgnoreCase("history")) {
                printHistory(history);
                continue;
            } else if (expression.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                double result = calculate(expression);
                System.out.println("Результат: " + result);
                saveHistory(expression, result);
                history.add(expression + " = " + result);
            } catch (Exception e) {
                System.out.println("Ошибка при вычислении выражения: " + e.getMessage());
            }
        }
    }

    private static double calculate(String expression) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ')
                    nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < expression.length())
                    throw new RuntimeException("Недопустимый символ: " + (char) ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                while (true) {
                    if (eat('+'))
                        x += parseTerm();
                    else if (eat('-'))
                        x -= parseTerm();
                    else
                        return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                while (true) {
                    if (eat('*'))
                        x *= parseFactor();
                    else if (eat('/'))
                        x /= parseFactor();
                    else if (eat('%'))
                        x %= parseFactor();
                    else if (eat('^'))
                        x = Math.pow(x, parseFactor());
                    else if (eat('/'))
                        x = (int) x / parseFactor();
                    else
                        return x;
                }
            }

            double parseFactor() {
                if (eat('+'))
                    return parseFactor();
                if (eat('-'))
                    return -parseFactor();

                double x;
                int startPos = this.pos;
                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.')
                        nextChar();
                    x = Double.parseDouble(expression.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') {
                    while (ch >= 'a' && ch <= 'z')
                        nextChar();
                    String func = expression.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("abs"))
                        x = Math.abs(x);
                    else
                        throw new RuntimeException("Неизвестная функция: " + func);
                } else {
                    throw new RuntimeException("Недопустимый символ: " + (char) ch);
                }

                if (eat('^'))
                    x = Math.pow(x, parseFactor());

                return x;
            }
        }.parse();
    }

    private static void saveHistory(String expression, double result) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(HISTORY_FILE, true))) {
            writer.println(expression + " = " + result);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении истории: " + e.getMessage());
        }
    }

    private static List<String> loadHistory() {
        List<String> history = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(HISTORY_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                history.add(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке истории: " + e.getMessage());
        }

        return history;
    }

    private static void printHistory(List<String> history) {
        System.out.println("История вычислений:");
        for (String item : history) {
            System.out.println(item);
        }
    }

}