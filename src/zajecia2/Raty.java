package zajecia2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Raty {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);

        System.out.println("podaj cenę towaru ");
        double cenaTowaru = czytnik.nextDouble();

        System.out.println("Podaj liczbę rat");
        double liczbaRat = czytnik.nextDouble();
        double miesiecznaRata = 0;
        if ((cenaTowaru > 100 && cenaTowaru < 10000) && (liczbaRat > 6 && liczbaRat < 48)) {
            System.out.println("Obliczamy raty... ");
            if (liczbaRat >= 6 && liczbaRat <= 12) {
                miesiecznaRata = 1.025 * cenaTowaru / liczbaRat;
            } else if (
                    liczbaRat >= 13 && liczbaRat <= 24) {
                miesiecznaRata = 1.05 * cenaTowaru / liczbaRat;
            } else {
                miesiecznaRata = 1.1 * cenaTowaru / liczbaRat;
            }
            System.out.println("Miesięczna rata wynosi:" + miesiecznaRata);
        } else {
            System.out.println(" złe dane wejściowe - uruchom program ponownie");


        }


    }
}
