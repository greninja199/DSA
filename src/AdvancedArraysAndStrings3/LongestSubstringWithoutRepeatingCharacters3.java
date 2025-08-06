package AdvancedArraysAndStrings3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1)
            return s.length();
        int maxLength=1;
        int left = 0;
        int right = 1;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        hashMap.put(s.charAt(left),left);
        while(right<s.length()){
            if(hashMap.containsKey(s.charAt(right)) && hashMap.get(s.charAt(right))>=left){
                if((right-left)>maxLength)
                    maxLength=(right-left);
                left = hashMap.get(s.charAt(right))+1;
            }
            hashMap.put(s.charAt(right),right);
            right++;
        }
        return Math.max(maxLength,right-left+1);
    }
}
