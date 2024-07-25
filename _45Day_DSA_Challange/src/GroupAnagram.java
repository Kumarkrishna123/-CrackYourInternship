package String;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {

        int n = strs.length;
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        if(strs == null || strs.length == 0) return result;
        for (int i = 0; i < n; i++) {
            char[] t = strs[i].toCharArray();
            Arrays.sort(t);
            String temp = new String(t);
            if (!map.containsKey(temp))
                map.put(temp, new LinkedList<String>());
            map.get(temp).add(strs[i]);
        }
        result.addAll(map.values());
        return result;

    }

}
