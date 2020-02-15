package Moje_zadania_instrukcje_warunkowe;

import java.util.Scanner;

public class Wstep_do_Javy_zadanie_4 {
    public static void main (String[]args){
        Scanner czytnik = new Scanner(System.in);
        System.out.println(" Wylosowałem liczbę z zakresu od 0-9, zgadnij jaką:");
        int liczba = 0;
        liczba = czytnik.nextInt();{
        if (liczba>9 || liczba<0){
            System.out.println ("Błąd, wprowadź poprawną liczbę");} }
            { switch (liczba){
                case 5:
                    System.out.println("Brawo, trafłeś");
                    break;
                default:if(liczba<=9 && liczba>=0)
                    System.out.println(" Porażka");
            }
        System.out.println(" Koniec programu :-)");
        }
        }
}



