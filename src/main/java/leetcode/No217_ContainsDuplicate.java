//https://leetcode.com/problems/contains-duplicate/
package leetcode;

import java.util.HashSet;
import java.util.Set;

public class No217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        return nums.length != 0 && set.size() != nums.length;
    }
}
