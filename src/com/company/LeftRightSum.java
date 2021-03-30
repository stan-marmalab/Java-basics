package com.company;

import java.util.Scanner;
public class LeftRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int total = 0, totalLeftSum = 0, totalRightSum = 0, leftSum, rightSum;

        for (int i = 0; i < numbers; i++) {
            leftSum = Integer.parseInt(scanner.nextLine());
            totalLeftSum = totalLeftSum + leftSum;
        }
        for (int z = 0; z < numbers; z++) {
            rightSum = Integer.parseInt(scanner.nextLine());
            totalRightSum = totalRightSum + rightSum;
        }
        if ( totalLeftSum == totalRightSum ) {
            System.out.println("Yes, sum = " + totalLeftSum);
        } else {
            total = Math.abs(totalLeftSum - totalRightSum);
            System.out.println("No, diff = " + total);
        }
    }
}
