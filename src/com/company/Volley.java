package com.company;

import java.util.Scanner;
public class Volley {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double volleyballTime = 0;

        // Games in the weekends
        volleyballTime += (48 - h) * 3.0 / 4;

        // Games on holidays
        volleyballTime += p * 2.0 / 3;

        // Home games
        volleyballTime += h;

        // Checking if the year is leap
        if (year.equals("leap")) {
            volleyballTime *= 1.15;
        }

        System.out.printf("%.0f",Math.floor(volleyballTime));
    }
}
