package Day1_10.BitwiseManipulation7;

public class SingleNumber136 {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++)
            result = result ^ nums[i];
        return result;
    }
}
