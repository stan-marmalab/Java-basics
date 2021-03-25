package com.company;

import java.util.Scanner;
public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if ( dayOfWeek.matches("Monday|Tuesday|Wednesday|Thursday|Friday")) {
            if ( fruit.equals("banana") ) {
                quantity *= 2.50;
                System.out.printf("%.2f", quantity);
            }
            if ( fruit.equals("apple") ) {
                quantity *= 1.20;
                System.out.printf("%.2f", quantity);
            }
            if ( fruit.equals("orange") ) {
                quantity *= 0.85;
                System.out.printf("%.2f", quantity);
            }
            if ( fruit.equals("grapefruit")) {
                quantity *= 1.45;
                System.out.printf("%.2f", quantity);
            }
            if ( fruit.equals("kiwi")) {
                quantity *= 2.70;
                System.out.printf("%.2f", quantity);
            }
            if ( fruit.equals("pineapple")) {
                quantity *= 5.50;
                System.out.printf("%.2f", quantity);
            }
            if ( fruit.equals("grapes")) {
                quantity *= 3.85;
                System.out.printf("%.2f", quantity);
            }
        }
        if ( dayOfWeek.matches("Saturday|Sunday")) {
            if ( fruit.equals("banana") ) {
                quantity *= 2.70;
                System.out.printf("%.2f", quantity);
            }
            if ( fruit.equals("apple") ) {
                quantity *= 1.25;
                System.out.printf("%.2f", quantity);
            }
            if ( fruit.equals("orange") ) {
                quantity *= 0.90;
                System.out.printf("%.2f", quantity);
            }
            if ( fruit.equals("grapefruit")) {
                quantity *= 1.60;
                System.out.printf("%.2f", quantity);
            }
            if ( fruit.equals("kiwi")) {
                quantity *= 3.00;
                System.out.printf("%.2f", quantity);
            }
            if ( fruit.equals("pineapple")) {
                quantity *= 5.60;
                System.out.printf("%.2f", quantity);
            }
            if ( fruit.equals("grapes")) {
                quantity *= 4.20;
                System.out.printf("%.2f", quantity);
            }
        }
        if ( !fruit.matches("banana|apple|orange|grapefruit|kiwi|pineapple|grapes") ||
        !dayOfWeek.matches("Monday|Tuesday|Wednesday|Thursday|Friday|Saturday|Sunday") ) {
            System.out.println("error");
        }
    }
}
