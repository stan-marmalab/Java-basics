package com.company;

import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        boolean haveSalary = true;
        for (int i = 0; i < tabs; i++) {
            String website = scanner.nextLine();

            if ( website.equals("Facebook")) {
                salary -= 150;
            }
            if ( website.equals("Instagram") ) {
                salary -= 100;
            }
            if ( website.equals("Reddit") ) {
                salary -= 50;
            }
            if ( salary <= 0) {
                haveSalary = false;
                break;
            }
        }
        if (!haveSalary){
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}
