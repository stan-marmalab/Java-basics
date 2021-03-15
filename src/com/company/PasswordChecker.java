package com.company;

import java.util.Scanner;
public class PasswordChecker {
    public static void main (String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String currentPassword = "s3cr3t!P@ssw0rd";

        String newPassword = scanner.nextLine();

        if (currentPassword.equals(newPassword)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
