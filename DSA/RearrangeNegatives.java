public class RearrangeNegatives {

    public static void rearrange(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            // Move left pointer if element is negative
            if (arr[left] < 0) {
                left++;
            }
            // Move right pointer if element is positive
            else if (arr[right] > 0) {
                right--;
            }
            // Swap positive at left with negative at right
            else {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4, 5, -6, 7, -8 };

        rearrange(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}