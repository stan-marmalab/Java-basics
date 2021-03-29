package com.company;

import java.util.Scanner;

public class EvenPowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;

        for (int i = 0; i <= n; i += 2) {
            System.out.println(number);

            // since it takes step +2, we need to multiply by 4
            // because 2 to the power of 0 is 1, 2 to the power of 2 is 4, 2 to the power of 4 is 16 ... the evens
            number *= 4;
        }
    }
}
