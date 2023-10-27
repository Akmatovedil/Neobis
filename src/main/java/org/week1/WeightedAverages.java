package org.week1;

import java.util.Scanner;

public class WeightedAverages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double num3 = scanner.nextDouble();

            double weightedAverage = (num1 * 2 + num2 * 3 + num3 * 5) / 10;

            System.out.printf("%.1f%n", weightedAverage);
        }

        scanner.close();
    }
}
