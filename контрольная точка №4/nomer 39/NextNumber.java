import java.util.Arrays;

public class NextNumber {
    public static void main(String[] args) {
        int number = 532;
        int result = getNextNumber(number);
        System.out.println(result);
    }

    public static int getNextNumber(int number) {
        int[] digits = Integer.toString(number).chars().map(c -> c - '0').toArray();
        int n = digits.length;

        int i = n - 1;
        while (i > 0 && digits[i - 1] >= digits[i]) {
            i--;
        }
        if (i == 0) {
            return -1;
        }

        int j = n - 1;
        while (digits[j] <= digits[i - 1]) {
            j--;
        }

        int temp = digits[i - 1];
        digits[i - 1] = digits[j];
        digits[j] = temp;

        Arrays.sort(digits, i, n);

        int nextNumber = Integer.parseInt(Arrays.toString(digits).replaceAll("[^\\d]", ""));
        return nextNumber;
    }
}