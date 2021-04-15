package com.company;

import java.util.Scanner;
public class Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {

            String destination2 = destination;
            double costOfTheTrip = Double.parseDouble(scanner.nextLine());
            double saved = 0;

            while ( saved < costOfTheTrip ) {
                double sum = Double.parseDouble(scanner.nextLine());
                saved += sum;
            }

            System.out.printf("Going to %s!\n", destination2);
            destination = scanner.nextLine();
        }
    }
}
