package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No415_AddStringTest {

    @Test
    public void addStrings() {
        No415_AddString add = new No415_AddString();
        assertEquals("134", add.addStrings( "11","123"));
    }
}