package Moje_zadania_loops;

public class Zadanie_6D {
    public static void main(String[] args) {
        String alfabet = "ABCDEFGHIJKLMNOPRSTQUWYXZ";
        int i = 24;
        do{
            System.out.print(alfabet.charAt(i)+" ");
            i--;}
        while(i>=0);
    }
}
