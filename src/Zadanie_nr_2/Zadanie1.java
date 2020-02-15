package Zadanie_nr_2;

import java.util.Scanner;

public class Zadanie1 {
    public static void main (String[]args){
        Scanner czytnik = new Scanner (System.in);
        int liczba_nieparzysta = 0;
        System.out.println(" Podaj liczbę dodatnią ");
        liczba_nieparzysta = czytnik.nextInt();
        if (liczba_nieparzysta<=0)
            System.out.println(" Błąd  - podana liczba nie jest dodatnia ");
        else
        System.out.println(" wyświetl kolejno liczby nieparzyste mniejsze od podanej liczby ");
 int STALA = 1;
       while (STALA<=liczba_nieparzysta)
       {
           System.out.print(STALA+ ".");
           STALA = STALA +2;
        }

    }
}
