package StacksAndQueueImplementation11;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> ngeMapper = new HashMap<>();
        Stack<Integer> ngeStack = new Stack<>();

        for(int i=nums2.length-1;i>=0;i--){
            while(!ngeStack.isEmpty() && ngeStack.peek()<=nums2[i]){
                ngeStack.pop();
            }
            if(ngeStack.isEmpty()){
                ngeStack.push(nums2[i]);
                ngeMapper.put(nums2[i],-1);
            }
            else{
                ngeMapper.put(nums2[i],ngeStack.peek());
                ngeStack.push(nums2[i]);
            }
        }

        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i] = ngeMapper.get(nums1[i]);
        }
        return result;
    }
}
