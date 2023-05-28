import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число M:");
        int m = input.nextInt();
        System.out.print("Введите число N:");
        int n = input.nextInt();
        System.out.print("Введите сколько будет делителей: ");
        int k = input.nextInt();
        int[] divisors = new int[k];
        System.out.println("Введите делители:");
        for (int i = 0; i < k; i++) {
            divisors[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = m; i <= n; i++) {
            for (int j = 0; j < k; j++) {
                if (i % divisors[j] == 0) {
                    sum += i;
                    break;
                }
            }
        }
        System.out.println("Сумма чисел, делящихся на один из делителей: " + sum);
    }
}

