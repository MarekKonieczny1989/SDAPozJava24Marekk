package Zadanie_nr_2;

import java.util.Scanner;

public class Zadanie2B {
    public static void main(String[]args){
        Scanner czytnik = new Scanner (System.in);
        int liczba_A = 0;
        System.out.println(" Podaj pierwszą liczbę");
        liczba_A = czytnik.nextInt();
        int liczba_B = 0;
        System.out.println(" Podaj drugą liczbę");
        liczba_B = czytnik.nextInt();
        System.out.println("Suma ciągu liczb pierwszej i drugiej to:");
        int suma = 0;
        do{suma = suma + liczba_A++;
            System.out.println(suma);}
        while (liczba_A<=liczba_B);
    }
}
