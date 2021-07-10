package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No392_IsSubsequenceTest {

    @Test
    public void isSubsequence() {
        No392_IsSubsequence test = new No392_IsSubsequence();
        assertFalse(test.isSubsequence("axc","ahbgdc"));
    }
}