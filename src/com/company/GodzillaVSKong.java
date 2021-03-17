package com.company;

import java.util.Scanner;

public class GodzillaVSKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        double statists = Double.parseDouble(scanner.nextLine());
        double statistsCloths = Double.parseDouble(scanner.nextLine());

        double decorAmount = movieBudget * 0.10;
        double clothingAmount = statists * statistsCloths;

        if ( statists > 150 ) {
            clothingAmount = clothingAmount - (clothingAmount * 0.10);
        }

        double totalAmountForTheMovie = decorAmount + clothingAmount;
        double isItEnough = Math.abs(movieBudget - totalAmountForTheMovie);

        if (totalAmountForTheMovie > movieBudget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", isItEnough);
        } else if (totalAmountForTheMovie <= movieBudget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", isItEnough);
        }

    }
}
