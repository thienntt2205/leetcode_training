package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No171_ExcelSheetColumnNumberTest {

    @Test
    public void titleToNumber() {
        No171_ExcelSheetColumnNumber numbertest = new No171_ExcelSheetColumnNumber();
        assertEquals(2147483647, numbertest.titleToNumber("FXSHRXW"));
    }
}