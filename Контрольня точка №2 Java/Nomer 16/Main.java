import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        int upperCount = 0;
        int lowerCount =0;
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCount++;
            }
        }

        String output;

        if (upperCount > lowerCount) {
            output = input.toUpperCase();
        } else if (lowerCount > upperCount) {
            output = input.toLowerCase();
        } else {
            output = input.toLowerCase();
        }

        System.out.println("Результат: " + output);

        scanner.close();
    }
}