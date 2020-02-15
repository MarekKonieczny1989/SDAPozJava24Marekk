package zajęcia3.arrays;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj rozmiar tablicy: ");
        int size = scanner.nextInt();
        //tworzymy nową tablicę:

        int[] array = new int[size];

        //wypełnij w petli for tablicę
        // np.
        // "podaj 1 element tablicy"
        //..."podaj n-ty element tablicy

        for (int i = 0; i < array.length; i++) {
            System.out.println("podaj" + (i + 1) + " elementy tablicy: ");
            int liczba = scanner.nextInt();
            array[i] = liczba;


        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("element " + i + " : " + array[i]);

            System.out.println();
        }
//oblicz min, max,avg,itd
        //min
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }
        }

        System.out.println("najmniejsza wartośc to " + min);
//max
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max > array[i]) {
                    continue;

                }
            max=array[i];
            }
            System.out.println("największa liczba to " + max);

        float suma=0;
        float avg = 0;
        for (int i = 0; i<array.length;i++){
            suma+=array[i];
        }
        avg= suma/array.length;
        System.out.println(avg);
        }
    }

