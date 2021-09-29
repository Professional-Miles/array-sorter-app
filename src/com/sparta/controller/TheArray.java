package com.sparta.controller;



public class TheArray implements ArrayMaker{

    private int arrayNum;
    private int thisArray;

    public int getArrayNum() {
        return arrayNum;
    }

    public void setArrayNum(int arrayNum) {
        this.arrayNum = arrayNum;
    }

    public int getThisArray() {
        return thisArray;
    }

    public void setThisArray(int thisArray) {
        this.thisArray = thisArray;
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
