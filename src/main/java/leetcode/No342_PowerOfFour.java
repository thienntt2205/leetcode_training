//https://leetcode.com/problems/power-of-four/
package leetcode;

public class No342_PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n == 0) return false;
        while (n != 1) {
            if (n % 4 != 0) return false;
            n = n / 4;
        }
        return true;
    }
}
