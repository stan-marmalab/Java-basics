package com.company;

import java.util.Scanner;
public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstPayment = Double.parseDouble(scanner.nextLine());


        if ( firstPayment < 0 ) {
            System.out.println("Invalid operation!");
            firstPayment = 0;
        } else {
            System.out.printf("Increase: %.2f\n", firstPayment);
            while (true) {
                if (scanner.hasNextDouble()) {
                    double num = scanner.nextDouble();
                    if (num >= 0) {
                        firstPayment += num;
                        System.out.printf("Increase: %.2f\n", num);
                    } else {
                        System.out.println("Invalid operation!");
                        break;
                    }
                } else {
                    String word = scanner.next();
                    if ("NoMoreMoney".equals(word)) break;
                }
            }
        }
        System.out.printf("Total: %.2f", firstPayment);
    }
}
