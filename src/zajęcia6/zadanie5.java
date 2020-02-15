package zajęcia6;

import javax.swing.*;
import java.sql.SQLOutput;

public class zadanie5 {
    public static void main(String[] args) {
      String liczba = "52";
      int suma = 0;
        for (int i = 0; i <liczba.length(); i++) {
            char c= liczba.charAt(i);
            String wartosc = String.valueOf(c);
            suma = suma + Integer.valueOf(wartosc);
//            valueOf- zmienia typ np. z int na String

        }
        System.out.println(suma);


    }
}
