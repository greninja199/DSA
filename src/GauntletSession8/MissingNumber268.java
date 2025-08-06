package GauntletSession8;

/*
        int sums = 0;
        for(int i=0;i<nums.length;i++)
            sums+=nums[i];
        return (nums.length*(nums.length+1))/2 - sums;

         */
public class MissingNumber268 {
    public int missingNumber(int[] nums) {
        int result = nums.length;
        for(int i=0;i<nums.length;i++){
            result = result ^ i ^ nums[i];
        }
        return result;
    }
}
