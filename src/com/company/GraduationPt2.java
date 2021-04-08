package com.company;

import java.util.Scanner;
public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();

        int counter = 0; // counter grade
        int poor = 0; // counter poor grade
        double sum = 0; // sum of the grades

        while ( counter < 12 ) {
            double newGrade = Double.parseDouble(scanner.nextLine());
            if ( newGrade >= 4.00 ) {
                sum += newGrade;
            } else {
                poor++;
                if ( poor == 2 ) {
                    System.out.printf("%s has been excluded at %d grade", studentName, counter);
                    break;
                }
            }
            counter++;

            if ( counter == 12 ) {
                sum = sum / 12;
                System.out.printf("%s graduated. Average grade: %.2f", studentName, sum);
            }
        }

    }
}
