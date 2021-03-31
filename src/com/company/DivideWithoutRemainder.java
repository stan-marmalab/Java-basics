package com.company;

import java.util.Scanner;
public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double divisibleBy2 = 0;
        double divisibleBy3 = 0;
        double divisibleBy4 = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            count++;
            if ( number % 2 == 0 ) {
                divisibleBy2++;
            }
            if ( number % 3 == 0 ) {
                divisibleBy3++;
            }
            if ( number % 4 == 0 ) {
                divisibleBy4++;
            }
        }

        System.out.printf("%.2f%%\n", ( divisibleBy2 / count ) * 100);
        System.out.printf("%.2f%%\n", ( divisibleBy3 / count ) * 100);
        System.out.printf("%.2f%%\n", ( divisibleBy4 / count ) * 100);
    }
}
