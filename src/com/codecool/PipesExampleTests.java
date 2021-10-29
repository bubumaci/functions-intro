package com.codecool;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PipesExampleTests {
    @Test
    public void tests0() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, Kata.pipeFix(new int[]{1, 2, 3, 5, 6, 8, 9}));
    }

    @Test
    public void tests1() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, Kata.pipeFix(new int[]{1, 2, 3, 12}));
    }

    @Test
    public void tests2() {
        assertArrayEquals(new int[]{6, 7, 8, 9}, Kata.pipeFix(new int[]{6, 9}));
    }

    @Test
    public void tests3() {
        assertArrayEquals(new int[]{-1, 0, 1, 2, 3, 4}, Kata.pipeFix(new int[]{-1, 4}));
    }

    @Test
    public void tests4() {
        assertArrayEquals(new int[]{1, 2, 3}, Kata.pipeFix(new int[]{1, 2, 3}));
    }
}
