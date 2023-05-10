import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координаты первой вершины треугольника через запятую: ");
        String[] pointA = scanner.nextLine().split(", ");
        System.out.print("Введите координаты второй вершины треугольника через запятую: ");
        String[] pointB = scanner.nextLine().split(", ");
        System.out.print("Введите координаты третьей вершины треугольника через запятую: ");
        String[] pointC = scanner.nextLine().split(", ");
        int xA = Integer.parseInt(pointA[0]);
        int yA = Integer.parseInt(pointA[1]);
        int xB = Integer.parseInt(pointB[0]);
        int yB = Integer.parseInt(pointB[1]);
        int xC = Integer.parseInt(pointC[0]);
        int yC = Integer.parseInt(pointC[1]);
        double xCentroid = (xA + xB + xC) / 3.0;
        double yCentroid = (yA + yB + yC) / 3.0;
        System.out.printf("Барицентр треугольника: {%.4f, %.4f}", xCentroid, yCentroid);
    }
}