package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No492_ConstructtheRectangleTest {

    @Test
    public void constructRectangle() {
        No492_ConstructtheRectangle construct = new No492_ConstructtheRectangle();
        assertArrayEquals(new int[]{2, 2}, construct.constructRectangle(4));
    }
}