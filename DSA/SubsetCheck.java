import java.util.*;
public class SubsetCheck {
    public static boolean isSubset(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();  
        for (int num : a) {
            set.add(num);
        }
        for (int num : b) {
            if (!set.contains(num)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = {11, 3, 7, 1};
        if (isSubset(a, b)) {
            System.out.println("b[] is a subset of a[]");
        } else {
            System.out.println("b[] is NOT a subset of a[]");
        }
    }
}