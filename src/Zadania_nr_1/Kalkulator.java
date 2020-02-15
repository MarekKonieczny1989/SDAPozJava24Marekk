package Zadania_nr_1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Kalkulator {
    public static void main (String[]args){
        Scanner czytnik = new Scanner (System.in);
        double liczba_pierwsza = 0;
        System.out.println(" KALKULATOR");
        System.out.println();
        System.out.println(" Podaj pierwszą liczbę ");
        liczba_pierwsza = czytnik.nextDouble();
        String symbol_operacji_matematycznej;
        System.out.println();
        System.out.println(" Podaj symbol operacji matematycznej ");
        symbol_operacji_matematycznej = czytnik.next();
        double liczba_druga = 0;
        System.out.println(" Podaj drugą liczbę ");
        liczba_druga = czytnik.nextDouble();
        switch (symbol_operacji_matematycznej){
            case "+" :
                System.out.println(" wynik = " + (liczba_pierwsza + liczba_druga));
                break;
            case "-" :
                System.out.println(" wynik = "+ (liczba_pierwsza - liczba_druga));
                break;
            case "*":
                System.out.println(" wynik = " +(liczba_pierwsza * liczba_druga));
                break;
            case "/" :
                if (liczba_pierwsza != 0 &&  liczba_druga != 0)
                System.out.println(" wynik = " +(liczba_pierwsza / liczba_druga));
                else
                    System.out.println(" Nie można dzielić przez 0 ");
                break;
            default:
                System.out.println(" Odmowa wykonania zadania ");
                break;
        }
        System.out.println( " Koniec zadania !!! ");
    }
}
