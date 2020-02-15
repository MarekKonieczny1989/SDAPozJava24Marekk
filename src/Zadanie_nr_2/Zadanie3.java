package Zadanie_nr_2;


import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[]args){
        Scanner czytnik = new Scanner (System.in);
        System.out.println("Podaj liczbę całkowitą dodatnią ");

        int liczba = 0;

        liczba = czytnik.nextInt();

        if (liczba<=0){
            System.out.println(" Błąd, podana liczba nie jest dodatnia");}
            else{
            System.out.println(" Wyświetl na ekranie wynik liczb 2 podniesionych do potęgi nie większe niż podana liczba ");}

        int do_potegi = 0;
            while(Math.pow(2,do_potegi)<liczba){

                System.out.println((int) Math.pow (2,do_potegi));

                do_potegi++;
            }
    }
}


