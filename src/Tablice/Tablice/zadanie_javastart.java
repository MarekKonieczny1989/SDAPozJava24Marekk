package Tablice.Tablice;

import java.util.Scanner;

public class zadanie_javastart {
    public static void main (String[]args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj imie ");
String[]name=new String[5];
for (int i=0; i<name.length;i++)
    name[i]=scanner.nextLine();
for (int i=0; i<name.length;i++)
    System.out.println("Witaj "+ name[i]);
        }
    }

