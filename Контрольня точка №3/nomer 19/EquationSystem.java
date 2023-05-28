public class EquationSystem {
    private static int func(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return func(n / 2);
        } else {
            return func(n / 2) + func(n / 2 + 1);
        }
    }

    public static void main(String[] args) {
        int result = func(10);
        System.out.println("Результат func(10) = " + result); // должен быть равен 3
    }
}