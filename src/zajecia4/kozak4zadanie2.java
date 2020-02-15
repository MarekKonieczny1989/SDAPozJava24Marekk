package zajecia4;

import java.util.Scanner;

public class kozak4zadanie2 {
    static String reverseString(String Text) {
        String result = "";
        for (int i = Text.length() - 1; i >= 0; i--) {
            result = result + Text.charAt(i);
        }
        return result;
    }
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Podaj dowolny napis, a wypisze go od końca");
     String napis = scanner.nextLine();

     String text = reverseString(napis);
        System.out.println(text);


    }
}

