public class Pyramid {
    public static void main(String[] args) {
        int[][] pyramid = {{3}, {7, 4}, {2, 4, 6}, {8, 5, 9, 3}};
        int maxSum = countMaxSum(pyramid);
        System.out.println(maxSum);
    }

    public static int countMaxSum(int[][] pyramid) {
        for (int i = pyramid.length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                pyramid[i][j] += Math.max(pyramid[i + 1][j], pyramid[i + 1][j + 1]);
            }
        }

        return pyramid[0][0];
    }
}