package Day1_10.GauntletSession8;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] maxArray = new int[nums.length-k+1];
        Deque<Integer> q = new LinkedList<>();
        q.offer(nums[0]);
        for(int i=1;i<k;i++){
            while(!q.isEmpty() && q.peekLast()<nums[i]){
                q.pollLast();
            }
            q.addLast(nums[i]);
        }
        maxArray[0] = q.peekLast();

        for(int i=1;i<nums.length-k+1;i++){
            while(!q.isEmpty() && q.peekLast()<nums[i])
                q.pollLast();
            q.addLast(nums[i]);
        }
        return maxArray;
    }
}
