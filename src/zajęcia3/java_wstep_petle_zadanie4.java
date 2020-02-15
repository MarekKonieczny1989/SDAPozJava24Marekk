package zajęcia3;

import java.util.Scanner;

public class java_wstep_petle_zadanie4 {
   public static void main(String[]args){
       Scanner czytnik = new Scanner(System.in);
       System.out.println(" Podaj dowolny napis: ");
       String text  = czytnik.nextLine();
       //zliczanie długości napisu bez spacji
       int licznik = 0;
       for (int i =0; i<text.length(); i++){
          // pobierz jeden znak
           char znak = text.charAt(i);
           System.out.println("Znak na pozycji" + i + "to: "+ znak);
if(znak!=' '){
    licznik++;
}
       }
       System.out.println(" długość tekstu ze spacjami to: "+ text.length());
           System.out.println("długośc tekstu bez spacji to"+ licznik);

           // wyświetl napis małymi  i duzymi literacmi

       System.out.println(" tekst małymi literami to :"+ text.toLowerCase());
       System.out.println(" tekst duzumi lierami to :" + text.toUpperCase());
       }

   }


