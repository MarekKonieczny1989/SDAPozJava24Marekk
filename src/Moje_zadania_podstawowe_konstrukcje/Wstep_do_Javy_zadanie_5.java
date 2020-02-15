package Moje_zadania_podstawowe_konstrukcje;

import java.util.Scanner;

public class Wstep_do_Javy_zadanie_5 {
    public static void main(String[]args) {
        Scanner czytnikDanych = new Scanner (System.in);
        double bok_A = 0;
        System.out.println(" Podaj wymiar boku A w [m]");
        bok_A = czytnikDanych.nextDouble();
        double bok_B = 0;
        System.out.println(" Podaj wymiar boku B [m]");
        bok_B = czytnikDanych.nextDouble();
        double wynik = bok_A * bok_B;
        System.out.println(" Pole prostokąta to : "+ wynik+" m");

    }
}
