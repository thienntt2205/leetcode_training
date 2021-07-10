//https://leetcode.com/problems/find-the-difference/
package leetcode;

public class No389_FindTheDifference {
    public char findTheDifference(String s, String t) {
        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();

        int asciis = 0;
        int asciit = 0;

        for (int i = 0; i < array1.length; i++) {
            asciis += (int) array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            asciit += (int) array2[i];
        }

        return (char) (asciit - asciis);
    }
}
