package com.company;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // input of two numbers
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        // check which number is greater
        if (number1 > number2) {
            System.out.println(number1);
        }
        else {
            System.out.println(number2);
        }
    }
}
