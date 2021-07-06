package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No344_ReverseStringTest {

    @Test
    public void reverseString() {
        No344_ReverseString rev = new No344_ReverseString();
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, rev.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'}));
    }
}