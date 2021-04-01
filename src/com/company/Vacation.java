package com.company;

import java.util.Scanner;
public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGroup = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double totalSum = 0;

        if ( typeOfGroup.equals("Students") ) {
            if ( dayOfWeek.equals("Friday") ) {
                if ( numberOfGroup >= 30 ) {
                    totalSum = numberOfGroup * 8.45;
                    totalSum = totalSum - ( totalSum * 0.15);
                    System.out.printf("Total price: %.2f", totalSum);
                } else {
                    totalSum = numberOfGroup * 8.45;
                    System.out.printf("Total price: %.2f", totalSum);
                }
            }
            if ( dayOfWeek.equals("Saturday") ) {
                if ( numberOfGroup >= 30 ) {
                    totalSum = numberOfGroup * 9.80;
                    totalSum = totalSum - ( totalSum * 0.15);
                    System.out.printf("Total price: %.2f", totalSum);
                } else {
                    totalSum = numberOfGroup * 9.80;
                    System.out.printf("Total price: %.2f", totalSum);
                }
            }
            if ( dayOfWeek.equals("Sunday") ) {
                if ( numberOfGroup >= 30 ) {
                    totalSum = numberOfGroup * 10.46;
                    totalSum = totalSum - ( totalSum * 0.15);
                    System.out.printf("Total price: %.2f", totalSum);
                } else {
                    totalSum = numberOfGroup * 10.46;
                    System.out.printf("Total price: %.2f", totalSum);
                }
            }
        }
        if ( typeOfGroup.equals("Business") ) {
            if ( dayOfWeek.equals("Friday") ) {
                if ( numberOfGroup >= 100 ) {
                    totalSum = ( numberOfGroup - 10 ) * 10.90;
                } else {
                    totalSum = numberOfGroup * 10.90;
                }
                System.out.printf("Total price: %.2f", totalSum);
            }
            if ( dayOfWeek.equals("Saturday") ) {
                if ( numberOfGroup >= 100 ) {
                    totalSum = ( numberOfGroup - 10 ) * 15.60;
                } else {
                    totalSum = numberOfGroup * 15.60;
                }
                System.out.printf("Total price: %.2f", totalSum);
            }
            if ( dayOfWeek.equals("Sunday") ) {
                if ( numberOfGroup >= 100 ) {
                    totalSum = ( numberOfGroup - 10 ) * 16;
                } else {
                    totalSum = numberOfGroup * 16;
                }
                System.out.printf("Total price: %.2f", totalSum);
            }
        }
        if ( typeOfGroup.equals("Regular") ) {
            if ( dayOfWeek.equals("Friday") ) {
                if ( numberOfGroup >= 10 && numberOfGroup <= 20 ) {
                    totalSum = numberOfGroup * 15;
                    totalSum = totalSum - ( totalSum * 0.05);
                    System.out.printf("Total price: %.2f", totalSum);
                } else {
                    totalSum = numberOfGroup * 15;
                    System.out.printf("Total price: %.2f", totalSum);
                }
            }
            if ( dayOfWeek.equals("Saturday") ) {
                if ( numberOfGroup >= 10 && numberOfGroup <= 20 ) {
                    totalSum = numberOfGroup * 20;
                    totalSum = totalSum - ( totalSum * 0.05);
                    System.out.printf("Total price: %.2f", totalSum);
                } else {
                    totalSum = numberOfGroup * 20;
                    System.out.printf("Total price: %.2f", totalSum);
                }
            }
            if ( dayOfWeek.equals("Sunday") ) {
                if ( numberOfGroup >= 10 && numberOfGroup <= 20 ) {
                    totalSum = numberOfGroup * 22.50;
                    totalSum = totalSum - ( totalSum * 0.05);
                    System.out.printf("Total price: %.2f", totalSum);
                } else {
                    totalSum = numberOfGroup * 22.50;
                    System.out.printf("Total price: %.2f", totalSum);
                }
            }
        }
    }
}
