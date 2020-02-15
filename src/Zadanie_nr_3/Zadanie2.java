package Zadanie_nr_3;

import java.util.Random;

public class Zadanie2 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] tablica = new int[20];
        for (int i = 0; i <tablica.length ; i++) {
            tablica[i] = random.nextInt(10)+1;
            System.out.print(tablica[i]+" "); }
        System.out.println();
//       zliczanie wystąpień poszczególnych liczb
int licznik = 0;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j <tablica.length ; j++) {
                if (tablica[i]==tablica[j])
                licznik++;
            }
            System.out.println(tablica[i] + " występuje " + licznik + " raz(y)");
        }
        }
        }


