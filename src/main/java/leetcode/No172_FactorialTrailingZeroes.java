//https://leetcode.com/problems/factorial-trailing-zeroes/
package leetcode;

public class No172_FactorialTrailingZeroes {
    public int traillingZero(int number) {
        int s = 0;
        while (number > 4) {
            s += (number /= 5);
        }
        return s;
    }


}
