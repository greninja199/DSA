package BinaryTree16;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Given root of binary tree, return the Inorder traversal of the binary tree.
Examples:
Input : root = [1, 4, null, 4, 2]
Output : [4, 4, 2, 1]
 */
public class BTInOrderTraversal94 {
    public List<Integer> inorder(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while(true){
            if(curr==null){
                if(st.isEmpty())
                    break;
                TreeNode node = st.pop();
                result.add(node.val);
                curr = node.right;
            }
            else{
                st.push(curr);
                curr = curr.left;
            }
        }
        return result;
    }
}
