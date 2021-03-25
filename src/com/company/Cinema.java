package com.company;
import java.util.Scanner;
public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfProjection = scanner.nextLine();
        double numberOfRows = Double.parseDouble(scanner.nextLine());
        double numberOfCols = Double.parseDouble(scanner.nextLine());

        double ticketsIncome = 0.0;

        if ( typeOfProjection.equals("Premiere") ) {
            ticketsIncome = numberOfCols * numberOfRows * 12.00;
        }
        if ( typeOfProjection.equals("Normal") ) {
            ticketsIncome = numberOfCols * numberOfRows * 7.50;
        }
        if ( typeOfProjection.equals("Discount") ) {
            ticketsIncome = numberOfCols * numberOfRows * 5.00;
        }

        System.out.printf("%.2f leva", ticketsIncome);
    }
}
