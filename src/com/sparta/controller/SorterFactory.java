package com.sparta.controller;

import com.sparta.sorts.BubbleSort;
import com.sparta.sorts.MergeSort;
import com.sparta.sorts.QuickSort;

public class SorterFactory implements SortFactory{

    private String sorterType;

    @Override
    public void setSortType(String type) {
        this.sorterType = type;
    }

    @Override
    public String getSortType() {
        return this.sorterType;
    }


    @Override
    public int[] arraySorter(int[] numbers, String type) {
        switch (type) {
            case "b":
                BubbleSort sorterB = new BubbleSort();
                sorterB.sort(numbers);
                break;
            case "m":
                MergeSort sorterM = new MergeSort();
                sorterM.sort(numbers);
                break;
            case "q":
                QuickSort sorterQ = new QuickSort();
                sorterQ.sort(numbers);
                break;
        }
        return numbers;
    }
}
