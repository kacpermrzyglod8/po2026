package agh.po.lab3;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat codingBat = new CodingBat();
    @org.junit.Test
    public void array123() {
        assertEquals(true, codingBat.array123(new int[]{1,2,3,1}));
        assertEquals(false, codingBat.array123(new int[]{1,2,4,1}));
        assertEquals(true, codingBat.array123(new int[]{1,1,2,1,2,3}));
        assertEquals(false, codingBat.array123(new int[]{1,1,2,1,2,1}));
        assertEquals(true, codingBat.array123(new int[]{1,2,3,1,2,3}));
        assertEquals(true, codingBat.array123(new int[]{1,2,3}));
        assertEquals(false, codingBat.array123(new int[]{1,1,1}));
        assertEquals(false, codingBat.array123(new int[]{1,2}));
        assertEquals(false, codingBat.array123(new int[]{1}));
        assertEquals(false, codingBat.array123(new int[]{}));
    }
    @org.junit.Test
    public void stringMatch(){
        assertEquals(3, codingBat.stringMatch("xxcaazz", "xxbaaz"));
        assertEquals(2, codingBat.stringMatch("abc", "abc"));
        assertEquals(0, codingBat.stringMatch("abc", "axc"));
        assertEquals(1, codingBat.stringMatch("hello", "he"));
        assertEquals(1, codingBat.stringMatch("he", "hello"));
        assertEquals(0, codingBat.stringMatch("h", "hello"));
        assertEquals(0, codingBat.stringMatch("", "hello"));
        assertEquals(1, codingBat.stringMatch("aabbccdd", "abbbxxd"));
        assertEquals(3, codingBat.stringMatch("aaxxaaxx", "iaxxai"));
        assertEquals(3, codingBat.stringMatch("iaxxai", "aaxxaaxx"));
    }
    @org.junit.Test
    public void countEvens() {
        assertEquals(3, codingBat.countEvens(new int[]{2, 1, 2, 3, 4}));
        assertEquals(3, codingBat.countEvens(new int[]{2, 2, 0}));
        assertEquals(0, codingBat.countEvens(new int[]{1, 3, 5}));
        assertEquals(0, codingBat.countEvens(new int[]{}));
        assertEquals(1, codingBat.countEvens(new int[]{11, 9, 0, 1}));
        assertEquals(2, codingBat.countEvens(new int[]{2, 11, 9, 0}));
        assertEquals(1, codingBat.countEvens(new int[]{2}));
        assertEquals(2, codingBat.countEvens(new int[]{2, 5, 12}));
    }
    @org.junit.Test
    public void helloName() {
        assertEquals("Hello Bob!", codingBat.helloName("Bob"));
        assertEquals("Hello Alice!", codingBat.helloName("Alice"));
        assertEquals("Hello X!", codingBat.helloName("X"));
        assertEquals("Hello Dolly!", codingBat.helloName("Dolly"));
        assertEquals("Hello Alpha!", codingBat.helloName("Alpha"));
        assertEquals("Hello Omega!", codingBat.helloName("Omega"));
        assertEquals("Hello Goodbye!", codingBat.helloName("Goodbye"));
        assertEquals("Hello ho ho ho!", codingBat.helloName("ho ho ho"));
        assertEquals("Hello xyz!!", codingBat.helloName("xyz!"));
        assertEquals("Hello Hello!", codingBat.helloName("Hello"));
    }
}