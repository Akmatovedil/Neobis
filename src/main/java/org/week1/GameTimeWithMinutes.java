package org.week1;

import java.util.Scanner;

public class GameTimeWithMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialHour = scanner.nextInt();
        int initialMinute = scanner.nextInt();

        int finalHour = scanner.nextInt();
        int finalMinute = scanner.nextInt();

        // Calculate the duration in minutes
        int startTimeInMinutes = initialHour * 60 + initialMinute;
        int endTimeInMinutes = finalHour * 60 + finalMinute;
        int durationInMinutes;

        if (endTimeInMinutes <= startTimeInMinutes) {
            durationInMinutes = 24 * 60 - startTimeInMinutes + endTimeInMinutes;
        } else {
            durationInMinutes = endTimeInMinutes - startTimeInMinutes;
        }

        int durationHours = durationInMinutes / 60;
        int durationMinutes = durationInMinutes % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", durationHours, durationMinutes);




        scanner.close();
    }
}
