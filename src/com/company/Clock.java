package com.company;

public class Clock {
    public static void main(String[] args) {

        for (int i = 0; i <= 23; i++) { // chas
            for (int j = 0; j <= 59 ; j++) { // minuta
                System.out.printf("%d:%d%n", i,j);
            }
        }
    }
}
