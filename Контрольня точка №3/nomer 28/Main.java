import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ВВедите число: ");
        int n = input.nextInt();
        int i = 1;
        while (i * i < n) {
            i++;
        }
        int closestSquare = i * i;
        int diff = closestSquare - n;
        int root = (int) Math.sqrt(diff);
        int result = root * 2 + 1;
        System.out.println("Результат :"+result);
    }
}