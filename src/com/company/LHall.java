package com.company;

import java.util.Scanner;

public class LHall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // вход
        double lengthInMeters = Double.parseDouble(scan.nextLine());
        double widthInMeters = Double.parseDouble(scan.nextLine());

        // разделяме дължина на залата / 120 см, за да получим редове
        int rowsCount = (int) Math.floor (lengthInMeters / 1.2) ;

        // намиране на брой места на ред
        int colsCount = (int) Math.floor ((widthInMeters - 1) / 0.7) ;

        // намиране брой места в залата
        // минус 3 места за катедрата и входната врата
        int deskCount = rowsCount * colsCount - 3;

        // изход
        System.out.println(deskCount);
    }
}