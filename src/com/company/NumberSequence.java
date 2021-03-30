package com.company;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = Integer.parseInt(scanner.nextLine());
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i = 0; i < numberOfNumbers; i++) {
           int numbers = Integer.parseInt(scanner.nextLine());

           if ( numbers < max ) {
               max = numbers;
           } else if ( numbers > min ) {
               min = numbers;
           }
        }

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}
