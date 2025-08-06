package StacksAndQueueImplementation11;

import java.util.Stack;

public class DailyTemperature739 {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> monotonicStack = new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i= temperatures.length-1;i>=0;i--){
            while(!monotonicStack.isEmpty() && temperatures[monotonicStack.peek()]<=temperatures[i]){
                monotonicStack.pop();
            }
            if(monotonicStack.isEmpty()){
                monotonicStack.push(i);
                result[i]=0;
            }
            else{
                result[i]=monotonicStack.peek()-i;
                monotonicStack.push(i);
            }
        }
        return result;
    }
}