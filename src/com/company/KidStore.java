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
        int trucks = Integer.parseInt(scanner.nextLine());

        double totalPuzzlesSold = numberOfPuzzles * 2.60;
        double totalTalkingDollsSold = talkingDolls * 3.0;
        double totalTeddyBearsSold = teddyBears * 4.10;
        double totalMinionsSold = numberOfMinions * 8.20;
        double totalTrucksSold = trucks * 2.0;

        double sum = totalPuzzlesSold + totalTalkingDollsSold + totalTeddyBearsSold + totalMinionsSold + totalTrucksSold;
        double totalToys = numberOfPuzzles + talkingDolls + teddyBears + numberOfMinions + trucks;

        if (totalToys >= 50) {
            sum = sum - (sum * 0.25);
        }
        double rent = sum - (sum * 0.10);
        double isItEnoughForExcursion = Math.abs(rent - excursionPrice);

        if (isItEnoughForExcursion >= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", isItEnoughForExcursion);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", isItEnoughForExcursion);
        }
    }
}
