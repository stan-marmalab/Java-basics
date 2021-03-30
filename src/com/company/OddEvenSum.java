package com.company;
import java.util.Scanner;
public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int total = 0, allNumbers = 0, evenSum = 0, oddSum = 0;

        for (int i = 0; i < numbers; i++) {
            allNumbers = Integer.parseInt(scanner.nextLine());

            if ( i % 2 == 0 ) {
                evenSum = evenSum + allNumbers;
            } else {
                oddSum = oddSum + allNumbers;
            }
        }
        if ( evenSum == oddSum ) {
            System.out.println("Yes");
            System.out.println("Sum = " + evenSum);
        } else {
            total = Math.abs(evenSum - oddSum);
            System.out.println("No");
            System.out.println("Diff = " + total);
        }
    }
}
