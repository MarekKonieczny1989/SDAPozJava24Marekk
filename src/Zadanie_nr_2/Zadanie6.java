package Zadanie_nr_2;

import java.util.Random;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[]args){
        Random losowanie = new Random();
        int liczba = 0;
        liczba = losowanie.nextInt(101);

        Scanner czytnik = new Scanner (System.in);
        int liczba1  = 0;
        System.out.println("Podaj liczbę");
        liczba1 = czytnik.nextInt();

        if (liczba1>liczba)
            System.out.println(" Podałeś za dużą wartość");

        else if (liczba1<liczba)
            System.out.println(" Podałeś za małą wartość ");
        else
            System.out.println(" Gratulacje, koniec gry");


    }
}
