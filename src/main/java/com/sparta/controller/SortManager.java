package com.sparta.controller;

import com.sparta.model.BinaryTreeSort;
import com.sparta.model.BubbleSort;
import com.sparta.model.MergeSort;
import com.sparta.model.QuickSort;

public class SortManager implements SortFactory{

    private String sorterType;
    private long startTimer;
    private long stopTimer;

    public long getStartTimer() {
        return startTimer;
    }

    public void setStartTimer(long startTimer) {
        this.startTimer = startTimer;
    }

    public long getStopTimer() {
        return stopTimer;
    }

    public void setStopTimer(long stopTimer) {
        this.stopTimer = stopTimer;
    }

    public String getSorterType() {
        return sorterType;
    }

    public void setSorterType(String sorterType) {
        this.sorterType = sorterType;
    }

    @Override
    public int[] arraySorter(int[] numbers, String type) {
        switch (type) {
            case "b":
                BubbleSort sorterB = new BubbleSort();
                setStartTimer(System.nanoTime());
                sorterB.sort(numbers);
                setStopTimer(System.nanoTime());
                break;
            case "m":
                MergeSort sorterM = new MergeSort();
                setStartTimer(System.nanoTime());
                sorterM.sort(numbers);
                setStopTimer(System.nanoTime());
                break;
            case "q":
                QuickSort sorterQ = new QuickSort();
                setStartTimer(System.nanoTime());
                sorterQ.sort(numbers);
                setStopTimer(System.nanoTime());
                break;
            case "t":
                BinaryTreeSort sorterT = new BinaryTreeSort(numbers[0]);
                setStartTimer(System.nanoTime());
                sorterT.sort(numbers);
                sorterT.inOrder(sorterT.node);
                setStopTimer(System.nanoTime());
                break;
            default:
                System.err.println("You didn't pass a valid input! Please try again...");
                System.exit(0);
        }
        return numbers;
    }
}
