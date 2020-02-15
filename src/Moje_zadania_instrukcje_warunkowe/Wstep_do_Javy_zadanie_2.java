package Moje_zadania_instrukcje_warunkowe;

import java.util.Scanner;

public class Wstep_do_Javy_zadanie_2 {
    public static void main(String[]args){
        Scanner czytnik = new Scanner (System.in);
        double a = 0;
        System.out.println(" Liczenie pierwiastków równania kwadratowego");
        System.out.println();
        System.out.println("Podaj liczbę dla a");
        a = czytnik.nextDouble();
        System.out.println("Podaj liczbę dla b");
        double b = 0;
        b = czytnik.nextDouble();
        double c = 0;
        System.out.println("Podaj liczbę dla c");
        c = czytnik.nextDouble();
        if(a==0){
            System.out.println("Błąd - wprowadź dla a liczbę inną niż 0");}
        else{System.out.println("Pierwszy krok: oblicz najpierw delta tj: delta = - b1(2)- 4ac");
        double wynik_delta = Math.pow(b,2) - (4*a*c);
        System.out.println(" Wynik delta = " +wynik_delta);
        double pierwiastek_delta1 = Math.sqrt(wynik_delta);
        double pierwiastek_X1 = (- b - pierwiastek_delta1) / (2 * a);
        double pierwiastek_X2 = (- b + pierwiastek_delta1)/ (2 * a);
        double pierwiastek_delta2 = - b / (2*a);// równanie ma jeden pierwiastek
        if(wynik_delta>0){
            System.out.println(" Rozwiązaniem równania jest liczba: "+ pierwiastek_X1+ " lub "+ pierwiastek_X2);}
        else if(wynik_delta == 0) {System.out.println(" Rozwiązaniem równiania jest liczba "+ pierwiastek_delta2);
        }else{
            System.out.println(" Równanie ma 0 pierwiastków, nie ma rozwiązań");
        }
        System.out.println(" Koniec programu :-)");
    }
}
}
