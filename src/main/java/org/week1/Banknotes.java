package org.week1;

import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(n);

        for (int note : banknotes){
            int count = n / note;
            n%=note;
            System.out.println(count + " nota(s) de R$ " + note + ",00");
        }
        scanner.close();

    }
}
