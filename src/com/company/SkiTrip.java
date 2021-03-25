package com.company;

import java.util.Scanner;
public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double daysToStay = Double.parseDouble(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();

        daysToStay -= 1;

        double singleRoom = daysToStay * 18.00;
        double apartment = daysToStay * 25.00;
        double presidentApartment = daysToStay * 35.00;


        if ( daysToStay < 10 ) {
            if ( roomType.equals("room for one person") ) {
                if ( rating.equals("positive") ) {
                    singleRoom = singleRoom + ( singleRoom * 0.25 );
                }
                if ( rating.equals("negative") ) {
                    singleRoom = singleRoom - ( singleRoom * 0.10 );
                }
                System.out.printf("%.2f", singleRoom);
            }
            if ( roomType.equals("apartment")) {
                apartment -= apartment * 0.30;
                if ( rating.equals("positive") ) {
                    apartment += apartment * 0.25;
                }
                if ( rating.equals("negative") ) {
                    apartment = apartment - ( apartment * 0.10 );
                }
                System.out.printf("%.2f", apartment);
            }
            if ( roomType.equals("president apartment")) {
                if ( rating.equals("positive") ) {
                    presidentApartment = presidentApartment + ( presidentApartment * 0.25 );
                }
                if ( rating.equals("negative") ) {
                    presidentApartment = presidentApartment - ( presidentApartment * 0.10 );
                }
                System.out.printf("%.2f", presidentApartment);
            }
        }
        if ( daysToStay >= 10 && daysToStay <= 15) {
            if ( roomType.equals("room for one person") ) {
                if ( rating.equals("positive") ) {
                    singleRoom = singleRoom + ( singleRoom * 0.25 );
                }
                if ( rating.equals("negative") ) {
                    singleRoom = singleRoom - ( singleRoom * 0.10 );
                }
                System.out.printf("%.2f", singleRoom);
            }
            if ( roomType.equals("apartment")) {
                apartment -= apartment * 0.35;
                if ( rating.equals("positive") ) {
                    apartment += apartment * 0.25;
                }
                if ( rating.equals("negative") ) {
                    apartment = apartment - ( apartment * 0.10 );
                }
                System.out.printf("%.2f", apartment);
            }
            if ( roomType.equals("president apartment")) {
                presidentApartment -= presidentApartment * 0.15;
                if ( rating.equals("positive") ) {
                    presidentApartment = presidentApartment + ( presidentApartment * 0.25 );
                }
                if ( rating.equals("negative") ) {
                    presidentApartment = presidentApartment - ( presidentApartment * 0.10 );
                }
                System.out.printf("%.2f", presidentApartment);
            }
        }
        if ( daysToStay > 15 ) {
            if ( roomType.equals("room for one person") ) {
                if ( rating.equals("positive") ) {
                    singleRoom = singleRoom + ( singleRoom * 0.25 );
                }
                if ( rating.equals("negative") ) {
                    singleRoom = singleRoom - ( singleRoom * 0.10 );
                }
                System.out.printf("%.2f", singleRoom);
            }
            if ( roomType.equals("apartment")) {
                apartment -= apartment * 0.50;
                if ( rating.equals("positive") ) {
                    apartment += apartment * 0.25;
                }
                if ( rating.equals("negative") ) {
                    apartment = apartment - ( apartment * 0.10 );
                }
                System.out.printf("%.2f", apartment);
            }
            if ( roomType.equals("president apartment")) {
                presidentApartment -= presidentApartment * 0.20;
                if ( rating.equals("positive") ) {
                    presidentApartment = presidentApartment + ( presidentApartment * 0.25 );
                }
                if ( rating.equals("negative") ) {
                    presidentApartment = presidentApartment - ( presidentApartment * 0.10 );
                }
                System.out.printf("%.2f", presidentApartment);
            }

        }

    }
}
