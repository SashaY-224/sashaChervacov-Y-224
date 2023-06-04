import java.util.ArrayList;
import java.util.List;

public class Ranges {
    public static void main(String[] args) {
        int[] arr = {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        String ranges = getRanges(arr);
        System.out.println(ranges);
    }

    public static String getRanges(int[] arr) {
        if (arr == null || arr.length == 0) {
            return "";
        }

        List<String> list = new ArrayList<>();
        int prev = arr[0];
        int start = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == prev + 1) {
                prev = arr[i];
            } else {
                if (start == prev) {
                    list.add(Integer.toString(start));
                } else {
                    list.add(start + "-" + prev);
                }
                start = arr[i];
                prev = arr[i];
            }
        }

        if (start == prev) {
            list.add(Integer.toString(start));
        } else {
            list.add(start + "-" + prev);
        }

        String ranges = String.join(",", list);
        return ranges;
    }
}