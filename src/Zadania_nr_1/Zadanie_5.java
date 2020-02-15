package Zadania_nr_1;

import java.util.Scanner;

public class Zadanie_5 {
    public static void main (String[]args){
        Scanner czytnik = new Scanner (System.in);
        System.out.println(" Podaj cenę towaru  w zakresie od 100 zł do 10.000,00 zł.");
        
        double cena_Towaru = 0;
        cena_Towaru = czytnik.nextDouble();

        if(cena_Towaru < 100 || cena_Towaru > 10000)
            System.out.println(" Błąd - podaj dane mieszczące się we wskazanym zakresie ");
    else System.out.println(" Podaj liczbę rat w zakresie od 6 do 48 ");

        int liczba_Rat = 0;
        liczba_Rat = czytnik.nextInt();
        if (liczba_Rat<6 || liczba_Rat>48)
            System.out.println(" Błąd - podaj dane mieszczące się we wskazanym zakresie ");

        double odsetki_1 = cena_Towaru * 0.025;
        double odsetki_2 = cena_Towaru * 0.05;
        double odsetki_3 = cena_Towaru * 0.1;

if (liczba_Rat>=6 && liczba_Rat<=12)
    System.out.println(" Miesięczna rata wynosi: " + ((cena_Towaru/liczba_Rat) + (odsetki_1/liczba_Rat)) + " zł " );
else if (liczba_Rat>=13 && liczba_Rat<=24)
    System.out.println(" Miesięczna rata wynosi: " + ((cena_Towaru/ liczba_Rat) + (odsetki_2/liczba_Rat))  + " zł" );
else if (liczba_Rat>=25)
    System.out.println(" Miesięczna rata wynosi: " + ((cena_Towaru/liczba_Rat) + (odsetki_3/liczba_Rat)) + " zł" );
        System.out.println();
        System.out.println(" Koniec programu ");

    }
}
