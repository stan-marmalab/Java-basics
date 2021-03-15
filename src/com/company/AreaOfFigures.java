package com.company;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main (String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String choice = scanner.nextLine();

        // If choice is square - calculate square area
        if (choice.equals("square")) {

            double sideArea = Double.parseDouble(scanner.nextLine());
            double side = sideArea * sideArea;

            System.out.printf("%.3f", side);
        }

        // If choice is rectangle - calculate rectangle area
        if (choice.equals("rectangle")) {
            double sideOne = Double.parseDouble(scanner.nextLine());
            double sideTwo = Double.parseDouble(scanner.nextLine());
            double areaOfRectangle = sideOne * sideTwo;

            System.out.printf("%.3f", areaOfRectangle);
        }

        // If choice is circle - calculate circle area
        if (choice.equals("circle")) {

            double radius = Double.parseDouble(scanner.nextLine());
            double areaOfCircle = Math.PI * radius * radius;

            System.out.printf("%.3f", areaOfCircle);
        }

        // If choice is triangle - calculate triangle area
        if (choice.equals("triangle")) {
            double sideOne = Double.parseDouble(scanner.nextLine());
            double lengthOfSide = Double.parseDouble(scanner.nextLine());
            double areaOfTriangle = (sideOne * lengthOfSide) / 2;

            System.out.printf("%.3f", areaOfTriangle);
        }


    }
}
