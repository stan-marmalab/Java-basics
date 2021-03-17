package com.company;

import java.util.Scanner;

public class MetricConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double metric = Double.parseDouble(scanner.nextLine());
        String inputMetric = scanner.nextLine();
        String outputMetric = scanner.nextLine();

        if (inputMetric.equals("mm") && outputMetric.equals("cm")) {
            metric = metric / 10;
        }
        if (inputMetric.equals("mm") && outputMetric.equals("m")) {
            metric = metric / 1000;
        }
        if (inputMetric.equals("m") && outputMetric.equals("mm")) {
            metric = metric * 1000;
        }
        if (inputMetric.equals("m") && outputMetric.equals("cm")) {
            metric = metric * 100;
        }
        if (inputMetric.equals("cm") && outputMetric.equals("m")) {
            metric = metric / 100;
        }
        if (inputMetric.equals("cm") && outputMetric.equals("mm")) {
            metric = metric * 10;
        }

        System.out.printf("%.3f", metric);
    }
}
