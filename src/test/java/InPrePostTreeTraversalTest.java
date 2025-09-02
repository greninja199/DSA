package test.java;

import BinaryTree17.InPrePostOrder1Iteration;
import BinaryTree17.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class InPrePostTreeTraversalTest {
    @Test
    public void testExampleCase() {
        Integer[] input = {1, 3, 4, 5, 2, 7, 6};
        TreeNode root = DatatreeBuilder.buildTree(input);

        InPrePostOrder1Iteration sol = new InPrePostOrder1Iteration();
        List<List<Integer>> result = sol.treeTraversal(root);

        assertEquals(Arrays.asList(1, 3, 5, 2, 4, 7, 6), result.get(0)); // Preorder
        assertEquals(Arrays.asList(5, 3, 2, 1, 7, 4, 6), result.get(1)); // Inorder
        assertEquals(Arrays.asList(5, 2, 3, 7, 6, 4, 1), result.get(2)); // Postorder
    }
}
