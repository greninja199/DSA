package BinaryTree16;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Given root of binary tree, return the Postorder traversal of the binary tree.
Examples:
Input : root = [1, 4, null, 4, 2]
Output : [4, 2, 4, 1]
 */
public class BTPostOrderIterative145 {
    public List<Integer> postorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null)
            return result;
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            TreeNode temp = st1.pop();
            if(temp.left!=null)
                st1.push(temp.left);
            if(temp.right!=null)
                st1.push(temp.right);
            st2.push(temp);
        }
        while(!st2.isEmpty()){
            result.add(st2.pop().val);
        }
        return result;
    }
}
