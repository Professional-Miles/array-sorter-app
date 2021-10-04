package com.sparta.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void bubbleSortTestPass() {
        int[] testArray = {15,30,4,22,31,70,2};
        int[] expectedArray = {2,4,15,22,30,31,70};
        BubbleSort test = new BubbleSort();
        test.sort(testArray);
        assertArrayEquals(expectedArray,testArray);
    }

    @Test
    void bubbleSortTestFail() {
        int[] testArray = {15,30,4,22,31,70,2};
        int[] expectedArray = {4,2,125,22,35,31,10};
        BubbleSort test = new BubbleSort();
        test.sort(testArray);
        assertNotEquals(expectedArray,testArray);
    }

}