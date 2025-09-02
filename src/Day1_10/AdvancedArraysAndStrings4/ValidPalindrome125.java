package Day1_10.AdvancedArraysAndStrings4;

public class ValidPalindrome125 {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();

        int left=0;
        int right=s.length()-1;

        while(left<right){
            while(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                if(left>=right)
                    return true;
            }
            while(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                if(left>=right)
                    return true;
            }
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else
                return false;
        }
        return true;
    }
}
