public class InsertanElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int index = 2;
        int element = 99;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j++];
            }
        }

        for (int n : newArr)
            System.out.print(n + " ");
    }
}
