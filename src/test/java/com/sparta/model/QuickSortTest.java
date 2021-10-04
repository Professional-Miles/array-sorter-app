package com.sparta.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void quickSortTestPass() {
        int[] testArray = {15,30,4,22,31,70,2};
        int[] expectedArray = {2,4,15,22,30,31,70};
        QuickSort test = new QuickSort();
        test.sort(testArray);
        assertArrayEquals(expectedArray,testArray);
    }

    @Test
    void quickSortTestFail() {
        int[] testArray = {15,30,4,22,31,70,2};
        int[] expectedArray = {4,2,125,22,35,31,10};
        QuickSort test = new QuickSort();
        test.sort(testArray);
        assertNotEquals(expectedArray,testArray);
    }
}