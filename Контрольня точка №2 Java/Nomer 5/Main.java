import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите числа через пробел: ");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");

        int sumOfSquares = 0;
        for (String number : numbers) {

            int value = Integer.parseInt(number);
            sumOfSquares += value * value;
        }

        System.out.println("Сумма квадратов: " + sumOfSquares);

        scanner.close();
    }
}

