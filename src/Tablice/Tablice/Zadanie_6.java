package Tablice.Tablice;

import java.util.Scanner;

public class Zadanie_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int rozmiarN = scanner.nextInt();
        int[] tablica = new int[rozmiarN];
        System.out.println(" Podaj liczby");
        for (int i = 0; i <tablica.length ; i++) {
            tablica[i] = scanner.nextInt(); }
        System.out.print("Wpisane liczby to ");
        for (int i = 0; i <tablica.length ; i++) {
            System.out.print( tablica[i]+ " ");
        }
        int liczba_max = 0;

        for (int i = 0; i <tablica.length ; i++) {
            if (liczba_max>tablica[i]){
                continue;}
            liczba_max = tablica[i];  }
        System.out.println();
        System.out.println("Liczba maksymalna to "+liczba_max);
//        zliczanie wystąpień
        int liczba_wystapien = 0;
        for (int i = 0; i <tablica.length ; i++) {
            if (liczba_max==tablica[i]){
                liczba_wystapien++; }

}if (liczba_wystapien==1)
        System.out.println("Liczba maksymalna występuje "+liczba_wystapien+" raz");
        else
            System.out.println("Liczba maksymalna występuje "+liczba_wystapien+" razy");
}
}



