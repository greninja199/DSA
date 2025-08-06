package AdvancedArraysAndStrings4;

public class ProductOfArrayExceptSelf238 {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0]=1;
        for(int i=1;i<nums.length;i++)
            result[i] = result[i - 1] * nums[i - 1];
        int temp=1;
        for(int i=nums.length-2;i>=0;i--) {
            temp *= nums[i+1];
            result[i] = result[i]*temp;
        }
        return result;
    }
}
