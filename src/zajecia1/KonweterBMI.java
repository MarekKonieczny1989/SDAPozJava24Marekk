package zajecia1;

import java.util.Scanner;

public class KonweterBMI {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        double waga = 0;
        double wzrost = 0;
        System.out.println(" podaj swoją wagę ");
        waga = czytnik.nextDouble();
        System.out.println(" Podaj swoj wzrost");
        wzrost = czytnik.nextDouble();
        double bmi = waga / Math.pow(wzrost, 2);
        System.out.println(" Twoje BMI to " +bmi);

        if (bmi > 18.5 && bmi < 25) {
            System.out.println("Waga ok -waga w normie");
        } else {
            System.out.println("Zły wynik - waga za duza , badz za mała");
        }
    }
}
