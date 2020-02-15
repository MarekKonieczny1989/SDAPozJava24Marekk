package zajęcia3.arrays;

import java.util.Scanner;

public class wprowadzenie {
    public static void main(String[] args) {
        int wiek = 10;
        String imie = "Piotr";
        //wpisywanie wartosci do tablicy
        int[]liczby = new int [10];
        liczby [0] = 25;
        liczby[4]=100;
        //pobieranie wartości z tablicy
        int wartosc = liczby[4];
        System.out.println(wartosc);
        System.out.println(liczby[0]);
        //ArrayIndexBoundsException
        // błędne użycie;
//        System.out.println(liczby([-2]); indeks tablicy nigdy nie będzie ujemny

        //sprawdzanie dlugosci tablicy
int dlugosc_tablicy  = liczby.length;
        System.out.println("Tablica ma długość "+ dlugosc_tablicy);

        String[] imiona = {"ala", " Piotr","Adam","Karolina"," Eliza"};
        System.out.println(imiona.length);
        // wyswietlenie wszystkich elementów tablicy
        for(int i=0; i <imiona.length; i++){
            String name = imiona[i];
            System.out.println("imie nr"+ i + " to:"+name);
            //alternatywnie:
            //od razu wyświetlenie elementu, bez wczesniejszego tworzenia zmiennej
            // System.out.println("imie nr ." i + " to ; " + imiona[i]);

            //Dynamiczne tworzenie tablicy
            System.out.println(" Podaj rozmiar tablicy: ");
            Scanner scanner = new Scanner(System.in);
          int rozmiar = scanner.nextInt();
          int[]dynamicznaTablica = new int[rozmiar];
            System.out.println("rozmiar dynamicznej tablicy"+ dynamicznaTablica.length);

        }



    }

}
