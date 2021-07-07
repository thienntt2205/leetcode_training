package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No349_IntersectionofTwoArraysTest {

    @Test
    public void intersection() {
        No349_IntersectionofTwoArrays ins = new No349_IntersectionofTwoArrays();
        assertArrayEquals(new int[]{2}, ins.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }
}