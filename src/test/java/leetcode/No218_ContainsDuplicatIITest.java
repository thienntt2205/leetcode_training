package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No218_ContainsDuplicatIITest {

    @Test
    public void containsNearbyDuplicate() {
        No218_ContainsDuplicatII checkdupII = new No218_ContainsDuplicatII();
        assertFalse(checkdupII.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3},2));
    }
}