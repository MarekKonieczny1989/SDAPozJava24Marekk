package Zadanie_nr_3;


import java.util.Random;

public class Zadanie1 {
    public static void main (String[]args){
Random random = new Random();

        int [] tablica = new int[10];
        for (int i = 0; i <tablica.length ; i++) {
            tablica[i] =random.nextInt(21)-10;

        }

for (int i: tablica) System.out.print(i+" ");

int max = tablica[0];
for (int i=1;i<tablica.length;i++){
    if (max>tablica[i])continue;
    max=tablica[i];
    System.out.println();
    System.out.println("największa liczba to "+ max);



}
        int min = 0;
        for (int i=1; i<tablica.length;i++){
            if (min<tablica[i])continue;
            min=tablica[i];

        }
        System.out.println("najmnijsza liczba to " +min);


        int suma = 0;
        for (int i=0; i<tablica.length;i++)
            suma = suma + tablica[i];
        System.out.println("suma wartosci zmiennych w tablicy to "+ suma);


        double average = 0;
        average = (double) suma / (double)tablica.length;
        System.out.println("średnia to "+ average);
        System.out.println("Liczby większe od średniej to ");
int liczby_wieksze_od_sredniej = 0;
for (int i=0; i<tablica.length;i++){
    if (average>tablica[i])continue;
    liczby_wieksze_od_sredniej=tablica[i];

    System.out.print(liczby_wieksze_od_sredniej+" " );
}
        System.out.println();
        System.out.print("Liczby mniejsze od średniej to ");
int liczby_mniejsze_od_sredniej = 0;
for (int i=0; i<tablica.length;i++){
    if (average<tablica[i])continue;
    liczby_mniejsze_od_sredniej=tablica[i];
    System.out.print(liczby_mniejsze_od_sredniej+",");


}
        System.out.println();
        System.out.println("wyświetli liczby w odwrotnej kolejności ");
for(int i= tablica.length-1; i>=0; i--)
    System.out.print(+tablica[i]+",");
}

}







