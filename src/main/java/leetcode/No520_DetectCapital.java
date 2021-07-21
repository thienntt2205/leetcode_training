//https://leetcode.com/problems/detect-capital/
package leetcode;

public class No520_DetectCapital {
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
