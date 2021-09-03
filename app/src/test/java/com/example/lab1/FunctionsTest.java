package com.example.lab1;

import org.junit.Test;
import static org.junit.Assert.*;

public class FunctionsTest {
    @Test
    public void testMin1() {
        Min min = new Min();
        int expected = 4;
        int actual = min.min(4,7);

        assertEquals(expected,actual);
    }
    @Test
    public void testMin2() {
        Min min = new Min();
        int expected = 0;
        int actual = min.min(0,0);

        assertEquals(expected,actual);
    }
    @Test
    public void testMin3() {
        Min min = new Min();
        int expected = -2;
        int actual = min.min(123,-2);

        assertEquals(expected,actual);
    }
    @Test
    public void testMin4() {
        Min min = new Min();
        int expected = 23;
        int actual = min.min(23,456);

        assertEquals(expected,actual);
    }
    @Test
    public void testMax1() {
        Max max = new Max();
        int expected = 7;
        int actual = max.max(4,7);

        assertEquals(expected,actual);
    }
    @Test
    public void testMax2() {
        Max max = new Max();
        int expected = 0;
        int actual = max.max(0,0);

        assertEquals(expected,actual);
    }
    @Test
    public void testMax3() {
        Max max = new Max();
        int expected = 123;
        int actual = max.max(123,-2);

        assertEquals(expected,actual);
    }
    @Test
    public void testMax4() {
        Max max = new Max();
        int expected = 456;
        int actual = max.max(23,456);

        assertEquals(expected,actual);
    }
}