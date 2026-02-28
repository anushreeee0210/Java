import java.util.*;

public class LongestConsecutiveSubsequence {
    public static int longestConsecutiveSubsequence(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int maxLen = 0;
        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int length = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    length++;
                }
                maxLen = Math.max(maxLen, length);
            }
        }

        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 10, 4, 20, 2};
        System.out.println("Length of Longest Consecutive Subsequence: " + 
                            longestConsecutiveSubsequence(arr));
    }
}