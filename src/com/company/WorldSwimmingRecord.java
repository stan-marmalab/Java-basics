package com.company;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double distanceCoveredInSeconds = Double.parseDouble(scanner.nextLine());

        double distanceCover = distanceInMeters * distanceCoveredInSeconds;
        double addAdditionTime = Math.floor(distanceInMeters / 15) * 12.5;

        double totalTimeWithAdditionTime = distanceCover + addAdditionTime;

        if (totalTimeWithAdditionTime >= recordInSeconds) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(totalTimeWithAdditionTime - recordInSeconds));
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTimeWithAdditionTime);
        }
    }
}
