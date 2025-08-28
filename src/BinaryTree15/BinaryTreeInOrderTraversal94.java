package BinaryTree15;

import java.util.ArrayList;
import java.util.List;

/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.
Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]
 */
public class BinaryTreeInOrderTraversal94 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return result;
    }
    public void inOrder(TreeNode root){
        if(root==null)
            return ;
        inOrder(root.left);
        result.add(root.val);
        inOrder(root.right);
    }
}
