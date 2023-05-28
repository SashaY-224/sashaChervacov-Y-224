import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String s = input.nextLine();
            String longestPalindrome = findLongestPalindrome(s);
            System.out.println("Длинейший палиндром в строке: " + longestPalindrome);
        }

        public static String findLongestPalindrome(@NotNull String s) {
            int n = s.length();
            String longestPalindrome = "";
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    String substring = s.substring(i, j);
                    if (isPalindrome(substring) && substring.length() > longestPalindrome.length()) {
                        longestPalindrome = substring;
                    }
                }
            }
            return longestPalindrome;
        }

        public static boolean isPalindrome(@NotNull String s) {
            int n = s.length();

            for (int i = 0; i < n / 2; i++) {
                if (s.charAt(i) != s.charAt(n - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }
