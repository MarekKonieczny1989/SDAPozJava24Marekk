package zajęcia5;

import java.util.Scanner;

public class Prostokat_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Oblicznaie Prostokąta 1");
        System.out.println("Podaj wymiar boku A");
        int bokA = scanner.nextInt();
        System.out.println("Podaj wymiar boku B");
        int bokB = scanner.nextInt();
        Prostokat prostokat1 = new Prostokat(bokA,bokB);
//



        System.out.println(" Pole wynosi "+ prostokat1.Obliczanie_pola());
        System.out.println("Obwód wynosi "+ prostokat1.obliczanie_obowodu());



        System.out.println(" Oblicznaie Prostokąta 2");
        System.out.println("Podaj wymiar boku A2");
        int bokA2 = scanner.nextInt();
        System.out.println("Podaj wymiar boku B2");
        int bokB2 = scanner.nextInt();
        Prostokat prostokat2 = new Prostokat(bokA2,bokB2);
        System.out.println("Pole wynosi "+ prostokat2.Obliczanie_pola());
        System.out.println("Obwód wynosi "+ prostokat2.obliczanie_obowodu());



        System.out.println(" Oblicznaie Prostokąta 3");
        System.out.println("Podaj wymiar boku A3");
        int bokA3 = scanner.nextInt();
        System.out.println("Podaj wymiar boku B3");
        int bokB3 = scanner.nextInt();
        Prostokat prostokat3 = new Prostokat(bokA3,bokB3);
        System.out.println("Pole wynosi "+ prostokat3.Obliczanie_pola());
        System.out.println("Obwód wynosi "+ prostokat3.obliczanie_obowodu());





    }
}
