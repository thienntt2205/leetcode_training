//https://leetcode.com/problems/hamming-distance/
package leetcode;

public class No461_HammingDistance {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y, count = 0;

        while (xor != 0) {
            xor &= (xor - 1);
            count++;
        }
        return count;
    }
}
