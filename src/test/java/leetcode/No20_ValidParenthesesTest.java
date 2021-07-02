package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No20_ValidParenthesesTest {

    @Test
    public void isValid() {
        No20_ValidParentheses ValidParentheses = new No20_ValidParentheses();
        assertFalse(ValidParentheses.isValid("(])"));
    }
}