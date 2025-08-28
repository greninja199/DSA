package GauntletSession14;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=0)
                if(nums[i]==nums[i-1])
                    continue;
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                /*
                if(nums[left]==nums[left-1]){
                    left++;
                    continue;
                }
                if(right!=nums.length-1){
                    if(nums[right]==nums[right+1]){
                        right--;
                        continue;
                    }
                }

                 */
                if(nums[i]+nums[left]+nums[right]==0){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if(nums[i]+nums[left]+nums[right]<0)
                    left++;
                else
                    right--;
            }
        }
        return new ArrayList<>(ans);
    }
}
