package agh.po.lab3;

import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

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
    //TESTY zadana kolejne zajęcia
//TESTY zadana kolejne zajęcia
    @org.junit.Test
    public void mapAB4Test() {
        assertEquals(Map.of("a", "aaa", "b", "bb", "c", "aaa"),
                codingBat.mapAB4(new HashMap<>(Map.of("a", "aaa", "b", "bb", "c", "cake"))));
        assertEquals(Map.of("a", "aa", "b", "bbb", "c", "bbb"),
                codingBat.mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb", "c", "cake"))));
        assertEquals(Map.of("a", "aa", "b", "bbb", "c", "bbb"),
                codingBat.mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb"))));
        assertEquals(Map.of("a", "aaa"),
                codingBat.mapAB4(new HashMap<>(Map.of("a", "aaa"))));
        assertEquals(Map.of("b", "bbb"),
                codingBat.mapAB4(new HashMap<>(Map.of("b", "bbb"))));
    }
    @org.junit.Test
    public void pairsTest() {
        assertEquals(Map.of("b", "g", "c", "e"),
                codingBat.pairs(new String[]{"code", "bug"}));
        assertEquals(Map.of("m", "n"),
                codingBat.pairs(new String[]{"man", "moon", "main"}));
        assertEquals(Map.of("g", "d", "m", "n", "n", "t"),
                codingBat.pairs(new String[]{"man", "moon", "good", "night"}));
        assertEquals(Map.of(),
                codingBat.pairs(new String[]{}));
        assertEquals(Map.of("a", "a", "b", "b"),
                codingBat.pairs(new String[]{"a", "b"}));
        assertEquals(Map.of("a", "d", "c", "s"),
                codingBat.pairs(new String[]{"are", "codes", "and", "cods"}));
        assertEquals(Map.of("a", "e", "b", "a", "c", "e", "t", "a"),
                codingBat.pairs(new String[]{"apple", "banana", "tea", "coffee"}));
    }


}