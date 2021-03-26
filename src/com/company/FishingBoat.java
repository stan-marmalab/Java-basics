package com.company;

import java.util.Scanner;
public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double groupBudget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double numberOfFisherman = Double.parseDouble(scanner.nextLine());

        double rentOfTheBoat = 0;
        double amountLeft = 0;

        switch ( season ) {

            case "Spring":
                rentOfTheBoat = 3000.00;
                if ( numberOfFisherman <= 6 ) {
                    rentOfTheBoat = rentOfTheBoat - ( rentOfTheBoat * 0.10);
                }
                if ( numberOfFisherman > 7 && numberOfFisherman <= 11) {
                    rentOfTheBoat = rentOfTheBoat - ( rentOfTheBoat * 0.15);
                }
                if ( numberOfFisherman > 12 ) {
                    rentOfTheBoat = rentOfTheBoat - ( rentOfTheBoat * 0.25);
                }
                if ( numberOfFisherman % 2 == 0 ) {
                    rentOfTheBoat = rentOfTheBoat - ( rentOfTheBoat * 0.05);
                }
                break;
            case "Winter":
                rentOfTheBoat = 2600.00;
                if ( numberOfFisherman <= 6 ) {
                    rentOfTheBoat = rentOfTheBoat - ( rentOfTheBoat * 0.10);
                }
                if ( numberOfFisherman > 7 && numberOfFisherman <= 11) {
                    rentOfTheBoat = rentOfTheBoat - ( rentOfTheBoat * 0.15);
                }
                if ( numberOfFisherman > 12 ) {
                    rentOfTheBoat = rentOfTheBoat - ( rentOfTheBoat * 0.25);
                }
                if ( numberOfFisherman % 2 == 0 ) {
                    rentOfTheBoat = rentOfTheBoat - ( rentOfTheBoat * 0.05);
                }
                break;
            case "Summer":
            case "Autumn":
                rentOfTheBoat = 4200.00;
                if ( numberOfFisherman <= 6 ) {
                    rentOfTheBoat = rentOfTheBoat - ( rentOfTheBoat * 0.10);
                }
                if ( numberOfFisherman > 7 && numberOfFisherman <= 11) {
                    rentOfTheBoat = rentOfTheBoat - ( rentOfTheBoat * 0.15);
                }
                if ( numberOfFisherman > 12 ) {
                    rentOfTheBoat = rentOfTheBoat - ( rentOfTheBoat * 0.25);
                }
                if ( !season.equals("Autumn") ) {
                    if (numberOfFisherman % 2 == 0) {
                        rentOfTheBoat = rentOfTheBoat - (rentOfTheBoat * 0.05);
                    }
                }
                break;
        }

        if ( groupBudget >= rentOfTheBoat) {
            amountLeft = groupBudget - rentOfTheBoat;
            System.out.printf("Yes! You have %.2f leva left.", amountLeft);
        } else {
            amountLeft = rentOfTheBoat - groupBudget;
            System.out.printf("Not enough money! You need %.2f leva.", amountLeft);
        }
    }
}
