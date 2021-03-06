package com.sparta.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeSortTest {

    @Test
    void binaryTreeSortTestFirstNode() {
        int[] testArray = {15,30,4,22,31,70,2};
        BinaryTreeSort test = new BinaryTreeSort(testArray[0]);
        test.sort(testArray);
        assertEquals(15,test.node.getData());
    }

    @Test
    void binaryTreeSortTestNotFirstNode() {
        int[] testArray = {15,30,4,22,31,70,2};
        BinaryTreeSort test = new BinaryTreeSort(testArray[0]);
        test.sort(testArray);
        assertNotEquals(4,test.node.getData());
    }

    @Test
    void binaryTreeSortTestSecondNode() {
        int[] testArray = {15,30,4,22,31,70,2};
        BinaryTreeSort test = new BinaryTreeSort(testArray[0]);
        test.sort(testArray);
        assertEquals(30,test.node.getRight().getData());
    }

    @Test
    void binaryTreeSortTestFourthNode() {
        int[] testArray = {15,30,4,22,31,70,2};
        BinaryTreeSort test = new BinaryTreeSort(testArray[0]);
        test.sort(testArray);
        assertEquals(22,test.node.getRight().getLeft().getData());
    }

    @Test
    void binaryTreeSortTestLastNode() {
        int[] testArray = {15,30,4,22,31,70,2};
        BinaryTreeSort test = new BinaryTreeSort(testArray[0]);
        test.sort(testArray);
        assertEquals(2,test.node.getLeft().getLeft().getData());
    }

    @Test
    void setDataTest(){
        int dataTest = 4;
        BinaryTreeSort nodeT = new BinaryTreeSort(dataTest);
        nodeT.node.setData(dataTest);
        assertEquals(4,nodeT.node.getData());
    }

    @Test
    void setNotDataTest(){
        int dataTest = 4;
        BinaryTreeSort nodeT = new BinaryTreeSort(dataTest);
        nodeT.node.setData(dataTest);
        assertNotEquals(5,nodeT.node.getData());
    }


}