import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);
            
        
            if (!map.containsKey(sorted)) {
                map.put(sorted, new LinkedList<String>());
            }
            
        
            map.get(sorted).add(s);
        }
        
        
        return new LinkedList<>(map.values());
    }
}
