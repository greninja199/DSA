package Day1_10.GauntletSession8;

public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        int mArea = 0;
        int left = 0;
        int right = height.length-1;

        while(left<right){
            int min = Math.min(height[left],height[right]);
            if(mArea<min*(right-left))
                mArea = min*(right-left);
            if(min==height[left])
                left++;
            else
                right--;
        }
        return mArea;
    }
}