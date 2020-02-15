package Zadania_nr_1;

import javax.swing.*;
import java.util.Scanner;

public class Zadnie_3 {
    public static void main (String[]args){
        System.out.println(" Obliczanie współczynnika BMI ");
        Scanner czytnik = new Scanner (System.in);
        double waga = 0;
        System.out.println(" Podaj swoją wagę [kg] ");
        waga = czytnik.nextDouble();
        double wzrost =0;
        System.out.println(" podaj swój wzrost [m] ");
        wzrost = czytnik.nextDouble();
        double BMI = 0;
        BMI = waga/Math.pow(wzrost,2);
        if (BMI<18.5)
            System.out.println(" Twoje BMI to " + BMI + " masz niedowagę ");
        else if (BMI>=18.5 && BMI<=24.9)
            System.out.println(" Twoje BMI to "+ BMI + " masz prawidłową wagę");
            else
            System.out.println(" Twoje BMI to "+ BMI + " masz nadwagę ");
        System.out.println();
        System.out.println(" Koniec zadania ");
    }
}
