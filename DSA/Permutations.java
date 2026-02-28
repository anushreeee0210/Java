import java.util.*;

public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, result, 0);
        return result;
    }

    private static void backtrack(int[] nums, List<List<Integer>> result, int start) {
        if (start == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            result.add(temp);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            backtrack(nums, result, start + 1);
            swap(nums, start, i); // backtrack
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> permutations = permute(arr);

        for (List<Integer> p : permutations) {
            System.out.println(p);
        }
    }
}