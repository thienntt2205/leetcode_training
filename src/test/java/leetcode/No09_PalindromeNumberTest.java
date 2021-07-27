package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No09_PalindromeNumberTest {

    @Test
    public void isPalindrome() {
        No09_PalindromeNumber check = new No09_PalindromeNumber();
        assertFalse(check.isPalindrome(-121));
    }
}