package Day1_10.AdvancedArraysAndStrings3;

public class SquaresOfASortedArray977 {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int[] result = new int[nums.length];
        for(int i= nums.length-1;i>=0;i--){
            if(nums[left]*nums[left] < nums[right]*nums[right]){
                result[i] = nums[right]*nums[right--];
            }
            else{
                result[i]=nums[left]*nums[left++];
            }
        }
        return result;
    }
}
