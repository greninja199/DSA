package ArrayAndArrayList;

public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        /*
        int zeroP = 0;
        int NonZeroP = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroP = i;
                int j;
                for(j=NonZeroP+1;j< nums.length;j++){
                    if(nums[j]!=0){
                        NonZeroP = j;
                        break;
                    }
                }
                if(j==nums.length)
                    return;
                nums[zeroP] = nums[NonZeroP];
                nums[NonZeroP] = 0;
            }
        }

         */

        if(nums.length==0)
            return;

        int zerPos = 0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]!=0)
                nums[zerPos++] = nums[i];
        for(;zerPos< nums.length;zerPos++)
            nums[zerPos]=0;
    }
}
