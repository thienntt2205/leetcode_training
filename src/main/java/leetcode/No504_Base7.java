//https://leetcode.com/problems/base-7/
package leetcode;

public class No504_Base7 {
    public String convertTo7(int num) {
        if (num == 0) {
            return "0";
        }
        String res = "";
        boolean isNeg = num < 0;
        while (num != 0) {
            res = Math.abs((num % 7)) + res;
            num /= 7;
        }
        return isNeg ? "-" + res : res;
    }
}
