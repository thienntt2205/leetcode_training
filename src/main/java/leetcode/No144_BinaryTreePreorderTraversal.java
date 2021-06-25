package leetcode;


import java.util.*;

public class No144_BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();

        Stack<TreeNode> stk = new Stack();
        while (!stk.isEmpty() || root != null) {
            while (root != null) {
                result.add(root.val);
                stk.push(root);
                root = root.left;
            }
            TreeNode popped = stk.pop();
            root = popped.right;
        }

        return result;

    }

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
