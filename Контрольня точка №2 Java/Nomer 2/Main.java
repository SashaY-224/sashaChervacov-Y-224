import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите массив посетителей: ");
        String input = scanner.nextLine();

        input = input.replace("[", "").replace("]", "").replace(" ", "");

        String[] stringArray = input.split(",");

        boolean[] visitors = new boolean[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            visitors[i] = Boolean.parseBoolean(stringArray[i]);
        }

        int employees = 0;

        for (boolean visitor : visitors) {
            if (visitor) {
                employees++;
            }
        }

        System.out.printf("Количество сотрудников на предприятии: %d.\n", employees);
    }
}