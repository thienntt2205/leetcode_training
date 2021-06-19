package leetcode;

public class No108_ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return newNode(nums, 0, nums.length - 1);
    }

    private TreeNode newNode(int[] nums, int p1, int p2) {
        if (p1 == p2) {
            return new TreeNode(nums[p1]);
        }
        int mid = (p1 + p2 + 1) >> 1;
        return new TreeNode(nums[mid],
                p1 == mid ? null : newNode(nums, p1, mid - 1),
                p2 == mid ? null : newNode(nums, mid + 1, p2)
        );
    }
}
