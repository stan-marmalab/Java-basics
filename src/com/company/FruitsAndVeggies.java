package com.company;
import java.util.Scanner;

public class FruitsAndVeggies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruitName = scanner.next();

        if ( fruitName.matches("banana|apple|kiwi|cherry|lemon|grapes") ) {
            System.out.println("fruit");
        } else if ( fruitName.matches("tomato|cucumber|pepper|carrot") ) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
