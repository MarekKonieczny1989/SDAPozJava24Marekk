package Moje_zadania_podstawowe_konstrukcje;

public class Wstep_do_Javy_zadanie_4 {
    public static void main(String[]args){
        String name = "Marek";

        int wiek = 30;

        char kategoriaWojskowa = 'A';

        System.out.println(name);
        System.out.println(wiek);
        System.out.println(kategoriaWojskowa);

        name = "wojtek";
        wiek = 25;
        kategoriaWojskowa ='B';
        System.out.println(name+" ma "+wiek+" lat oraz ma kategorię "+kategoriaWojskowa );
        String name1 =" Adam ";
        String name2 =" Waldek ";
        String name3 = " Grzegorz";
        String wczesniejsze_wyrazy = " mają " + wiek + " lat i kategorię "+ kategoriaWojskowa;
        System.out.println(name1+ name2+" i " + name3+ wczesniejsze_wyrazy);

    }
}
