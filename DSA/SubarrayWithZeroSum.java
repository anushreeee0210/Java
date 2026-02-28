import java.util.*;

public class SubarrayWithZeroSum {

    public static boolean hasZeroSumSubarray(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int prefixSum = 0;

        for (int num : arr) {
            prefixSum += num;


            if (prefixSum == 0)
                return true;

           
            if (set.contains(prefixSum))
                return true;

            set.add(prefixSum);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        System.out.println(hasZeroSumSubarray(arr));
    }
}