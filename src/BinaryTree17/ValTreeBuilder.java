package BinaryTree17;


import BinaryTree15.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class ValTreeBuilder {
    public static TreeNode buildTree(Integer[] arr) {
        if(arr.length==0)
            return null;
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int index = 1;
        while(index<arr.length && !queue.isEmpty()){
            TreeNode curr = queue.poll();
            if(arr[index]!=null){
                curr.left = new TreeNode(arr[index]);
                queue.offer(curr.left);
            }
            index++;
            if(index< arr.length && arr[index]!=null){
                curr.right = new TreeNode(arr[index]);
                queue.offer(curr.right);
            }
            index++;
        }
        return root;
    }
}
