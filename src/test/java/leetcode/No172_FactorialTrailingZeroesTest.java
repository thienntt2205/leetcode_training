package leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class No172_FactorialTrailingZeroesTest {

    @Test
    public void traillingZero() {
        No172_FactorialTrailingZeroes check = new No172_FactorialTrailingZeroes();
        assertEquals(1, check.traillingZero(5));
    }
}