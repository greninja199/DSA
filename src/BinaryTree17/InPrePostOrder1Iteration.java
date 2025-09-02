package BinaryTree17;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/*
Given a binary tree with root node. Return the In-order,Pre-order and Post-order traversal of the binary tree.
Examples:
Input : root = [1, 3, 4, 5, 2, 7, 6 ]
Output : [ [5, 3, 2, 1, 7, 4, 6] , [1, 3, 5, 2, 4, 7, 6] , [5, 2, 3, 7, 6, 4, 1] ]
Explanation : The In-order traversal is [5, 3, 2, 1, 7, 4, 6].
The Pre-order traversal is [1, 3, 5, 2, 4, 7, 6].
The Post-order traversal is [5, 2, 3, 7, 6, 4, 1].
 */

public class InPrePostOrder1Iteration {
    public List<List<Integer>> treeTraversal(TreeNode root) {
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
