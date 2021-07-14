package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No453_MinimumMovestoEqualArrayElementsTest {

    @Test
    public void minMoves() {
        No453_MinimumMovestoEqualArrayElements min = new No453_MinimumMovestoEqualArrayElements();
        assertEquals(3, min.minMoves(new int[]{1, 2, 3}));
    }
}