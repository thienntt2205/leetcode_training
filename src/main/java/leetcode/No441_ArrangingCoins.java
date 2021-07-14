//https://leetcode.com/problems/arranging-coins/
package leetcode;

public class No441_ArrangingCoins {
    public int arrangeCoins(int n) {
        if (n < 1) {
            return 0;
        }
        for (int i = 1; ; i++) {
            n -= i;
            if (n < 0) {
                return i - 1;
            }

        }
    }
}
