package Arrays;
import java.util.*;

public class DuplicateElement {
    static boolean Duplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet();

        for (int i = 0; i < nums.length; i++) {
            if (hs.contains(nums[i])) {
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        boolean result = Duplicate(arr);
        System.out.println(result);
    }
}
