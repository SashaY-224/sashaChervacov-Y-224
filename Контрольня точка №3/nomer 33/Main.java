import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вветде число: ");
        long n = scanner.nextLong();
        long tanyaSticks = 0;
        while (n > 0) {

            if (n % 2 == 1) {
                n--;
                tanyaSticks++;
            } else {
                long tanyaHalf = n / 2;
                long tanyaOne = n - 1;
                if (tanyaHalf > tanyaOne) {
                    n /= 2;
                } else {
                    n--;
                }
            }
        }
        System.out.println("Палочки тани: "+tanyaSticks);
    }
}
