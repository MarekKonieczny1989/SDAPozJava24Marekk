package Tablice.Tablice;

import java.util.Scanner;

public class zadanie_4 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Podaj ilość liczb ");
        int liczby_calkowite = scanner.nextInt();


        int[] tablica = new int[liczby_calkowite];
        System.out.println(" wpisz poszczególne liczby w tablicy");
        for (int i = 0; i < tablica.length; i++)
            tablica[i] = scanner.nextInt();

        System.out.println("wyświetl największą wpisaną przez użytkownika liczbę");
        int max = tablica[0];
        for(int i=1; i<tablica.length;i++){
            if(max>tablica[i])
                continue;
            max=tablica[i];}
            System.out.println("Największa liczba to "+ max);
        }

    }

