package com.company;

import java.util.Scanner;
public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());

        for (int i = numberOne; i <= numberTwo; i++) {
            String current = "" + i;
            int odd = 0;
            int even = 0;

            for (int j = 0; j < current.length(); j++) {
                int currentDigit = Integer.parseInt("" + current.charAt(j));
                if(j%2 == 0 ) {
                    even += currentDigit;
                } else {
                    odd += currentDigit;
                }
            }
            if ( odd == even ) {
                System.out.print(i + " ");
            }
        }
    }
}
