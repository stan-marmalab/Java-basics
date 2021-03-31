package com.company;

import java.util.Scanner;
public class VeggieMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForVeggiesPerKilo = Double.parseDouble(scanner.nextLine());
        double priceForFruitsPerKilo = Double.parseDouble(scanner.nextLine());
        double totalVeggieKilos = Double.parseDouble(scanner.nextLine());
        double totalFruitKilos = Double.parseDouble(scanner.nextLine());

        double totalSum = ( ( priceForVeggiesPerKilo * totalVeggieKilos ) + ( priceForFruitsPerKilo * totalFruitKilos ) ) / 1.94;

        System.out.printf("%.2f", totalSum);
    }
}
