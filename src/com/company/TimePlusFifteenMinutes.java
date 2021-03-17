package com.company;

import java.util.Scanner;

public class TimePlusFifteenMinutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // input
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        // minutes = minutes + 15
        minutes += 15;

        if (minutes > 59) {

            // minute = minutes - 60
            minutes -= 60;
            // minutes = minutes + 1
            hours += 1;
        }

        if (hours > 23) {
            // hours = hours - 24
            hours -= 24;
        }

        // output
        System.out.printf("%1$d:%2$02d", hours, minutes);
    }
}
