import java.util.*;

public class ZeroSumPairs {

    public static List<List<Integer>> findPairs(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (arr == null || arr.length < 2)
            return result;

        Arrays.sort(arr); 
        
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == 0) {
                result.add(Arrays.asList(arr[left], arr[right]));
                
                left++;
                right--;

    
                while (left < right && arr[left] == arr[left - 1])
                    left++;
                while (left < right && arr[right] == arr[right + 1])
                    right--;
            } 
            else if (sum < 0) {
                left++;
            } 
            else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, -2, 3, -3, 4, -4, 2};
        List<List<Integer>> pairs = findPairs(arr);

        for (List<Integer> pair : pairs) {
            System.out.println(pair);
        }
    }
}