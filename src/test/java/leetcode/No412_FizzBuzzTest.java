package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class No412_FizzBuzzTest {

    @Test
    public void fizzBuzz() {
        No412_FizzBuzz fizzbuzz = new No412_FizzBuzz();
        assertEquals(new ArrayList<String>( Arrays.asList("1","2","Fizz")) ,fizzbuzz.fizzBuzz(3));
    }
}