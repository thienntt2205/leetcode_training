//https://leetcode.com/problems/maximum-depth-of-binary-tree/
package leetcode;

public class No104_MaximumDepthOfBinaryTree {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
