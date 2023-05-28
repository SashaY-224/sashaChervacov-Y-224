import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите список весов посетителей через пробел:");
        String input = scanner.nextLine();
        String[] weights = input.split(" ");
        Arrays.sort(weights, (a, b) -> {
            int sumA = sumDigits(a);
            int sumB = sumDigits(b);
            if (sumA == sumB) {
                return Integer.compare(Integer.parseInt(b), Integer.parseInt(a));
            }
            return Integer.compare(sumB, sumA);
        });
        System.out.println("Отсортированный список весов:");
        for (String weight : weights) {
            System.out.print(weight + " ");
        }
    }
    private static int sumDigits(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}
