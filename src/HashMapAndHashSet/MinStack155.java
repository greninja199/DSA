package HashMapAndHashSet;

import java.util.Stack;

public class MinStack155 {

    Stack<Integer> valueStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack155() {}

    public void push(int val) {
        if(valueStack.isEmpty()){
            valueStack.push(val);
            minStack.push(val);
        }
        else{
            valueStack.push(val);
            minStack.push(Math.min(val,minStack.peek()));
        }
    }

    public void pop() {
        valueStack.pop();
        minStack.pop();
    }

    public int top() {
        return valueStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
