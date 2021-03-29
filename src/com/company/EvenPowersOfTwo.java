package com.company;

import java.util.Scanner;

public class EvenPowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;
        if ( n % 2 == 0) {
            for (int i = 0; i <= n; i += 2) {
                System.out.println(number);
                number *= 4;
            }
        } else {
            for (int i = 0; i <= n - 1; i += 2) {
                System.out.println(number);
                number *= 4;
            }
        }
    }
}
