package com.company;
import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = Integer.parseInt(scanner.nextLine());
        int total = 0, z;

        for (int i = 0; i < numberOfNumbers; i++) {
            z = Integer.parseInt(scanner.nextLine());
            total = total + z;
        }
        System.out.println(total);
    }
}
