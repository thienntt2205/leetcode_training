package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No202_HappyNumberTest {

    @Test
    public void isHappy() {
        No202_HappyNumber validHappy = new No202_HappyNumber();
        assertFalse(validHappy.isHappy(2));
    }
}