package zajecia4;

import java.util.Random;

public class MatrixIntro {
public static void main(String[]args){
    int[][]macierz = new int[3][5];


    System.out.println(" dlugośc wierszy to: "+ macierz.length);//zwraca liczbę wierszy
    System.out.println(" długośc kolumn to:" +macierz[0].length);// zwraca liczbe kolumn
    Random random= new Random();

//    wypełnianie macierzy
int[] maxWiersz = new int[macierz.length];


    for (int i=0; i<macierz.length;i++){
        for (int j=0;j<macierz[0].length;j++){
            macierz[i][j]= random.nextInt(10);

        }
//wyświetlenie macierzy:
    }
    for (int i=0; i<macierz.length;i++){
        for (int j=0; j<macierz[0].length;j++){
            System.out.print(macierz[i][j]+ ",");
        }
        System.out.println();
    }
// szukanie max w wierszach
    int[]maxWwierszach = new int[macierz.length];
    for (int i =0; i<macierz.length;i++){
        int max = macierz[i][0];
        for (int j=0; j <macierz[0].length;j++){
            if (max < macierz[i][j]){
                max=macierz[i][j];
            }
        }
//        po przejsciu całego wiersza znalezlismy maxa, wiec wpisujemy go do tablicy
        maxWwierszach[i]=max;
    }
//    wyświetlenie max w wierszach
    System.out.println("maksymalne wartości w wierszach: ");
    for (int wWierszach: maxWwierszach){
        System.out.print(wWierszach+",");
    }


        }

}



