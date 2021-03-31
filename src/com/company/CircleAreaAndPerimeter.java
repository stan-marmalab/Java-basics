package com.company;

import java.util.Scanner;
public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());
        double circlePerimeter = 2 * Math.PI * r;
        double circleArea = Math.PI * ( r * r );

        System.out.printf("%.2f\n",circleArea);
        System.out.printf("%.2f",circlePerimeter);
    }
}
