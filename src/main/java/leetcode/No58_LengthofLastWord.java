package leetcode;

public class No58_LengthofLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int result = 0, i = s.length() - 1;

        // Skip all whitespaces at the end of s.
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        // Count the number of consecutive non-whitespace characters.
        while (i >= 0 && s.charAt(i) != ' ') {
            result++;
            i--;
        }
        return result;
    }
}
