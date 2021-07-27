package leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class No01_TwoSumTest {

    @Test
    public void twoSumTest() {
        No01_TwoSum actual = new No01_TwoSum();
        assertArrayEquals(new int[]{1,2},actual.twoSum(new int[]{3,2,4},6));
    }
}