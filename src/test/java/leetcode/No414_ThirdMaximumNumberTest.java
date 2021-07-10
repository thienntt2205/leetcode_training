package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No414_ThirdMaximumNumberTest {

    @Test
    public void thirdMax() {
        No414_ThirdMaximumNumber check = new No414_ThirdMaximumNumber();
        assertEquals(1, check.thirdMax(new int[]{3, 2, 1}));
    }
}