package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No434_NumberofSegmentsinaStringEasyTest {

    @Test
    public void countSegments() {
        No434_NumberofSegmentsinaStringEasy count = new No434_NumberofSegmentsinaStringEasy();
        assertEquals(5, count.countSegments("Hello, my name is John"));
    }
}