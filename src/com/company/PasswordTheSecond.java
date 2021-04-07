package com.company;

import java.util.Scanner;
public class PasswordTheSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();
        String userPassword = scanner.nextLine();

        while (!userPassword.equals(password)) {
            userPassword = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", username);
    }
}
