//https://leetcode.com/problems/longest-uncommon-subsequence-i/
package leetcode;

public class No521_Longest_Uncommon_SubsequenceI {
    public int findLUSlength(String a, String b) {
        int lenA = a.length(), lenB = b.length();

        if (a.equals(b)) {
            return -1;
        } else {
            return Math.max(lenA, lenB);
        }
    }
}
