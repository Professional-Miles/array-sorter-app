package com.sparta.controller;

import com.sparta.model.UserInput;
import com.sparta.model.UserResults;

public class ResultFactory {


    UserInput input = UserInput.getInstance();
    UserResults result = UserResults.getInstance();
    private int[] tempArray;

    public int[] getTempArray() {
        return tempArray;
    }

    public void setTempArray(int[] tempArray) {
        this.tempArray = tempArray;
    }



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
        TheArray arrayTemp = new TheArray();
        arrayTemp.setArrayNum(input.getArraySize());
        arrayTemp.arrayMade();
        tempArray = arrayTemp.getThisArray();
        result.setOriginalArray(tempArray);
    }

    public void arraySorterResult(){
        SortManager sorter = new SortManager();
        result.setSortedArray(sorter.arraySorter(tempArray, input.getSortType()));
    }


}
