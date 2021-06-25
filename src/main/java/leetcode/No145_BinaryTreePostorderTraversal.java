package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/
public class No145_BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();

        if (root == null)
            return res;

        Stack<TreeNode> stk1 = new Stack<TreeNode>();
        Stack<TreeNode> stk2 = new Stack<TreeNode>();

        stk1.push(root);

        while (!stk1.isEmpty()) {
            TreeNode node = stk1.pop();
            stk2.push(node);

            if (node.left != null) {
                stk1.push(node.left);
            }
            if (node.right != null) {
                stk1.push(node.right);
            }
        }
        while (!stk2.isEmpty())
            res.add(stk2.pop().val);

        return res;
    }

}
