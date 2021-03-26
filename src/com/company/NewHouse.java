package com.company;

import java.util.Scanner;
public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double sum = 0;
        double amountLeft = 0;

        switch (flowers) {

            case "Roses":
                if (numberOfFlowers > 80) {
                    sum = numberOfFlowers * 5.00;
                    sum = sum - (sum * 0.10);
                } else {
                    sum = numberOfFlowers * 5.00;
                }
                break;
            case "Dahlias":
                if (numberOfFlowers > 90) {
                    sum = numberOfFlowers * 3.80;
                    sum = sum - (sum * 0.15);
                } else {
                    sum = numberOfFlowers * 3.80;
                }
                break;
            case "Tulips":
                if (numberOfFlowers > 80) {
                    sum = numberOfFlowers * 2.80;
                    sum = sum - (sum * 0.15);
                } else {
                    sum = numberOfFlowers * 2.80;
                }
                break;
            case "Narcissus":
                if (numberOfFlowers < 120) {
                    sum = numberOfFlowers * 3.00;
                    sum = sum + (sum * 0.15);
                } else {
                    sum = numberOfFlowers * 3.00;
                }
                break;
            case "Gladiolus":
                if (numberOfFlowers < 80) {
                    sum = numberOfFlowers * 2.50;
                    sum = sum + (sum * 0.20);
                } else {
                    sum = numberOfFlowers * 2.50;
                }
                break;
        }
        if ( budget >= sum ) {
            amountLeft = budget - sum;
            System.out.printf ("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flowers, amountLeft);
        } else {
            amountLeft = sum - budget;
            System.out.printf ("Not enough money, you need %.2f leva more.", amountLeft);
        }
    }
}
