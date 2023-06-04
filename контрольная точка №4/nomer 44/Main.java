import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String strNum1 = scanner.nextLine();
        System.out.print("Введите второе число: ");
        String strNum2 = scanner.nextLine();
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int sum = num1 + num2;
        String strSum = Integer.toString(sum);
        System.out.println("Ответ: " + strSum);
    }
}

