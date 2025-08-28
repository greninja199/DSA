package GauntletSession14;

import java.util.HashMap;

public class MinimumWindowSubstring76 {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
            return "";
        String minStr="";
        int l = Integer.MAX_VALUE;
        HashMap<Character, Integer> tMap = new HashMap<>();
        for(char ch:t.toCharArray()) {
            addCharToMap(tMap, ch);
        }
        HashMap<Character, Integer> sMap= new HashMap<>();
        int left = 0;
        int right = left;
        while(right<s.length() && left<s.length()){
            while(!mapMatcher(sMap,tMap) && right<s.length()){
                addCharToMap(sMap,s.charAt(right++));
            }
            while(mapMatcher(sMap,tMap)){
                removeCharFromMap(sMap,s.charAt(left++));
            }
            if(left>0)
                addCharToMap(sMap,s.charAt(--left));
            if(mapMatcher(sMap,tMap)){
                //System.out.println(s.substring(left,right)+":"+right+":"+left +":"+l);
                if(right-left<l) {
                    minStr = s.substring(left, right );
                    l = minStr.length();
                }
            }
            left++;
            if(left>0)
                removeCharFromMap(sMap,s.charAt(left-1));
        }
        return minStr;
    }

    private void removeCharFromMap(HashMap<Character, Integer> map, char ch) {
        if(map.get(ch)==1)
            map.remove(ch);
        else
            map.put(ch, map.get(ch)-1);
    }

    private boolean mapMatcher(HashMap<Character, Integer> sMap, HashMap<Character, Integer> tMap) {
        for(char ch : tMap.keySet()){
            if(sMap.containsKey(ch)){
                if(sMap.get(ch)<tMap.get(ch))
                    return false;
            }
            else
                return false;
        }
        return true;
    }

    private void addCharToMap(HashMap<Character, Integer> map, char ch) {
        if(!map.containsKey(ch))
            map.put(ch, 1);
        else
            map.put(ch, map.get(ch)+1);
    }
}
