import java.util.Arrays;
public class MaxNumberProgram {
    public static void main(String[] args) {
        int[] numbers = {32, 23, 45, 67, 90, 12, 89};
        int max = numbers[0];
        int index = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                index = i;
            }
        }
        int[] leftNumbers = Arrays.copyOfRange(numbers, 0, index);
        int[] rightNumbers = Arrays.copyOfRange(numbers, index + 1, numbers.length);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Числа слева от максимума: " + Arrays.toString(leftNumbers));
        System.out.println("Числа справа от максимума: " + Arrays.toString(rightNumbers));
    }
}