import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int number = scanner.nextInt();
        scanner.close();

        boolean isPrime = true;

        if (number < 2) {
            isPrime = false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " простое.");
        } else {
            System.out.println(number + " непростое.");
        }
    }
}