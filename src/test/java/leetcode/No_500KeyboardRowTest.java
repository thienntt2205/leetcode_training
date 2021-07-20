package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No_500KeyboardRowTest {

    @Test
    public void findWords() {
        No500KeyboardRow check = new No500KeyboardRow();
        assertArrayEquals(new String[]{"Alaska", "Dad"}, check.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}));
    }
}