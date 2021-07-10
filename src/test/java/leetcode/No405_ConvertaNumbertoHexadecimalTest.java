package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No405_ConvertaNumbertoHexadecimalTest {

    @Test
    public void toHex() {
        No405_ConvertaNumbertoHexadecimal conv = new No405_ConvertaNumbertoHexadecimal();
        assertEquals("88",conv.toHex(136));
    }
}