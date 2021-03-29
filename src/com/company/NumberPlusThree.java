package com.company;

import java.util.Scanner;
public class NumberPlusThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for ( int number1 = 1; number1 <= number; number1 += 3) {
            System.out.println(number1);
        }
    }
}
