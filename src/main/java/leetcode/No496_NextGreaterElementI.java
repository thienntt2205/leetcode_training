//https://leetcode.com/problems/next-greater-element-i/
package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class No496_NextGreaterElementI {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        int[] res = new int[findNums.length];
        for (int i = 0; i < findNums.length; i++) {
            res[i] = map.getOrDefault(findNums[i], -1);
        }
        return res;
    }
}
