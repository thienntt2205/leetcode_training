package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No485_MaxConsecutiveOnesTest {

    @Test
    public void findMaxConsecutiveOnes() {
        No485_MaxConsecutiveOnes find = new No485_MaxConsecutiveOnes();
        assertEquals(3, find.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }
}