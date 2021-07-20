package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No495_TeemoAttackingTest {

    @Test
    public void findPosisonedDuration() {
        No495_TeemoAttacking damagecalculator = new No495_TeemoAttacking();
        assertEquals(4, damagecalculator.findPosisonedDuration(new int[]{1, 4}, 2));
    }
}