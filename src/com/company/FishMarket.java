package com.company;

import java.util.Scanner;
public class FishMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOfSkumriq = Double.parseDouble(scanner.nextLine());
        double priceOfCaca = Double.parseDouble(scanner.nextLine());
        double palamudKilos = Double.parseDouble(scanner.nextLine());
        double safridKilos = Double.parseDouble(scanner.nextLine());
        double midiKilos = Double.parseDouble(scanner.nextLine());

        double priceOfPalamud = palamudKilos * ( priceOfSkumriq + ( priceOfSkumriq * 0.60) );
        double priceOfSafrid = safridKilos * ( priceOfCaca + ( priceOfCaca * 0.80 ) );
        double priceOfMidi = midiKilos * 7.50;

        System.out.printf("%.2f", priceOfMidi + priceOfPalamud + priceOfSafrid);
    }
}
