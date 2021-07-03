package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No217_ContainsDuplicateTest {

    @Test
    public void containsDuplicate() {
        No217_ContainsDuplicate checkDup = new No217_ContainsDuplicate();
        assertFalse(checkDup.containsDuplicate(new int[]{1, 2, 3, 4}));
    }
}