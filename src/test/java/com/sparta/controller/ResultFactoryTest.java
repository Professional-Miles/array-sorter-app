package com.sparta.controller;

import com.sparta.model.UserInput;
import com.sparta.model.UserResults;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ResultFactoryTest {

    UserInput userTest = UserInput.getInstance();
    UserResults resultsTest = UserResults.getInstance();
    ResultFactory factoryTest = new ResultFactory();

    @Test
    void setTypeResultTest() {
        String type = "b";
        userTest.setSortType(type);
        factoryTest.setTypeResult();
        assertEquals("Bubble Sort", resultsTest.getSortType());
    }

    @Test
    void sizeResultTest() {
        int sizeT = 5;
        userTest.setArraySize(sizeT);
        factoryTest.sizeResult();
        assertEquals(5,resultsTest.getArraySize());
    }

    @Test
    void arrayOriginalResultTest() {
        String type = "b";
        int sizeT = 6;
        userTest.setSortType(type);
        userTest.setArraySize(sizeT);
        factoryTest.setTypeResult();
        factoryTest.sizeResult();
        factoryTest.arrayOriginalResult();
        assertTrue(resultsTest.getOriginalArray()[5] != 0);
    }


    @Test
    void arraySorterResultTest() {
        String type = "b";
        int sizeT = 10000;
        userTest.setSortType(type);
        userTest.setArraySize(sizeT);
        factoryTest.setTypeResult();
        factoryTest.sizeResult();
        factoryTest.arrayOriginalResult();
        factoryTest.arraySorterResult();
        assertTrue(resultsTest.getOriginalArray()[5] != resultsTest.getSortedArray()[5]);
    }

    @Test
    void timerResultTest() {
        String type = "b";
        int sizeT = 1;
        userTest.setSortType(type);
        userTest.setArraySize(sizeT);
        factoryTest.setTypeResult();
        factoryTest.sizeResult();
        factoryTest.arrayOriginalResult();
        factoryTest.arraySorterResult();
        factoryTest.timerResult();
        assertTrue(resultsTest.getSortTime() > 0);
    }
}