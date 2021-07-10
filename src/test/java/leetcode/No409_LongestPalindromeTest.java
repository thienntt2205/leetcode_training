package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No409_LongestPalindromeTest {

    @Test
    public void longestPalindrome() {
        No409_LongestPalindrome count = new No409_LongestPalindrome();
        assertEquals(7, count.longestPalindrome("abccccdd"));
    }
}