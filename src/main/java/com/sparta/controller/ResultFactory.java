package com.sparta.controller;

import com.sparta.model.UserInput;
import com.sparta.model.UserResults;
import org.apache.log4j.Logger;

public class ResultFactory {

    private static Logger log = Logger.getLogger("ResultFactory logger.");

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
            case "t":
                result.setSortType("Binary Tree Sort");
                break;
        }
    }

    public void sizeResult(){
        if (input.getArraySize() == 0){
            System.err.println("You input zero(0)! Please try again...");
            log.error("The user input a (0), so there was no array ints to sort.");
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

        if (input.getSortType().equals("t")){
            System.out.println("Array sorted vertically, results in brackets.");
            sorter.arraySorter(arrayTemp.getThisArray(),input.getSortType());
        } else {
            result.setSortedArray(sorter.arraySorter(arrayTemp.getThisArray(), input.getSortType()));
        }
    }

    public void timerResult(){
        result.setSortTime(sorter.getStopTimer() - sorter.getStartTimer());
    }

    public void goAgainResult(){

        System.out.println("-----------------------------------------------------");
        int[] tempArrayCopy1 = new int[input.getArraySize()];
        int[] tempArrayCopy2 = new int[input.getArraySize()];
        int[] tempArrayCopy3 = new int[input.getArraySize()];
        int[] tempArrayCopy4 = new int[input.getArraySize()];

        System.arraycopy(result.getOriginalArray(), 0, tempArrayCopy1, 0, input.getArraySize());
        sorter.arraySorter(tempArrayCopy1, "b");
        timerResult();
        System.out.println("Bubble sort time: " + result.getSortTime());

        System.arraycopy(result.getOriginalArray(), 0, tempArrayCopy2, 0, input.getArraySize());
        sorter.arraySorter(tempArrayCopy2, "m");
        timerResult();
        System.out.println("Merge sort time: " + result.getSortTime());

        System.arraycopy(result.getOriginalArray(), 0, tempArrayCopy3, 0, input.getArraySize());
        sorter.arraySorter(tempArrayCopy3, "q");
        timerResult();
        System.out.println("Quick sort time: " + result.getSortTime());

        System.arraycopy(result.getOriginalArray(), 0, tempArrayCopy4, 0, input.getArraySize());
        sorter.arraySorter(tempArrayCopy3, "t");
        timerResult();
        System.out.println("Binary tree sort time: " + result.getSortTime());


    }


}
