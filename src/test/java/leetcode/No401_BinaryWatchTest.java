package leetcode;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class No401_BinaryWatchTest {

    @Test
    public void readBinaryWatch() {
        No401_BinaryWatch read = new No401_BinaryWatch();
        assertEquals(new ArrayList<String>(),read.readBinaryWatch(9));
    }
}