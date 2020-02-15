package Moje_zadania_loops;

public class Zadanie_6C {
    public static void main(String[] args) {
        String alfabet = "ABCDEFGHIJKLMNOPRSTQUWYXZ";
        int i = 24;
        while(i>=0){
            System.out.print(alfabet.charAt(i--)+ " ");
        }
    }
}
