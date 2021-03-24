package com.company;

import java.util.Scanner;
public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (town.equals("Sofia")) {
            if (product.equals("coffee")) {
                double price = quantity * 0.50;
                System.out.println(price);
            }
            if (product.equals("water")) {
                double price = quantity * 0.80;
                System.out.println(price);
            }
            if (product.equals("beer")) {
                double price = quantity * 1.20;
                System.out.printf("%.1f", price);
            }
            if (product.equals("sweets")) {
                double price = quantity * 1.45;
                System.out.printf("%.4f", price);
            }
            if (product.equals("peanuts")) {
                double price = quantity * 1.60;
                System.out.println(price);
            }
        }
        if (town.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                double price = quantity * 0.40;
                System.out.println(price);
            }
            if (product.equals("water")) {
                double price = quantity * 0.70;
                //System.out.println(price);
                System.out.printf("%.1f", price);
            }
            if (product.equals("beer")) {
                double price = quantity * 1.15;
                System.out.printf("%.1f", price);
            }
            if (product.equals("sweets")) {
                double price = quantity * 1.30;
                System.out.printf("%.4f", price);
            }
            if (product.equals("peanuts")) {
                double price = quantity * 1.50;
                System.out.println(price);
            }
        }
        if (town.equals("Varna")) {
            if (product.equals("coffee")) {
                double price = quantity * 0.45;
                System.out.println(price);
            }
            if (product.equals("water")) {
                double price = quantity * 0.70;
                System.out.println(price);
            }
            if (product.equals("beer")) {
                double price = quantity * 1.10;
                System.out.printf("%.1f", price);
            }
            if (product.equals("sweets")) {
                double price = quantity * 1.35;
                System.out.printf("%.4f", price);
            }
            if (product.equals("peanuts")) {
                double price = quantity * 1.55;
                System.out.println(price);
            }
        }
    }
}
