import java.util.*;

public class Main {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        List<String> words = Arrays.asList(input.split(" "));

        Set<String> uniqueWords = new LinkedHashSet<>(words);

        String output = String.join(" ", uniqueWords);

        System.out.println("Результат: " + output);

        scanner.close();
    }
}