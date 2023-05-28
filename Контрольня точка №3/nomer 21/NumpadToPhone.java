import java.util.HashMap;
public class NumpadToPhone {
    private static final HashMap<Character, Character> keypadMap = new HashMap<>();
    static {
        keypadMap.put('1', 'w');
        keypadMap.put('2', 'a');
        keypadMap.put('3', 'd');
        keypadMap.put('4', 'g');
        keypadMap.put('5', 'j');
        keypadMap.put('6', 'm');
        keypadMap.put('7', '1');
        keypadMap.put('8', '2');
        keypadMap.put('9', '3');
        keypadMap.put('0', ' ');
    }
    public static String numpadToPhone(String numbers) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length(); i++) {
            char c = numbers.charAt(i);
            if (keypadMap.containsKey(c)) {
                result.append(keypadMap.get(c));
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String numbers = "789";
        String phone = numpadToPhone(numbers);
        System.out.println(phone);
    }
}