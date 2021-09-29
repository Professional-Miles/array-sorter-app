package com.sparta.controller;

public interface SortFactory {

    public void setSortType(String type);

    public String getSortType();

    public int[] arraySorter(int[] numbers, String type);

}
