package com.company;

import java.util.Scanner;
public class MatchSumWithFirstNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum < number) {
            int nThNumber1 = Integer.parseInt(scanner.nextLine());
            sum += nThNumber1;
        }
        System.out.println(sum);
    }
}
