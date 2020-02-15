package zajęcia3;

import java.util.Scanner;

public class kozak2zadanie1 {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
   int liczba = czytnik.nextInt();
   for (int i =1; 1<=liczba;i++){
       if (i%2==1){
           System.out.println(i);
       }
   }


    }

}
