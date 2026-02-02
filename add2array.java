import java.util.Arrays;

public class add2array {
    public static void main(String[] args) {

        int[] a = {1, 3, 5, 7};
        int[] b = {2, 3, 6, 7, 8};

        int[] merged = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                merged[k++] = a[i++];
            } else if (a[i] > b[j]) {
                merged[k++] = b[j++];
            } else {
                merged[k++] = a[i++];
                j++;
            }
        }

        while (i < a.length) merged[k++] = a[i++];
        while (j < b.length) merged[k++] = b[j++];

        int[] result = Arrays.copyOf(merged, k);

        System.out.println(Arrays.toString(result));
    }
}
