package leetcode;

import org.junit.Test;

import java.lang.reflect.MalformedParameterizedTypeException;

import static org.junit.Assert.*;

public class No13_RomanToIntegerTest {

    @Test
    public void romanToInt() {
        No13_RomanToInteger converter = new No13_RomanToInteger();
        assertEquals(3, converter.romanToInt("III"));
    }
}