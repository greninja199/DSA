package BinaryTree16;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BTPreOrderIterative144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        List<Integer> result = new ArrayList<>();
        while(!st.isEmpty()){
            TreeNode temp = st.pop();
            if(temp.right!=null)
                st.push(temp.right);
            if(temp.left!=null)
                st.push(temp.left);
            result.add(temp.val);
        }
        return result;
    }
}
