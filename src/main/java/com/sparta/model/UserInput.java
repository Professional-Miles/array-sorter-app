package com.sparta.model;

public class UserInput {

    private static UserInput userInput;
    private int arraySize;
    private String sortType;
    private String goAgain;

    private UserInput(){

    }

    public static UserInput getInstance(){
        if(userInput == null)
            userInput = new UserInput();
        return userInput;
    }

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public String getGoAgain() {
        return goAgain;
    }

    public void setGoAgain(String goAgain) {
        this.goAgain = goAgain;
    }
}
