import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя:");
        String name = scanner.nextLine();

        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

        System.out.println("Привет, " + name + "!");

        scanner.close();
    }
}