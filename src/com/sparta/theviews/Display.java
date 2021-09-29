package com.sparta.theviews;

import java.util.Scanner;

public class Display {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserInput input = new UserInput();

        System.out.print("Enter sort type b, m, q: ");
        input.setSortType(scanner.nextLine());

        System.out.print("Enter number of ints to sort: ");
        input.setArraySize(scanner.nextInt());

    }

}
