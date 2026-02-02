public class merge {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int[] merged = new int[a.length + b.length];

        int k = 0;

        for (int i = 0; i < a.length; i++) {
            merged[k++] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            merged[k++] = b[i];
        }

        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
