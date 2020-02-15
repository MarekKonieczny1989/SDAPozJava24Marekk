package Tablice.Tablice;

import java.util.Scanner;

public class zadanie_2 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą z zakresu 1-30 ");
        int liczba_calkowita = 0;
        liczba_calkowita = scanner.nextInt();
        int[] tablica = new int[liczba_calkowita];
        if (liczba_calkowita < 1 || liczba_calkowita > 30)
            System.out.println("Koniec programu - niewłasciwa liczba");
        else {
            for (int i = 0; i < tablica.length; i++)
                tablica[i]=i*i;
            for (int i = 1; i < tablica.length; i++)
                System.out.println(tablica[i]);

            }
        }

    }
