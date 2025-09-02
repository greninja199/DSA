package Day1_10.AdvancedArraysAndStrings5;

public class LongestCommonPrefix14  {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        String minString="";
        int minLength=Integer.MAX_VALUE;
        for(String s:strs) {
            if (s.length() < minLength) {
                minString = s;
                minLength=s.length();
            }
        }
        for(String s:strs){
            while(!s.startsWith(minString.substring(0,minLength))){
            //while(!s.substring(0,minLength).equals(minString.substring(0,minLength))){
                minLength--;
            }
        }
        return minString.substring(0,minLength);
    }
}