package Zadania_nr_1;

import java.util.Scanner;

public class Konwersja_wartosci_temperatury_z_stopni_na_Fahrenheita_zadanie1 {
    public static void main(String[]args){
        Scanner czytnik = new Scanner (System.in);
        double stopnie_celsjusza = 0;
        System.out.println("Podaj wartość w stopniach celsjusza ");
        stopnie_celsjusza = czytnik.nextDouble();
        double stopnie_fahrenheita = 1.8 * stopnie_celsjusza + 32.0;
        System.out.println("Jest to "+ stopnie_fahrenheita+ " stopnia Fahrenheita");
    }
}
