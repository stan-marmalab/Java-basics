package com.company;
import java.util.Scanner;
public class LowestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int large = Integer.MAX_VALUE;
        int num;

        while ( true ) {
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num < large) {
                    large = num;
                }
            } else {
                String word = scanner.next();
                if ("Stop".equalsIgnoreCase(word)) {
                    break;
                }
            }
        }
        System.out.println(large);
    }
}
