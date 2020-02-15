package Zadania_nr_1;

import java.util.Scanner;

public class Zadanie_4 {
    public static void main(String[]args ){
        System.out.println("Obliczanie należnego podatku dochodowego od osób fizycznych ");
        System.out.println(" Podaj swój roczny dochód [zł] ");
        Scanner czytnik = new Scanner (System.in);
        double dochod = 0;
        dochod = czytnik.nextDouble();
        if (dochod <= 85528 )
            System.out.println(" Podatek wynosi "+ ( dochod * 0.18 - 556.02)+ " zł");
        else
            System.out.println("Podatek wynosi "+( 14_839.02 + ((dochod - 85_528)*0.32)+" zł"));
        System.out.println();
        System.out.println(" Koniec zadania");
    }
}
