package zajecia1;

import java.util.Scanner;

public class CzytnikIntro {
    public static void main(String[]args){
   //    aby moc czytać dane od uzytkownika musimy utworzyć obiekt typu Scannner wg nastepujacej skladni
        Scanner czytnik = new Scanner(System.in);

       // czytnik to zmienna/obiekt typu Scanner
        //wiek to zmienna typu int
        //w momencie pisania kodu nie wiemy ile konkretny uzytkownik ma lat
        String imie;
        double wiek =0;
        System.out.println("Podaj swoje imie: ");
        //odczytaj całą linie tekstu az do wcisniecia ENTER
        imie = czytnik.nextLine();
        System.out.println(" ile masz lat?");
        wiek =czytnik.nextDouble();
        System.out.println("Witaj, "+ imie+" masz "+wiek+ " lat");


    }
}
