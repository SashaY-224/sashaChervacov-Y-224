import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Число N:");
        int n = scanner.nextInt();
        System.out.println("1 делитель:");
        int a = scanner.nextInt();
        System.out.println("2 делитель:");
        int b = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % a == 0 || i % b == 0) {
                sum += i;
            }
        }

        // Выводим результат
        System.out.println("Сумма чисел, делящихся на: " + a + " или " + b + ": " +sum);
    }
}