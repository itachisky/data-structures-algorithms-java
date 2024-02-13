package Arrays;
import java.util.*;

public class AnagramChecker {
    public static boolean isAnagram(String s, String t) {
        String s1 = s.replaceAll("\\s", "").toLowerCase();
        String t1 = t.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != t1.length()) {
            return false;
        }

        Map<Character, Integer> hm = new HashMap<>();

        for (char c : s1.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (char c : t1.toCharArray()) {
            if (!hm.containsKey(c)) {
                return false;
            }

            int updatedCount = hm.get(c) - 1;
            if (updatedCount == 0) {
                hm.remove(c);
            } else {
                hm.put(c, updatedCount);
            }
        }
        return hm.isEmpty();
    }

    public static void main(String[] args) {
        String s = "dog";
        String t = "god";
        boolean result = isAnagram(s, t);
        System.out.println(result);
    }
}
