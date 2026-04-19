package com.pluralsight;

import java.util.Scanner;

public class InputScanner {
    public static String userInputString(){//takes in user input for string values
        Scanner read = new Scanner(System.in);
        return read.nextLine();
    }

    public static int userInputInt(){ //takes in user input for int values
        Scanner read = new Scanner(System.in);
        return read.nextInt();
    }
}
