package Zadanie_nr_2;

import java.util.Scanner;

public class Zadanie4a {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        System.out.println(" Podaj liczbę inną niż 0");
        int suma = czytnik.nextInt();

        while(czytnik.nextInt()!=0)
            suma = suma + czytnik.nextInt();
                if (czytnik.nextInt() != 0)

        System.out.println(suma);

            }
}

