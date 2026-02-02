import java.util.Arrays;
import java.util.HashSet;

public class remove  {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);

        int[] unique = new int[set.size()];
        int i = 0;
        for (int num : set) unique[i++] = num;

        System.out.println(Arrays.toString(unique));
    }
}

    
}
