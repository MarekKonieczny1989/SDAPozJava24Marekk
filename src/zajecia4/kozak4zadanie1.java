package zajecia4;

import java.util.Scanner;

public class kozak4zadanie1 {

    static int countLastLetterInString(String text){
//        pobieramy ostatnią litere w napisie
        char lastLetter = text.charAt(text.length()-1);
        int counter = 0;
        for (int i=0; i<text.length();i++){
            char litera = text.charAt(i);
            if(lastLetter==litera){
//                jeżeli ostatnia litera (last letter) zgadza się z aktualną literą (letter)
//                to zwiększ licznik
                counter++;
            }
        }
        return counter;

}
    public static void main(String[]args){

    System.out.println("Podaj dowolny napis, a ja policze ilość wystąpień ostatniej litery");
    Scanner scanner = new Scanner(System.in);
    String napis  = scanner.nextLine();
//    wywołujemy funkcje
        int liczbawystapien = countLastLetterInString(napis);
        System.out.println("ostatnia litera w wyrazie wystąpiła" + liczbawystapien+ "razy");

}
}
