package BinaryTree17;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InPrePostOrder1Iteration {
    List<List<Integer>> treeTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> preOrder = new ArrayList<>();
        List<Integer> postOrder = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();
        Stack<TreeNode> nodeStack = new Stack<>();

        nodeStack.push(root);
        stack.push(1);
        while(!nodeStack.isEmpty()){
            while(stack.peek()==1){
                preOrder.add(nodeStack.peek().data);
                stack.pop();
                stack.push(2);
                if(nodeStack.peek().left!=null){
                    nodeStack.push(nodeStack.peek().left);
                    stack.push(1);
                }
            }
            if(stack.peek()==2){
                inOrder.add(nodeStack.peek().data);
                stack.pop();
                stack.push(3);
                if(nodeStack.peek().right!=null){
                    nodeStack.push(nodeStack.peek().right);
                    stack.push(1);
                }
            }
            if(stack.peek()==3){
                postOrder.add(nodeStack.peek().data);
                nodeStack.pop();
                stack.pop();
            }
        }
        result.add(preOrder);
        result.add(inOrder);
        result.add(postOrder);
        return result;
    }
}
