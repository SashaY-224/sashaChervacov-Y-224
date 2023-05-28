import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = input.nextLine();
        System.out.print("Введите число сдвига: ");
        int shift = input.nextInt();
        System.out.print("Введите направление (l - влево, r - вправо): ");
        char direction = input.next().charAt(0);
        String result = caesarCipher(text, shift, direction);
        System.out.println("Результат шифрования: " + result);
    }
    public static String caesarCipher(String text, int shift, char direction) {
        String result = "";
        if (direction == 'l') {
            shift = 33 - shift;
        }
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    result += (char) ('А' + (c - 'А' + shift) % 33);
                } else {
                    result += (char) ('а' + (c - 'а' + shift) % 33);
                }
            } else {
                result += c;
            }
        }
        return result;
    }
}