package com.sparta.controller;

import java.util.Arrays;

public class TheArray implements ArrayMaker{

    private int arrayNum;

    @Override
    public void setArrayNumber(int number) {
        this.arrayNum = number;
    }

    @Override
    public int getArrayNumber() {
        return this.arrayNum;
    }

    @Override
    public int[] arrayMade() {

        int[] theArray = new int[this.arrayNum];
        for(int i = 0; i <  theArray.length; i++) {
            theArray[i] = (int)(Math.random() * 100);
        }

        return theArray;
    }
}
