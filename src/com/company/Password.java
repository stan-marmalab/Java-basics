package com.company;

import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String reverse = new StringBuffer(password).reverse().toString();
        int attempts = 0;

        for (int i = 0; i <= 4; i++) {
            String userInput = scanner.nextLine();
            attempts++;
            if (  reverse.equals(userInput)) {
                System.out.println("User " + password + " logged in.");
                break;
            } else if ( attempts == 4 ) {
                System.out.println("User " + password + " blocked!");
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }
    }
}
