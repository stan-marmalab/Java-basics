package com.company;

import java.util.Scanner;
public class TypeOfAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animal = scanner.nextLine();

        switch (animal) {
            case "dog" -> System.out.println("mammal");
            case "crocodile", "tortoise", "snake" -> System.out.println("reptile");
            default -> System.out.println("unknown");
        }
    }
}
