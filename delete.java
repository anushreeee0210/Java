public class delete {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 2;


        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            return;
        }

        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }

        for (int n : newArr) {
            System.out.print(n + " ");
        }
    }
}
