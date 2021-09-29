package com.sparta.view;

import com.sparta.controller.ResultFactory;
import com.sparta.model.UserInput;
import com.sparta.model.UserResults;

import java.util.InputMismatchException;
import java.lang.NegativeArraySizeException;
import java.util.Scanner;

public class DisplayManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserInput input = UserInput.getInstance();
        ResultFactory factory = new ResultFactory();
        UserResults result = UserResults.getInstance();

        System.out.print("Enter sort type b, m, q: ");
        input.setSortType(scanner.nextLine());

        try {
            System.out.print("Enter number of int(s) to sort: ");
            input.setArraySize(scanner.nextInt());
        } catch (InputMismatchException i) {
            System.err.println("Wrong input type! Please try again...");
            System.exit(0);
        }

        factory.setTypeResult();
        factory.sizeResult();

        try {
            factory.arrayOriginalResult();
        } catch (NegativeArraySizeException n) {
            System.err.println("Negative number input! Please try again...");
            System.exit(0);
        }

        factory.arraySorterResult();
        factory.timerResult();
        System.out.println(result.toString());

    }

}
