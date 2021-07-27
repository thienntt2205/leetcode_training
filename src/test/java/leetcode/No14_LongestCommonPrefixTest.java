package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No14_LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {
        No14_LongestCommonPrefix preTest = new No14_LongestCommonPrefix();
        String expectString = "fl";
        assertEquals(expectString,preTest.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}