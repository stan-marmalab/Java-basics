package com.company;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double earnings = Double.parseDouble(scanner.nextLine());
        double averageScore = Double.parseDouble(scanner.nextLine());
        double minimumWage = Double.parseDouble(scanner.nextLine());

        double socialScholarship = 0.0;
        double scholarshipForExcellentScore = 0.0;

        boolean isItGoingToTakeScholarship = false;

        if ( earnings < minimumWage && averageScore > 4.50) {
            isItGoingToTakeScholarship = true;
            socialScholarship = Math.floor(minimumWage * 0.35);
        }

        if ( averageScore >= 5.50) {
            isItGoingToTakeScholarship = true;
            scholarshipForExcellentScore = Math.floor(averageScore * 25);
        }

        if ( !isItGoingToTakeScholarship ) {
            System.out.println("You cannot get a scholarship!");
        } else if ( socialScholarship > scholarshipForExcellentScore) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        } else {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", scholarshipForExcellentScore);
        }
    }
}
