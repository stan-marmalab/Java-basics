package com.company;

import java.util.Scanner;
public class StrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,i;
        int fact_n,lastdig;

        n = scanner.nextInt();
        int total = 0;
        int temp_n = n;
        while(n != 0) {
            i = 1;
            fact_n = 1;
            lastdig = n % 10;
            while(i <= lastdig) {
                fact_n = fact_n * i;
                i++;
            }
            total = total + fact_n;
            n = n / 10;
        }
        if(total == temp_n) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
