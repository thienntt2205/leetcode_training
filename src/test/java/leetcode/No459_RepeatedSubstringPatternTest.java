package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No459_RepeatedSubstringPatternTest {

    @Test
    public void repeatedSubstringPattern() {
        No459_RepeatedSubstringPattern rep = new No459_RepeatedSubstringPattern();
        assertFalse(rep.repeatedSubstringPattern("aba"));
    }
}