package com.company;

import java.util.Scanner;
public class TradeComission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cityName = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine());

        if ( cityName.matches("Sofia|Varna|Plovdiv") ) {
            if ( s >= 0 && s <= 500 ) {
                switch (cityName) {
                    case "Sofia" -> {
                        s = (s / 100) * 5;
                        System.out.printf("%.2f", s);
                    }
                    case "Varna" -> {
                        s = (s / 100) * 4.5;
                        System.out.printf("%.2f", s);
                    }
                    case "Plovdiv" -> {
                        s = (s / 100) * 5.5;
                        System.out.printf("%.2f", s);
                    }
                }
            }
            if ( s > 500 && s <= 1000 ) {
                switch (cityName) {
                    case "Sofia" -> {
                        s = (s / 100) * 7;
                        System.out.printf("%.2f", s);
                    }
                    case "Varna" -> {
                        s = (s / 100) * 7.5;
                        System.out.printf("%.2f", s);
                    }
                    case "Plovdiv" -> {
                        s = (s / 100) * 8;
                        System.out.printf("%.2f", s);
                    }
                }
            }
            if ( s > 1000 && s <= 10000 ) {
                switch (cityName) {
                    case "Sofia" -> {
                        s = (s / 100) * 8;
                        System.out.printf("%.2f", s);
                    }
                    case "Varna" -> {
                        s = (s / 100) * 10;
                        System.out.printf("%.2f", s);
                    }
                    case "Plovdiv" -> {
                        s = (s / 100) * 12;
                        System.out.printf("%.2f", s);
                    }
                }
            }
            if ( s > 10000 ) {
                switch (cityName) {
                    case "Sofia" -> {
                        s = (s / 100) * 12;
                        System.out.printf("%.2f", s);
                    }
                    case "Varna" -> {
                        s = (s / 100) * 13;
                        System.out.printf("%.2f", s);
                    }
                    case "Plovdiv" -> {
                        s = (s / 100) * 14.5;
                        System.out.printf("%.2f", s);
                    }
                }
            }
        }
        if ( !cityName.matches("Sofia|Varna|Plovdiv") || s < 0 ) {
            System.out.println("error");
        }
    }
}
