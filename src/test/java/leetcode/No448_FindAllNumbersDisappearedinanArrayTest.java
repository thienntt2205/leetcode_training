package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class No448_FindAllNumbersDisappearedinanArrayTest {

    @Test
    public void findDisappearedNumbers() {
        No448_FindAllNumbersDisappearedinanArray find = new No448_FindAllNumbersDisappearedinanArray();
        assertEquals(new ArrayList<Integer>(Arrays.asList(5, 6)), find.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}