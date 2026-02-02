public class deleteelement {
    public static void main(String[] args) {

        int[] arr = {2, 7, 3, 8, 6};
        int indexToRemove = 2; 

        for (int i = indexToRemove; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
