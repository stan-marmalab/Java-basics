package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double celsius = Double.parseDouble(scanner.nextLine());

        double fromCelsiusToFahrenheit = celsius * 1.8 + 32;

        System.out.printf("%.2f", fromCelsiusToFahrenheit);
    }
}
