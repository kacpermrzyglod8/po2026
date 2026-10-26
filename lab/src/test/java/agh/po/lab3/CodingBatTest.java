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
}