public class InversionCount {

    public static long inversionCount(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static long mergeSort(int[] arr, int left, int right) {
        long count = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;

            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);
            count += merge(arr, left, mid, right);
        }
        return count;
    }

    private static long merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        long count = 0;
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                count += (n1 - i);  
            }
        }

        while (i < n1)
            arr[k++] = leftArr[i++];

        while (j < n2)
            arr[k++] = rightArr[j++];

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println("Inversion Count: " + inversionCount(arr));
    }
}