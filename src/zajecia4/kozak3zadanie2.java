package zajecia4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class kozak3zadanie2 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int arraySize = scanner.nextInt();

//    tworzymy dwie tablice
//        pierwsza " liczby" o rozmiarze podanym przez użytkownika
//    druga tablicę " wystąpienia" o rozmiarze 11 (dla zliczania wystąpień od 0 do 10, 11 cyfr


        int[]liczby = new int[arraySize];
        int[]wystapienia = new int[11];

//        wypełnij tablicę" liczby" wartosciami losowymi

        Random r= new Random();
        for (int i=0; i<liczby.length; i++){

//            losujemy liczbę

            int randomNumber = r.nextInt(10)+1;

//            wpisujemy wylosowaną liczbę do tablicy

            liczby[i] = randomNumber;
        }
//        mamy wypełnioną tablicę liczby wiec ją wyswietlimy
//        użyjemy petli "foreach"
//        nie mamy zmiennej int i, tracimy informacje o indeksie
//        ale w tym przypadku tego nie potrzebujemy
//        dla każdego elementu chcemy go wypisać.....


        for (int liczba:liczby){
            System.out.print(liczba+",");
    }


//        zliczanie elementów

        for (int i =0; i<liczby.length;i++){

//            pobierz wartosc "liczby"  - wartosc ta jest indeksem dla tablicy "wystapienia"
//            np. jezeli bedzie liczba 5 - to w tablicy wystąpienia [5] nalezy inkrementować wartosc


            int index = liczby [i];
            wystapienia[index]++;
        }
// wyswietlenie tablicy "wystąpienia"
        for (int i =0; i<wystapienia.length;i++){
            System.out.println(i+"--->"+ wystapienia[i]);
        }
}
}





