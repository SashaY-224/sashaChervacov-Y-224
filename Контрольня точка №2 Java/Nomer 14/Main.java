import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];
        int count = 0;

        while (count < 3) {
            System.out.println("Введите число:");
            int num = scanner.nextInt();

            if (count < 3) {
                numbers[count] = num;
                count++;
            }
            else {
                int minIndex = 0;
                for (int i = 1; i < 3; i++) {
                    if (numbers[i] < numbers[minIndex]) {
                        minIndex = i;
                    }
                }
                if (num > numbers[minIndex]) {
                    numbers[minIndex] = num;
                }
            }
            System.out.print("Текущие числа в ячейках: ");
            for (int i = 0; i < count; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}