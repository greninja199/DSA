package AdvancedArraysAndStrings5;

import java.util.HashMap;
/*
    public boolean checkOccurrence(HashMap<Character,Integer> sMap, HashMap<Character,Integer> tMap){
        for(Character ch:tMap.keySet()){
            if(!(sMap.containsKey(ch) && sMap.get(ch)>=tMap.get(ch)))
                return false;
        }
        return true;
    }
    public void insertElement(HashMap<Character,Integer> map, Character key){
        if(map.containsKey(key))
            map.put(key, map.get(key)+1);
        else
            map.put(key,1);
    }
    public void removeElement(HashMap<Character,Integer> map, Character key){
        if(map.containsKey(key)) {
            map.put(key, map.get(key) - 1);
            if(map.get(key)==0)
                map.remove(key);
        }
    }
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
            return "";
        HashMap<Character,Integer> tMap = new HashMap<>();
        HashMap<Character,Integer> sMap = new HashMap<>();
        for(char ch:t.toCharArray())
            insertElement(tMap,ch);

        int minLength = Integer.MAX_VALUE;
        int minLeft = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;

        while(right<s.length()){
            insertElement(sMap,s.charAt(right));
            if(checkOccurrence(sMap,tMap)){
                while(checkOccurrence(sMap,tMap)){
                    removeElement(sMap,s.charAt(left));
                    left++;
                }
                left--;
                insertElement(sMap,s.charAt(left));
                if((right-left+1)<minLength){
                    minLength = right-left+1;
                    minLeft = left;
                }
                removeElement(sMap,s.charAt(left));
                System.out.println("(l,r): ("+left+","+right+")");
                left++;
            }
            right++;
        }
        System.out.println(minLeft+"<>"+(minLength));
        if(minLength==Integer.MAX_VALUE)
            return "";
        return s.substring(minLeft,minLeft+minLength);
    }

     */
public class MinimumWindowSubstring76  {

    public void insertElement(HashMap<Character,Integer> map, Character key){
        if(map.containsKey(key))
            map.put(key, map.get(key)+1);
        else
            map.put(key,1);
    }
    public void removeElement(HashMap<Character,Integer> map, Character key){
        if(map.containsKey(key)) {
            map.put(key, map.get(key) - 1);
            if(map.get(key)==0)
                map.remove(key);
        }
    }
    public String minWindow(String s, String t) {
        int have = 0;
        int need = 0;
        HashMap<Character,Integer> tMap = new HashMap<>();
        HashMap<Character,Integer> sMap = new HashMap<>();

        for(char ch:t.toCharArray())
            insertElement(tMap,ch);

        need = tMap.size();
        int left = 0;
        int minLeft= s.length();
        int minLength= s.length();

        for(int right=0;right<s.length();right++){
            insertElement(sMap,s.charAt(right));
            if(tMap.containsKey(s.charAt(right)))
                if(tMap.get(s.charAt(right)).equals(sMap.get(s.charAt(right))))
                    have++;
            if(have==need){
                while(have==need){
                    removeElement(sMap,s.charAt(left));
                    if(tMap.containsKey(s.charAt(left)))
                        if(sMap.get(s.charAt(left))<tMap.get(s.charAt(left)))
                            have--;
                }
                insertElement(sMap,s.charAt(left));
                if(minLength>right-left+1){
                    minLength = right-left+1;
                    minLeft = left;
                }
                removeElement(sMap,s.charAt(left++));
                have--;
            }
            right++;
        }
        return s.substring(minLeft,minLeft+minLength);
    }
}