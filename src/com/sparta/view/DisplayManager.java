package com.sparta.view;

import com.sparta.model.UserInput;
import com.sparta.model.UserResults;

import java.util.Scanner;

public class DisplayManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserInput input = UserInput.getInstance();
        UserResults result = UserResults.getInstance();

        System.out.print("Enter sort type b, m, q: ");
        input.setSortType(scanner.nextLine());

        System.out.print("Enter number of ints to sort: ");
        input.setArraySize(scanner.nextInt());




    }

}
