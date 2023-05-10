import java.util.Scanner;

public class ClosestSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        scanner.close();

        int closestSquare = 0;
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i <= number; i++) {
            int square = i * i;
            int distance = Math.abs(square - number);
            if (distance < minDistance) {
                closestSquare = square;
                minDistance = distance;
            }
        }

        System.out.println("Ближайший квадрат " + number + " это " + closestSquare);
    }
}