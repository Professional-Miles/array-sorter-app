package com.sparta.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void mergeSortTestPass() {
        int[] testArray = {15,30,4,22,31,70,2};
        int[] expectedArray = {2,4,15,22,30,31,70};
        MergeSort test = new MergeSort();
        test.sort(testArray);
        assertArrayEquals(expectedArray,testArray);
    }

    @Test
    void mergeSortTestFail() {
        int[] testArray = {15,30,4,22,31,70,2};
        int[] expectedArray = {1,4,15,22,30,31,72};
        MergeSort test = new MergeSort();
        test.sort(testArray);
        assertNotEquals(expectedArray,testArray);
    }


}