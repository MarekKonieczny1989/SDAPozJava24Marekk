package Tablice.Tablice;

import java.util.Random;
import java.util.Scanner;

public class Zadanie_5 {
    public static void main(String[] args) {
        int[] tablica = new int[5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Podaj i sprawdź liczbę");
        int liczba_sprawdzajaca = scanner.nextInt();
        System.out.println("wpisz 5 liczb");
        for (int i = 0; i < tablica.length; i++)
//            tablica[i] = random.nextInt(100);
            tablica[i] = scanner.nextInt();

        for (int i = 0; i < tablica.length; i++) {
            if (liczba_sprawdzajaca != tablica[i]){
                continue;}
                System.out.println("Trafiłeś");}
        for (int i = 0; i <tablica.length; i++) {
        if (liczba_sprawdzajaca == tablica[i]){
            continue;}
            System.out.println("Nie trafiłeś"); }
        System.out.println("koniec zadania");

        }


        }








