//https://leetcode.com/problems/power-of-two/
package leetcode;

public class No231_PowerOfTwo {
    public boolean isPowerOfTwo(int n) {//if n is power  of  2 ,n just has one bit is 1
        return n > 0 && (n & (n - 1)) == 0;
    }
}

