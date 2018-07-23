package test.java.lv.ctco.interview;


import main.java.lv.ctco.interview.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @org.junit.jupiter.api.Test
    void testBasicGetHigestSecuentialInt() {
        int[] arrayOfInts = {1, 1, 1, 3, 5, 7, 7, 7, 7, 7, 5, 5, 5, 5};
        assertEquals(7, Main.getHigestSecuentialInt(arrayOfInts));
    }

    @org.junit.jupiter.api.Test
    void testForEmptyArrayInputGetHigestSecuentialIntReturnsZero() {
        int[] arrayOfInts = {};
        assertEquals(0, Main.getHigestSecuentialInt(arrayOfInts));
    }

}