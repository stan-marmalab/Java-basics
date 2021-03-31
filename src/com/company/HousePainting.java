package com.company;

import java.util.Scanner;
public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double houseHeight = Double.parseDouble(scanner.nextLine());
        double lenghtOfSideWall = Double.parseDouble(scanner.nextLine());
        double heightOfTheTriangleSideOfTheHouse = Double.parseDouble(scanner.nextLine());

        // walls
        double sideWall = houseHeight * lenghtOfSideWall;
        double window = 1.5 * 1.5;
        double bothSides = ( 2 * sideWall ) - ( 2 * window );
        double backWall = ( houseHeight * houseHeight );
        double back = ( 2 * backWall ) - ( 1.2 * 2);
        double totalWalls = ( bothSides + back ) / 3.4;

        // roof
        double roofTop = 2 * ( houseHeight * lenghtOfSideWall );
        double bothTriangles = 2 * ( houseHeight * heightOfTheTriangleSideOfTheHouse / 2);
        double forRoof = ( roofTop + bothTriangles ) / 4.3;

        System.out.printf("%.2f\n", totalWalls);
        System.out.printf("%.2f", forRoof);
    }
}
