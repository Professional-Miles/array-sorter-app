package com.sparta.view;

import com.sparta.controller.ResultFactory;
import com.sparta.model.UserInput;
import com.sparta.model.UserResults;
import java.util.Scanner;

import java.util.InputMismatchException;
import java.lang.NegativeArraySizeException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class DisplayManager {

    private static Logger log = Logger.getLogger("Array Sorter logger.");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserInput input = UserInput.getInstance();
        ResultFactory factory = new ResultFactory();
        UserResults result = UserResults.getInstance();
        PropertyConfigurator.configure("log4j.properties");


        System.out.print("Enter sort type character - BubbleSort(b), MergeSort(m), QuickSort(q), TreeSort(t): ");
        input.setSortType(scanner.nextLine());

        try {
            System.out.print("Enter number of int(s) to sort: ");
            input.setArraySize(scanner.nextInt());
        } catch (InputMismatchException i) {
            System.err.println("Wrong input type! Please try again...");
            log.error("Expected an int but User has input a String.");
            System.exit(0);
        }

        factory.setTypeResult();
        factory.sizeResult();

        try {
            factory.arrayOriginalResult();
        } catch (NegativeArraySizeException n) {
            System.err.println("Negative number input! Please try again...");
            log.error("The array attempted to initialise with negative size.");
            System.exit(0);
        }

        factory.arraySorterResult();
        factory.timerResult();
        System.out.println(result.toString());

    }

}
