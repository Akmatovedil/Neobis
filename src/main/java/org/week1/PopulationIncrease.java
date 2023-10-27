package org.week1;

import java.util.Scanner;

public class PopulationIncrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int years = 0;
            long PA = scanner.nextLong();
            long PB = scanner.nextLong();
            double G1 = scanner.nextDouble();
            double G2 = scanner.nextDouble();

            while (PA <= PB) {
                // Calculate the population growth
                PA = (long) (PA * (1.0 + G1 / 100));
                PB = (long) (PB * (1.0 + G2 / 100));

                years++;

                if (years > 100) {
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            }

            if (years <= 100) {
                System.out.println(years + " anos.");
            }
        }

        scanner.close();
    }

}
