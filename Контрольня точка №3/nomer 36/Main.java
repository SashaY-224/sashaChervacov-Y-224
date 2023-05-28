import java.util.Scanner;
import java.util.Random;

public class Main {
    private static final int CODE_LENGTH = 4;
    private static final int MAX_GUESSES = 20;
    private static final int MAX_NUMBER = 9;

    public static void main(String[] args) {
        int[] code = generateCode();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Код загадан. Введите " + CODE_LENGTH + " числа от 0 до " + MAX_NUMBER);

        for (int i = 1; i <= MAX_GUESSES; i++) {
            System.out.println("Попытка " + i + ":");
            int[] guess = readGuess(scanner);
            int[] result = checkGuess(guess, code);
            if (result[0] == CODE_LENGTH) {
                System.out.println("Вы угадали код!");
                return;
            } else {
                System.out.println("Совпадений: " + result[0] + ", совпадений по месту: " + result[1]);
            }
        }

        System.out.println("Вы проиграли. Код был: " + toString(code));
    }

    private static int[] generateCode() {
        Random random = new Random();
        int[] code = new int[CODE_LENGTH];
        for (int i = 0; i < CODE_LENGTH; i++) {
            code[i] = random.nextInt(MAX_NUMBER + 1);
        }
        return code;
    }

    private static int[] readGuess(Scanner scanner) {
        int[] guess = new int[CODE_LENGTH];
        for (int i = 0; i < CODE_LENGTH; i++) {
            guess[i] = scanner.nextInt();
        }
        return guess;
    }

    private static int[] checkGuess(int[] guess, int[] code) {
        int[] result = new int[2];
        boolean[] used = new boolean[CODE_LENGTH];
        for (int i = 0; i < CODE_LENGTH; i++) {
            if (guess[i] == code[i]) {
                result[0]++;
                used[i] = true;
            }
        }
        for (int i = 0; i < CODE_LENGTH; i++) {
            if (!used[i]) {
                for (int j = 0; j < CODE_LENGTH; j++) {
                    if (i != j && guess[i] == code[j]) {
                        result[1]++;
                        break;
                    }
                }
            }
        }
        return result;
    }

    private static String toString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }
        return sb.toString();
    }
}
