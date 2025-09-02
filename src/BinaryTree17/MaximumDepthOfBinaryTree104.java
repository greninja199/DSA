package BinaryTree17;
import BinaryTree15.TreeNode;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthOfBinaryTree104 {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    @Test
    public void testExample(){
        Integer[] arr = new Integer[]{3,9,20,null,null,15,7};
        TreeNode root = ValTreeBuilder.buildTree(arr);
        assertEquals(3,maxDepth(root));
    }
}
