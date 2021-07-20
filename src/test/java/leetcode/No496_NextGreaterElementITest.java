package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No496_NextGreaterElementITest {

    @Test
    public void nextGreaterElement() {
        No496_NextGreaterElementI nextEle = new No496_NextGreaterElementI();
        assertArrayEquals(new int[]{-1, 3, -1}, nextEle.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}));
    }
}