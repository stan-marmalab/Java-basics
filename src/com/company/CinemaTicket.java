package com.company;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.next();

        if ( dayOfWeek.matches("Monday|Tuesday|Friday")) {
            System.out.println("12");
        }
        if ( dayOfWeek.matches("Wednesday|Thursday")) {
            System.out.println("14");
        }
        if ( dayOfWeek.matches("Saturday|Sunday")) {
            System.out.println("16");
        }
    }
}
