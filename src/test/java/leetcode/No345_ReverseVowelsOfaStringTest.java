package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No345_ReverseVowelsOfaStringTest {

    @Test
    public void reverseVowels() {
        No345_ReverseVowelsOfaString rev = new No345_ReverseVowelsOfaString();
        assertEquals("holle",rev.reverseVowels("hello"));
    }
}