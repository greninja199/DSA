package BinaryTree15;

import java.util.ArrayList;
import java.util.List;

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
