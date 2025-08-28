package BinaryTree15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
 */

public class BinaryTreeLevelOrderTraversal102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> res = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> sub = new ArrayList<>();
            int cap = queue.size();

            for(int i=0;i<cap;i++){
                TreeNode temp = queue.poll();
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);
                sub.add(temp.val);
            }
            res.add(sub);
        }
        return res;
    }
}
