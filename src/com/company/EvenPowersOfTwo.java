package com.company;

import java.util.Scanner;

public class EvenPowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;

        for (int i = 0; i <= n; i += 2) {
            System.out.println(number);
            number *= 4;
        }
    }
}
