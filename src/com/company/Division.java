package com.company;

import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int isItDivisible = Integer.parseInt(scanner.nextLine());

        if ( isItDivisible % 10 == 0 ) {
            System.out.println("The number is divisible by " + 10);
        } else if ( isItDivisible % 7 == 0 ) {
            System.out.println("The number is divisible by " + 7);
        } else if ( isItDivisible % 6 == 0 ) {
            System.out.println("The number is divisible by " + 6);
        } else if ( isItDivisible % 3 == 0 ) {
            System.out.println("The number is divisible by " + 3);
        } else if ( isItDivisible % 2 == 0 ) {
            System.out.println("The number is divisible by " + 2);
        }  else {
            System.out.println("Not divisible");
        }
    }
}
