import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int start = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int step = scanner.nextInt();

        for (int i = 0; i < 5; i++) {
            int number = start + i * step;
            int square = number * number;
            System.out.print(square + " ");
        }

        scanner.close();
    }
}

