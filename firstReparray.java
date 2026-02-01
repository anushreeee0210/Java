public class firstReparray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5};

        int repeated = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                repeated = arr[i];
                break;
            }
        }

        if (repeated != -1) {
            System.out.println("First repeated number: " + repeated);
        } else {
            System.out.println("No repeated number");
        }
    }
}
