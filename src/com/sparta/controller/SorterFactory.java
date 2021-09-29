package com.sparta.controller;

import com.sparta.model.BubbleSort;
import com.sparta.model.MergeSort;
import com.sparta.model.QuickSort;

public class SorterFactory implements SortFactory{

    private String sorterType;

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
