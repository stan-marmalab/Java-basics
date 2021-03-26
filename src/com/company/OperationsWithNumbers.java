package com.company;

import java.util.Scanner;
public class OperationsWithNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double N1 = Double.parseDouble(scanner.nextLine());
        double N2 = Double.parseDouble(scanner.nextLine());
        String symbol = scanner.nextLine();

        double result = 0;

        switch ( symbol ) {

            case "+":
                result = N1 + N2;
                break;
            case "-":
                result = N1 - N2;
                break;
            case "*":
                result = N1 * N2;
                break;
            case "/":
                result = N1 / N2;
                break;
            case "%":
                result = N1 % N2;
                break;
        }
        if ( symbol.matches("\\+|-|\\*") ) {
            if ( result % 2 == 0) {
                System.out.printf("%.0f %s %.0f = %.0f - even", N1, symbol, N2, result);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f - odd", N1, symbol, N2, result);
            }
        }
        if ( symbol.equals("/") ) {
            if ( N2 == 0 ) {
                System.out.printf("Cannot divide %.0f by zero", N1);
            } else {
                System.out.printf("%.0f %s %.0f = %.2f", N1, symbol, N2, result);
            }
        }
        if ( symbol.equals("%") ) {
            if ( N2 == 0 ) {
                System.out.printf("Cannot divide %.0f by zero", N1);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f", N1, symbol, N2, result);
            }
        }
    }
}
