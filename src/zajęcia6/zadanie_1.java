package zajęcia6;

import java.util.Random;
import java.util.Scanner;

public class zadanie_1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz sześć liczb od 1-49 ");
            Random random = new Random();
            int[] tablica_wpisywanych_liczb = new int[6];
        for (int i = 0; i <tablica_wpisywanych_liczb.length ; i++) {
            tablica_wpisywanych_liczb[i] = scanner.nextInt();

        }
        System.out.print("Wpisane liczby to: ");
        for (int i = 0; i <tablica_wpisywanych_liczb.length ; i++) {
            System.out.print(tablica_wpisywanych_liczb[i]+" ");

        }
        System.out.println();
        System.out.print("Wylosowane liczby to ");
            int[] tablica = new int[49];
            for (int i = 0; i < tablica.length; i++) {
                tablica[i] = random.nextInt(49) + 1;
                System.out.print( tablica[i] + " "); }

            int licznik = 0;
        for (int i = 0; i <tablica_wpisywanych_liczb.length ; i++) {
            for (int j = 0; j <tablica.length ; j++) {
                if (tablica_wpisywanych_liczb[i]==tablica[i]){
                    licznik++;
                }
            }
        }
        System.out.println();
        System.out.println("Trafiłeś "+licznik + " z 6 cyfr" );
        }
    }

