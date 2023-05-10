import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String stroka = scanner.nextLine();

        stroka= stroka.replaceAll("[AEIOUYaeiouy]", "");

        System.out.println("Результат:"+ stroka);
        scanner.close();
    }
}