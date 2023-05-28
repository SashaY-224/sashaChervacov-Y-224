import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ArrayFilling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту 'm': ");
        int m = scanner.nextInt();
        System.out.print("Введите ширину 'n': ");
        int n = scanner.nextInt();
        int[][] array = new int[m][n];
        int border = Math.min(n, m) / 2 + Math.min(n, m) % 2;
        for (int k = 0; k < border; k++) {
            int value = k + 1;
            for (int i = k; i < n - k; i++) {
                array[k][i] = value;
                if (m - 1 - k != k) {
                    array[m - 1 - k][i] = value;
                }
            }
            for (int i = k + 1; i < m - 1 - k; i++) {
                array[i][k] = value;
                if (n - 1 - k != k) {
                    array[i][n - 1 - k] = value;
                }
            }
        }
        System.out.println("Массив:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        String filename = "Язык программирования java.txt";
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("Массив:\n");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    writer.write(array[i][j] + "\t");
                }
                writer.write("\n");
            }
            writer.close();
            System.out.println("\nРезультат сохранен в файл '" + filename + "'");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}