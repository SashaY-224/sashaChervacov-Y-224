import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String inputText = scanner.nextLine();
        String[] words = inputText.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 1) {
                char firstLetter = word.charAt(0);
                String modifiedWord = word.substring(1) + firstLetter + "ауч ";
                result.append(modifiedWord);
            } else {
                result.append(word).append("ауч ");
            }
        }
        System.out.println("Измененный текст:");
        System.out.println(result.toString().trim());
    }
}