package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No258_AddDigitsTest {

    @Test
    public void addDigits() {
        No258_AddDigits process = new No258_AddDigits();
        assertEquals(7, process.addDigits(78910));
    }
}