package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No455_AssignCookiesTest {

    @Test
    public void findContentChildren() {
        No455_AssignCookies assign = new No455_AssignCookies();
        assertEquals(1, assign.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
    }
}