package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No506_RelativeRanksTest {

    @Test
    public void findRelativeRanks() {
        No506_RelativeRanks find = new No506_RelativeRanks();
        assertArrayEquals(new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"}, find.findRelativeRanks(new int[]{5, 4, 3, 2, 1}));
    }
}