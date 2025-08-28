package BinaryTree15;

import java.util.ArrayList;
import java.util.List;

/*
Given the root of a binary tree, return the postorder traversal of its nodes' values.
Example 1:
Input: root = [1,null,2,3]
Output: [3,2,1]
 */
public class BinaryTreePostOrderTraversal145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrder(root,result);
        return result;
    }

    private void postOrder(TreeNode root, List<Integer> result) {
        if(root==null)
            return;
        postOrder(root.left,result);
        postOrder(root.right,result);
        result.add(root.val);
    }
}
