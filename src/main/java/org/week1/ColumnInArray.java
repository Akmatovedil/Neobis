package org.week1;

import java.util.Scanner;

public class ColumnInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int column = scanner.nextInt();

        char operation = scanner.next().charAt(0);

        double sum = 0.0;
        int count = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                double element = scanner.nextDouble();
                if (j == column) {
                    sum += element;
                    count++;
                }
            }
        }

        if (operation == 'S') {
            System.out.printf("%.1f%n", sum);
        } else if (operation == 'M') {
            double average = sum / count;
            System.out.printf("%.1f%n", average);
        }

        scanner.close();
    }
}
