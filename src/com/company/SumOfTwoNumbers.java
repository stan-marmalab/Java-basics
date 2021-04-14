package com.company;

import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int counterCombinations = 0;
        boolean foundCombination = false;

        for (int i = startNumber; i <= endNumber; i++) {
            for (int j = startNumber; j <= endNumber; j++) {
                counterCombinations++;
                int sum = i + j;
                if ( sum == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counterCombinations, i, j, magicNumber);
                    foundCombination = true;
                    break;
                }
            }
            if ( foundCombination ) {
                break;
            }
        }
        if ( !foundCombination ) {
            System.out.printf("%d combinations - neither equals %d", counterCombinations, magicNumber);
        }
    }
}
