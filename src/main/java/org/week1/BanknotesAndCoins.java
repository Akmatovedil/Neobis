package org.week1;

import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double value = scanner.nextDouble() * 100;

        int[] notes = {10000, 5000, 2000, 1000, 500, 200};
        int[] coins = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");


        for (int note : notes) {
            int count = (int) (value / note);
            value -= count * note;
            System.out.printf("%d nota(s) de R$ %.2f%n", count, note / 100.0);
        }

        System.out.println("MOEDAS:");

        for (int coin : coins) {
            int count = (int) (value / coin);
            value -= count * coin;
            System.out.printf("%d moeda(s) de R$ %.2f%n", count, coin / 100.0);
        }

        scanner.close();
    }
}

