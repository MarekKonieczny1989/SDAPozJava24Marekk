package Moje_zadania_loops;
// program wyświetla litery od A do Z za pomocą pętli do while
public class Zadanie_6A {
    public static void main (String []args){
        int i = 0;
        String alfabet = "ABCDEFGHIJKLMNOPRSTQUWXXYZ";
        do{System.out.print(alfabet.charAt(i)+ " ");
        i++;}
        while(i<alfabet.length());
    }
}
