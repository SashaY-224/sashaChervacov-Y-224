import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длины трех отрезков:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            double cosA = (b * b + c * c - a * a) / (2 * b * c);
            double angleA = Math.toDegrees(Math.acos(cosA));
            System.out.println("Внешний угол треугольника: " + (180 - angleA) + " градусов");
        } else {
            System.out.println("Треугольник не существует");
        }

        sc.close();
    }
}