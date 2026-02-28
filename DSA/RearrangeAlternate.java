import java.util.*;

public class RearrangeAlternate {

    public static void rearrange(int[] arr) {
        int n = arr.length;

        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

       
        for (int num : arr) {
            if (num >= 0) {  
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }

       
        int i = 0, p = 0, neg = 0;

        while (p < positives.size() && neg < negatives.size()) {
            arr[i++] = positives.get(p++);
            arr[i++] = negatives.get(neg++);
        }

     
        while (p < positives.size()) {
            arr[i++] = positives.get(p++);
        }

      
        while (neg < negatives.size()) {
            arr[i++] = negatives.get(neg++);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        rearrange(arr);

        System.out.println(Arrays.toString(arr));
    }
}