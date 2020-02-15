package zajecia2;

// program ,ktory wypisuje liczby parzyste
public class Zadanie1 {
    public static void main(String[] args) {
        //wypisać liczby od 0-100 w odwrotnej kolejności
        // 99,97,95...

        for (int i = 99; i > 0; i -= 2) {
            System.out.print(i + ",");
        }
        //zadanie 3
        int suma = 0;
        for (int i = 0; i <= 100; i++) {
            suma += i;
            //alternatywnie:
            //suma ==suma +1
        }
        System.out.println();
        System.out.println("suma liczb od 0-100: " + suma);


    }
}

