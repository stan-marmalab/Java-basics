package com.company;

import java.util.Scanner;

public class KidStore {
    public static void main (String[] str){
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int numberOfPuzzles = Integer.parseInt(scanner.nextLine());
        int talkingDolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int numberOfMinions = Integer.parseInt(scanner.nextLine());
        int numberOfTrucks = Integer.parseInt(scanner.nextLine());

        double totalPuzzlesSold = 2.60 * numberOfPuzzles;
        double totalTalkingDollsSold = 3 * talkingDolls;
        double totalTeddyBearsSold = 4.10 * teddyBears;
        double totalMinionsSold = 8.20 * numberOfMinions;
        double totalTrucksSold = 2 * numberOfTrucks;

        double totalToys = numberOfPuzzles + talkingDolls + teddyBears + numberOfMinions + numberOfTrucks;
        double sumOfOrders = totalPuzzlesSold + totalTalkingDollsSold + totalTeddyBearsSold + totalMinionsSold + totalTrucksSold;

        if (totalToys >= 50) {
            sumOfOrders = sumOfOrders * 0.75;
        }
        double rent = sumOfOrders * 0.9;

        if (rent >= excursionPrice) {
            double moneyLeft = rent - excursionPrice;
            System.out.printf("Yes! %.2f lv left.%n", moneyLeft);
        } else {
            double moneyLeft = excursionPrice - rent;
            System.out.printf("Not enough money! %.2f lv needed.%n", moneyLeft);
        }
    }
}
