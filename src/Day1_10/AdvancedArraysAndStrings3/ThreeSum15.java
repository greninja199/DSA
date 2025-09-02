package Day1_10.AdvancedArraysAndStrings3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i!=0)
                if(nums[i]==nums[i-1])
                    continue;
            List<Integer> temp = new ArrayList<>();
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                if(nums[i]+nums[left]+nums[right]==0){
                    result.add(Arrays.asList(nums[i],nums[left++],nums[right--]));
                    while(left<nums.length && nums[left]==nums[left-1])
                        left++;
                    while(right>0 && nums[right]==nums[right+1])
                        right--;
                }
                else if(nums[i]+nums[left]+nums[right]<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }
}
