package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No190_ReverseBitsTest {

    @Test
    public void reverseBits() {
        No190_ReverseBits revBit = new No190_ReverseBits();
        long expect = 3221225471L;
        long actualProcess = 11111111111111111111111111111101L;
        assertEquals( expect , revBit.reverseBits(actualProcess)  );
    }
}