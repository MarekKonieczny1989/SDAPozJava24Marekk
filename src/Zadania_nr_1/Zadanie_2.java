package Zadania_nr_1;

import java.util.Scanner;

public class Zadanie_2 {
    public static void main (String[]args){
        Scanner czytnik = new Scanner(System.in);
        int pierwsza_Liczba = 0;
        System.out.println("Podaj pierwszą liczbę");
        pierwsza_Liczba = czytnik.nextInt();
        int druga_Liczba = 0;
        System.out.println(" Podaj drugą liczbę");
        druga_Liczba = czytnik.nextInt();
        int trzecia_Liczba = 0;
        System.out.println(" Podaj trzecią liczbę");
        trzecia_Liczba = czytnik.nextInt();{
        if(pierwsza_Liczba>druga_Liczba && druga_Liczba>trzecia_Liczba )
            System.out.println("Największa liczba to "+ pierwsza_Liczba +" a najmniejsza to "+trzecia_Liczba);
        else if (druga_Liczba>pierwsza_Liczba && pierwsza_Liczba>trzecia_Liczba)
            System.out.println(" Największa liczba to " + druga_Liczba + " a najmnieszja to "+ trzecia_Liczba );
        else if (druga_Liczba>trzecia_Liczba && trzecia_Liczba>pierwsza_Liczba)
            System.out.println(" Największa liczba to " + druga_Liczba + " a najmnieszja to "+ pierwsza_Liczba);
        else if (pierwsza_Liczba> trzecia_Liczba && trzecia_Liczba>druga_Liczba )
            System.out.println(" Największa liczba to "+ pierwsza_Liczba+ " a najmniejsza liczba to "+ druga_Liczba);
        else if (trzecia_Liczba>pierwsza_Liczba && pierwsza_Liczba > druga_Liczba)
            System.out.println(" Największa liczba to " +trzecia_Liczba + " a namjmniejsza liczba to "+ druga_Liczba);
        else if (trzecia_Liczba>druga_Liczba && druga_Liczba> pierwsza_Liczba)
            System.out.println( " Największa liczba to "+ trzecia_Liczba+ " a najmniejsza liczba to "+ pierwsza_Liczba);
            System.out.println(" koniec zadania");
    }
}
}
