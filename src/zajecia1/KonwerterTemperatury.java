package zajecia1;

import java.util.Scanner;

public class KonwerterTemperatury {
    public static void main(String[]args){
        Scanner czytnik = new Scanner(System.in);

        double stopnieCelsjusza =0;
        System.out.println (" Podaj stopnie celsjusza ");
        stopnieCelsjusza = czytnik.nextDouble();
        System.out.println(stopnieCelsjusza+ " celsjusza"+ " to "+ (1.8*stopnieCelsjusza+32.0)+ " fahrenheita");


    }
}
