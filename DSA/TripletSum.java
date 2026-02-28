import java.util.Arrays;

public class TripletSum {

    public static boolean hasTripletSum(int[] arr, int target) {
        Arrays.sort(arr); 

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    return true; 
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 22;

        if (hasTripletSum(arr, target)) {
            System.out.println("Triplet exists with sum " + target);
        } else {
            System.out.println("No triplet exists with sum " + target);
        }
    }
}