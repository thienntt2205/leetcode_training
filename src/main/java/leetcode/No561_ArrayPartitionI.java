//https://leetcode.com/problems/array-partition-i/
package leetcode;

import java.util.Arrays;

public class No561_ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }
}
