package com.company;

import java.util.Scanner;
public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            if ( text.charAt(i) == 'a' ) {
                sum += 1;
            } else if ( text.charAt(i) == 'e' ) {
                sum += 2;
            } else if ( text.charAt(i) == 'i' ) {
                sum += 3;
            } else if ( text.charAt(i) == 'o' ) {
                sum += 4;
            } else if ( text.charAt(i) == 'u' ) {
                sum += 5;
            }
        }
        System.out.println(sum);
    }
}
