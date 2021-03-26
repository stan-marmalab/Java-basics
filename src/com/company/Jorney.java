package com.company;

import java.util.Scanner;
public class Jorney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination1 = "Bulgaria";
        String destination2 = "Balkans";
        String destination3 = "Europe";
        String accommodation1 = "Camp";
        String accommodation2 = "Hotel";

        String output = "";
        String output2 = "";
        double sumBgSummer = budget * 0.3;
        double sumBgWinter = budget * 0.7;
        double sumBalkansSummer = budget * 0.4;
        double sumBalkansWinter = budget * 0.8;
        double sumEurope = budget * 0.9;

        if (budget <= 100) {
            switch (season) {
                case "summer" -> {
                    output = String.format("Somewhere in %s", destination1);
                    output2 = String.format("%s - %.2f", accommodation1, sumBgSummer);
                }
                case "winter" -> {
                    output = String.format("Somewhere in %s", destination1);
                    output2 = String.format("%s - %.2f", accommodation2, sumBgWinter);
                }
            }
        }
        if (budget <= 1000 && budget > 100) {
            switch (season) {
                case "summer" -> {
                    output = String.format("Somewhere in %s", destination2);
                    output2 = String.format("%s - %.2f", accommodation1, sumBalkansSummer);
                }
                case "winter" -> {
                    output = String.format("Somewhere in %s", destination2);
                    output2 = String.format("%s - %.2f", accommodation2, sumBalkansWinter);
                }
            }
        }
        if (budget > 1000){
            output = String.format("Somewhere in %s", destination3);
            output2 = String.format("%s - %.2f", accommodation2,sumEurope);
        }

        System.out.println(output);
        System.out.println(output2);
    }
}
