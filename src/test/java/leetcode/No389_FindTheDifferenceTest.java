package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No389_FindTheDifferenceTest {

    @Test
    public void findTheDifference() {
        No389_FindTheDifference find = new No389_FindTheDifference();
        assertEquals('e', find.findTheDifference("abcd", "abcde"));
    }
}