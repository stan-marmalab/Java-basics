package com.company;

import java.util.Scanner;
public class Escellent {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int scores = Integer.parseInt(scanner.nextLine());

        if(scores >=5) {
            System.out.println("Excellent!");
        }
    }
}
