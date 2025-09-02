package Day1_10.HashMapAndHashSet;

import java.util.*;

public class GroupAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> anagrams = new HashMap<>();
        for(String s:strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String st = new String(temp);
            if(anagrams.containsKey(st))
                anagrams.get(st).add(s);
            else
                anagrams.put(st,new ArrayList<String>(){{add(s);}});
        }
        return new ArrayList<>(anagrams.values());
    }
}
