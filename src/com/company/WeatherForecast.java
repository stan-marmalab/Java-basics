package com.company;

import java.util.Scanner;
public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String weather = scanner.nextLine();

        switch ( weather ) {
            case "sunny":
                System.out.println("It's warm outside!");
                break;
            case "cloudy":
            case "snowy":
            default:
                System.out.println("It's cold outside!");
                break;
        }
    }
}
