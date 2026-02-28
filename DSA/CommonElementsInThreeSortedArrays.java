import java.util.*;

public class CommonElementsInThreeSortedArrays {

    public static List<Integer> commonElements(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new ArrayList<>();
        
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {

            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                result.add(arr1[i]);

                int val = arr1[i];

                while (i < arr1.length && arr1[i] == val) i++;
                while (j < arr2.length && arr2[j] == val) j++;
                while (k < arr3.length && arr3[k] == val) k++;
            }
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr2[j] < arr3[k]) {
                j++;
            }
            else {
                k++;
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 5};
        int[] arr2 = {3, 4, 5, 5, 10};
        int[] arr3 = {5, 5, 10, 20};

        List<Integer> ans = commonElements(arr1, arr2, arr3);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}