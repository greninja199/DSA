package Day1_10.HashMapAndHashSet;

import java.util.HashMap;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!numsMap.isEmpty())
                if(numsMap.containsKey(target-nums[i]))
                    return new int[]{i,numsMap.get(target-nums[i])};
            numsMap.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }

}
