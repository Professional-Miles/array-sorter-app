package com.sparta.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortManagerTest {

    @Test
    void arraySorterTestMerge() {
        SortManager sorterT = new SortManager();
        int[] aTest = {2,5,1,7,4};
        int[] aTestS = {1,2,4,5,7};
        sorterT.arraySorter(aTest,"m");
        assertEquals(aTestS[2],aTest[2]);
    }

    @Test
    void arraySorterTestQuick() {
        SortManager sorterT = new SortManager();
        int[] aTest = {2,5,1,7,4};
        int[] aTestS = {1,2,4,5,7};
        sorterT.arraySorter(aTest,"q");
        assertEquals(aTestS[3],aTest[3]);
    }

}