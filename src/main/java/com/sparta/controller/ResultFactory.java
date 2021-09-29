package com.sparta.controller;

import com.sparta.model.UserInput;
import com.sparta.model.UserResults;

public class ResultFactory {


    UserInput input = UserInput.getInstance();
    UserResults result = UserResults.getInstance();
    TheArray arrayTemp = new TheArray();
    SortManager sorter = new SortManager();


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
        if (input.getArraySize() == 0){
            System.err.println("You input zero(0)! Please try again...");
            System.exit(0);
        } else {
            result.setArraySize(input.getArraySize());
        }

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
        result.setSortedArray(sorter.arraySorter(arrayTemp.getThisArray(), input.getSortType()));
    }

    public void timerResult(){
        result.setSortTime(sorter.getStopTimer() - sorter.getStartTimer());
    }


}
