//https://leetcode.com/problems/reverse-string/
package leetcode;

public class No344_ReverseString {
    public char[] reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        return s;
    }
}
