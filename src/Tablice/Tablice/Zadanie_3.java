package Tablice.Tablice;

import java.util.Scanner;

public class Zadanie_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] przedzial_liczb = {4,5,6,7,8,9,10,11,12,13,14,15};

        System.out.println("Podaj ilość wpisywanych liczb do programu: ");
        int rozmiar_tablicy = scanner.nextInt();
        int [] tablica = new int[rozmiar_tablicy];
        System.out.println("Wpisz liczby rzeczywiste w ilości wcześniej podanej" );
        for (int i = 0; i <tablica.length ; i++) {
            tablica[i] = scanner.nextInt(); }

        System.out.print("Wpisane liczby to ");
        for (int i = 0; i <tablica.length ; i++) {
            System.out.print(tablica[i]+ " ");
        }
        System.out.println();
        System.out.print("Liczby należące do przedziału 4-15 to: ");

        for (int i = 0; i <tablica.length ; i++)
            for (int j = 0; j <przedzial_liczb.length ; j++) {
                if (tablica[i]==przedzial_liczb[j])
                    System.out.print(tablica[i]+" ");
            }

    }
}



