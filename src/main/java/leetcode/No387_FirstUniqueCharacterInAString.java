//https://leetcode.com/problems/first-unique-character-in-a-string/
package leetcode;

public class No387_FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        if (s == null || s.isEmpty()) {
            return -1;
        }
        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (letters[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
