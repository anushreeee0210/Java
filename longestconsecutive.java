import java.util.HashSet;
public class longestconsecutive {
    public static void main(String[] args) {
        int[] arr = {1, 500, 4, 3, 5, 2};

        HashSet<Integer> set = new HashSet<>();
        for (int n : arr) set.add(n);

        int longest = 0;

        for (int n : set) {
            if (!set.contains(n - 1)) {
                int len = 1;
                while (set.contains(n + len)) len++;
                longest = Math.max(longest, len);
            }
        }

        System.out.println(longest);
    }
}
