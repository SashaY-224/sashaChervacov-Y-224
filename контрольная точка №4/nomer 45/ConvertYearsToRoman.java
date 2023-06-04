public class ConvertYearsToRoman {
    public static void main(String[] args) {
        int years = 14;
        String romanYears = convertToRoman(years);
        System.out.println(years + " год(а/лет) в римской системе числения: " + romanYears);
    }

    public static String convertToRoman(int years) {
        if (years <= 0 || years > 9999) {
            throw new IllegalArgumentException("Invalid input: years must be in range 1 to 9999");
        }

        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String romanThousands = thousands[years / 1000];
        String romanHundreds = hundreds[(years % 1000) / 100];
        String romanTens = tens[(years % 100) / 10];
        String romanOnes = ones[years % 10];

        return romanThousands + romanHundreds + romanTens + romanOnes;
    }
}