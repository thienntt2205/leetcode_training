package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No07_ReverseIntegerTest {

    @Test
    public void reverse() {
        No07_ReverseInteger rev = new No07_ReverseInteger();

        assertEquals(123,rev.reverse(321));
    }
}