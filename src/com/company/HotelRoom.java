package com.company;

import java.util.Scanner;
public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        double numberOfDaysToStay = Double.parseDouble(scanner.nextLine());

        double apartment = 0;
        double studio = 0;

        switch ( month ) {
            case "May":
            case "October":
                apartment = numberOfDaysToStay * 65.00;
                studio = numberOfDaysToStay * 50.00;
                if ( numberOfDaysToStay > 7 && numberOfDaysToStay < 13) {
                    studio = studio - ( studio * 0.05 );
                }
                if ( numberOfDaysToStay > 14 ) {
                    apartment = apartment - ( apartment * 0.10 );
                    studio = studio - ( studio * 0.30 );
                }
                break;
            case "June":
            case "September":
                apartment = numberOfDaysToStay * 68.70;
                studio = numberOfDaysToStay * 75.20;
                if ( numberOfDaysToStay > 14 ) {
                    apartment = apartment - ( apartment * 0.10 );
                    studio = studio - ( studio * 0.20 );
                }
                break;
            case "July":
            case "August":
                apartment = numberOfDaysToStay * 77.00;
                studio = numberOfDaysToStay * 76.00;
                if ( numberOfDaysToStay > 14 ) {
                    apartment = apartment - ( apartment * 0.10 );
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.\n", apartment);
        System.out.printf("Studio: %.2f lv.", studio);
    }
}
