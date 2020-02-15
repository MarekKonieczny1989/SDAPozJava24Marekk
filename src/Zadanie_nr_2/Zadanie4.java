package Zadanie_nr_2;

import java.util.Scanner;

public class Zadanie4 {

        public static void main(String[] args) {
            Scanner czytnik = new Scanner(System.in);
            int liczba = 0;
            System.out.println(" Podaj liczbę inną niż 0");
            int suma = 0;
            suma = czytnik.nextInt();
            while(suma!=0){
                liczba = czytnik.nextInt();

                suma = suma + liczba;
                if (liczba==0)break;

            }
            System.out.println(" suma liczb wprowadzonych to: "+ suma);










        }

    }







