package com.company;

import java.util.Scanner;
public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int previousNumbers = 1;

        while ( previousNumbers <= number ) {
            System.out.println(previousNumbers);
            previousNumbers = previousNumbers * 2 + 1;
        }
    }
}
