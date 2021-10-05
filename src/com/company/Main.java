package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Introdueix el nombre de tirades: ");
        int repeticions=scan.nextInt();
        int[] resultats=new int[12];

        for (int i = 0; i < repeticions; i++) {
            resultats[(int)(Math.random()*6+1)+((int)(Math.random()*6+1))]++;
        }
        for (int i = 0; i < resultats.length; i++) {
            System.out.printf("%d --> %d%n",i+1,resultats[i]);
        }

    }
}
