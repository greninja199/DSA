package BinaryTree16;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BTPostOrder1Stack145 {
    public List<Integer> postorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        if(root==null)
            return result;
        TreeNode curr = root;
        while(curr!=null || !stack.isEmpty()){
            if(curr!=null){
                 stack.push(curr);
                 curr = curr.left;
            }
            else{
                TreeNode temp = stack.peek().right;

            }
        }
        return result;
    }
}
