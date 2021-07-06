package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No338_CountingBitsTest {

    @Test
    public void countBits() {
        No338_CountingBits count = new No338_CountingBits();
        assertEquals(new int[]{0,1,1},count.countBits(2));
    }
}