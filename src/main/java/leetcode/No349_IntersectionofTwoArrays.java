//https://leetcode.com/problems/intersection-of-two-arrays/
package leetcode;

import java.util.Arrays;

public class No349_IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int[] ans = new int[nums1.length];
        int idx = 0;
        for (int i : nums1) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        for (int i : nums2) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        boolean[] map = new boolean[max - min + 1];
        for (int i : nums1) map[i - min] = true;
        for (int i : nums2) {
            if (map[i - min]) {
                ans[idx++] = i;
                map[i - min] = false;
            }
        }
        return Arrays.copyOf(ans, idx);
    }
}
