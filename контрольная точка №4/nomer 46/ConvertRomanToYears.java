import java.util.HashMap;
import java.util.Map;

public class ConvertRomanToYears {
    public static void main(String[] args) {
        String romanYears = "MMCDLXXXIX";
        int years = convertToYears(romanYears);
        System.out.println(romanYears + " в арабской системе числения: " + years + " год(а/лет)");
    }

    public static int convertToYears(String romanYears) {
        if (romanYears == null || romanYears.isEmpty()) {
            throw new IllegalArgumentException("Invalid input: romanYears must not be empty");
        }

        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prev = 0;

        for (int i = romanYears.length() - 1; i >= 0; i--) {
            char c = romanYears.charAt(i);
            int current = romanMap.get(c);

            if (current < prev) {
                result -= current;
            } else {
                result += current;
            }

            prev = current;
        }

        return result;
    }
}