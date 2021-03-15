package com.company;

import java.util.Scanner;
public class OddAndEven {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenOrOdd = Integer.parseInt(scanner.nextLine());

        if (evenOrOdd % 2 == 0 ) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
