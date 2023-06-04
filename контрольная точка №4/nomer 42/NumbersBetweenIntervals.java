import java.util.ArrayList;

public class NumbersBetweenIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,2}, {6,10}, {11,15}};
        int count = countNumbersBetweenIntervals(intervals);
        System.out.println(count);
    }

    public static int countNumbersBetweenIntervals(int[][] intervals) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                if (!numbers.contains(j)) {
                    numbers.add(j);
                }
            }
        }

        return numbers.size();
    }
}
