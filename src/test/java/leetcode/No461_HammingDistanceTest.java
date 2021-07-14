package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No461_HammingDistanceTest {

    @Test
    public void hammingDistance() {
        No461_HammingDistance Hamming = new No461_HammingDistance();
        assertEquals(2, Hamming.hammingDistance(1, 4));
    }
}