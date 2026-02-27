public class MergeWithoutExtraSpace {

    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int gap = nextGap(n + m);

        while (gap > 0) {

            int i = 0;
            int j = gap;

            while (j < (n + m)) {

                if (i < n && j < n) {
                    if (arr1[i] > arr1[j]) {
                        swap(arr1, i, j);
                    }
                }
                else if (i < n && j >= n) {
                    if (arr1[i] > arr2[j - n]) {
                        int temp = arr1[i];
                        arr1[i] = arr2[j - n];
                        arr2[j - n] = temp;
                    }
                }
                else {
                    if (arr2[i - n] > arr2[j - n]) {
                        swap(arr2, i - n, j - n);
                    }
                }

                i++;
                j++;
            }

            gap = nextGap(gap);
        }
    }

    private static int nextGap(int gap) {
        if (gap <= 1)
            return 0;
        return (gap / 2) + (gap % 2);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};

        merge(arr1, arr2);

        System.out.print("Merged Array 1: ");
        for (int num : arr1) System.out.print(num + " ");

        System.out.print("\nMerged Array 2: ");
        for (int num : arr2) System.out.print(num + " ");
    }
}