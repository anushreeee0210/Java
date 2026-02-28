import java.util.Arrays;

public class ChocolateDistribution {

    public static int minDifference(int[] arr, int m) {
        int n = arr.length;
        if (m == 0 || n == 0 || m > n) return -1;
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= n - m; i++) {
            int diff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int[] arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;
        System.out.println("Minimum difference: " + minDifference(arr, m));
    }
}