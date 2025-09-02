package Day1_10.AdvancedArraysAndStrings5;

/*
for(int i=1;i<s.length();i++) {
    int left;
    int right = i + 1;
    if (right < s.length()) {
        left = i - 1;
        right = i + 1;
        while (s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            if (left <= 0 || right > s.length() - 1)
                break;
        }
        if ((right - left - 1) > maxLength) {
            maxLength = right - left - 1;
            maxStart = left + 1;
            System.out.println("A : "+maxLength+","+maxStart+","+s.substring(maxStart,maxStart+maxLength));
        }
    }
    left = i - 1;
    right = i;
    while (s.charAt(left) == s.charAt(right)) {
        left--;
        right++;
        if (left <= 0 || right > s.length() - 1)
            break;
    }
    if ((right - left - 1) > maxLength) {
        maxLength = right - left -1;
        maxStart = left + 1;
        System.out.println("B : "+maxLength+","+maxStart+","+s.substring(maxStart,maxStart+maxLength));
    }
}

 */
public class LongestPalindromicSubstring5 {
    int maxStart=0;
    int maxLength=1;
    public void checkPalindrome(String s, int left, int right){
        while(left>=0 && right<s.length()){
            if(s.charAt(left)!=s.charAt(right))
                break;
            left--;
            right++;
        }
        if(maxLength<(right-left-1)){
            maxLength=right-left-1;
            maxStart=left+1;
        }
    }
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        for(int i=0;i<s.length();i++){
            checkPalindrome(s,i-1,i+1);
            checkPalindrome(s,i,i+1);
        }
        return s.substring(maxStart,maxStart+maxLength);
    }
}
