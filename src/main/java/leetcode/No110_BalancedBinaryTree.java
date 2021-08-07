//https://leetcode.com/problems/balanced-binary-tree/
package leetcode;

public class No110_BalancedBinaryTree {
    private boolean result = true;

    public boolean isBalanced(TreeNode root) {
        No104_MaximumDepthOfBinaryTree.maxDepth(root);
        return result;
    }
}
