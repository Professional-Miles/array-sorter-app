package com.sparta.controller;

import java.util.Arrays;

public class TheArray implements ArrayMaker{

    private int arraynum;

    @Override
    public void setArrayNumber(int number) {
        this.arraynum = number;
    }

    @Override
    public int getArrayNumber() {
        return this.arraynum;
    }

    @Override
    public int[] arrayMade() {

        int[] theArray = new int[this.arraynum];
        for(int i = 0; i <  theArray.length; i++) {
            theArray[i] = (int)(Math.random() * 100);
        }

        return theArray;
    }
}
