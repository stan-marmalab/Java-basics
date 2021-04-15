package com.company;

import java.util.Scanner;
public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();

        int total = 0;
        int student = 0;
        int kid = 0;
        int standard = 0;
        while (!movie.equals("Finish")) {

            String movieName = movie;
            int freeSits = Integer.parseInt(scanner.nextLine());
            int counterTicket = 0;

            String end = scanner.nextLine();
            while (!end.equals("End") ) {
                String typeOfTicket = end;
                counterTicket++;

                switch (typeOfTicket) {
                    case "student":
                        student++;
                        break;
                    case "kid":
                        kid++;
                        break;
                    case "standard":
                        standard++;
                        break;
                }

                if ( counterTicket == freeSits ) {
                    break;
                }
                end = scanner.nextLine();
            }
            total += counterTicket;

            System.out.printf("%s - %.2f%% full.%n", movieName, counterTicket * 1.0 / freeSits * 100);

            movie = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", total);
        System.out.printf("%.2f%% student tickets.%n", student * 1.0 / total * 100);
        System.out.printf("%.2f%% standard tickets.%n", standard * 1.0 / total * 100);
        System.out.printf("%.2f%% kids tickets.%n", kid * 1.0 / total * 100);
    }
}
