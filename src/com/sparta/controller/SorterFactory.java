package com.sparta.controller;

import com.sparta.sorts.BubbleSort;
import com.sparta.sorts.MergeSort;
import com.sparta.sorts.QuickSort;

public class SorterFactory implements SortFactory{

    private char sorterType;

    @Override
    public void setSortType(char type) {
        this.sorterType = type;
    }

    @Override
    public void arraySorter(int[] numbers, char type) {
        switch (type) {
            case 'b':
                BubbleSort sorterB = new BubbleSort();
                sorterB.sort(numbers);
                break;
            case 'm':
                MergeSort sorterM = new MergeSort();
                sorterM.sort(numbers);
                break;
            case 'q':
                QuickSort sorterQ = new QuickSort();
                sorterQ.sort(numbers);
                break;
        }
    }
}
