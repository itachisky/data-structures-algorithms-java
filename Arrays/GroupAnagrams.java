package Arrays;
import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0 ) return new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();

        for (String str: strs) {
            char[] ca = str.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!mp.containsKey(key)) {
                mp.put(key, new ArrayList<>());
            }
            mp.get(key).add(str);
        }

        return new ArrayList<>(mp.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}