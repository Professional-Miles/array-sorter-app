package com.sparta.model;

import java.util.Arrays;

public class UserResults {

    private static UserResults userResults;

    private UserResults(){

    }

    private String sortType;
    private int arraySize;
    private int[] originalArray;
    private int[] sortedArray;
    private long sortTime;

    public static UserResults getInstance(){
        if(userResults == null)
            userResults = new UserResults();
        return userResults;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    public int[] getOriginalArray() {
        return originalArray;
    }

    public void setOriginalArray(int[] originalArray) {
        this.originalArray = originalArray;
    }

    public int[] getSortedArray() {
        return sortedArray;
    }

    public void setSortedArray(int[] sortedArray) {
        this.sortedArray = sortedArray;
    }

    public long getSortTime() {
        return sortTime;
    }

    public void setSortTime(long sortTime) {
        this.sortTime = sortTime;
    }

    @Override
    public String toString() {
        return "UserResults: { " +
                "Sort Used = '" + sortType + '\'' +
                ", Size of Array = " + arraySize +
                ", Original Array = " + Arrays.toString(originalArray) +
                ", Sorted Array = " + Arrays.toString(sortedArray) +
                ", Time taken to sort (Nano Seconds) = " + sortTime +
                "ns }";
    }
}
