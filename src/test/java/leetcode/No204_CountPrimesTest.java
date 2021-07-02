package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No204_CountPrimesTest {

    @Test
    public void countPrimes() {
        No204_CountPrimes count = new No204_CountPrimes();
        assertEquals(365,count.countPrimes(2468));
    }
}