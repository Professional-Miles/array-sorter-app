package com.sparta.controller;

import com.sparta.model.UserInput;
import com.sparta.model.UserResults;

public class ResultFactory {


    UserInput input = UserInput.getInstance();
    UserResults result = UserResults.getInstance();
    TheArray arrayTemp = new TheArray();


    public void setTypeResult(){
        switch (input.getSortType()){
            case "b":
                result.setSortType("Bubble Sort");
                break;
            case "m":
                result.setSortType("Merge Sort");
                break;
            case "q":
                result.setSortType("Quick Sort");
                break;
        }
    }

    public void sizeResult(){
        result.setArraySize(input.getArraySize());
    }

    public void arrayOriginalResult(){

        arrayTemp.setArrayNum(input.getArraySize());
        arrayTemp.arrayMade();
        int[] tempArray = arrayTemp.getThisArray();
        int[] tempArrayCopy = new int[input.getArraySize()];
        System.arraycopy(tempArray, 0, tempArrayCopy, 0, input.getArraySize());
        result.setOriginalArray(tempArrayCopy);
    }

    public void arraySorterResult(){
        SortManager sorter = new SortManager();
        result.setSortedArray(sorter.arraySorter(arrayTemp.getThisArray(), input.getSortType()));
    }


}
