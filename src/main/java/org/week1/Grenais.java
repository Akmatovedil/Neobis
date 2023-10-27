package org.week1;

import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int interGoals, gremioGoals, victoriesInter = 0, victoriesGremio = 0, draws = 0, grenais = 0;

        do {
            interGoals = scanner.nextInt();
            gremioGoals = scanner.nextInt();

            grenais++;

            if (interGoals > gremioGoals) {
                victoriesInter++;
            } else if (gremioGoals > interGoals) {
                victoriesGremio++;
            } else {
                draws++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
        } while (scanner.nextInt() == 1);

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + victoriesInter);
        System.out.println("Gremio:" + victoriesGremio);
        System.out.println("Empates:" + draws);

        if (victoriesInter > victoriesGremio) {
            System.out.println("Inter venceu mais");
        } else if (victoriesGremio > victoriesInter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }

        scanner.close();
    }
}
