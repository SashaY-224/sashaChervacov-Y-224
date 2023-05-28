import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int moves = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n--;
            }
            moves++;
        }
        if (moves % 2 == 0) {
            System.out.println("Таня");
        } else {
            System.out.println("Саша");
        }
    }
}
