package Moje_zadania_instrukcje_warunkowe;

import java.util.Scanner;

public class Wstep_Javy_zadanie_1 {
    public static void main(String[]args){
        Scanner czytnik = new Scanner(System.in);
        double bok_A_przyprostokatna = 0;
        System.out.println(" podaj wymiar boku przyprostokatnej A ");
        bok_A_przyprostokatna = czytnik.nextDouble();
        double bok_B_przyprostokatna = 0;
        System.out.println(" podaj wymiar boku przprostokatnej B");
        bok_B_przyprostokatna = czytnik.nextDouble();
        double bok_C_przyprostokatna = 0;
        System.out.println( "podaj wymiar boku przprostokatnej C");
        bok_C_przyprostokatna = czytnik.nextDouble();
        double wzor_na_trojkat_prostokatny =  (Math.pow(bok_A_przyprostokatna,2)+Math.pow(bok_B_przyprostokatna,2));
        double wynik_wzoru =  Math.sqrt(wzor_na_trojkat_prostokatny);
{
    System.out.println("wynik równania a^2 + b^2 = c^2 to: "+ wzor_na_trojkat_prostokatny);
    System.out.println();
}if(bok_C_przyprostokatna == wynik_wzoru){
    System.out.println(" To jest trójkąt prostokątny");}
    else{
            System.out.println("to nie jest trójkat prostokątny");
     }
        System.out.println(" Koniec zadania");
    }
}
