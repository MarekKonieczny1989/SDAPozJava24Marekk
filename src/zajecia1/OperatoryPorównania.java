package zajecia1;

public class OperatoryPorównania {
    public static void main (String[]args){
        int wiek =18;

        //wersja 1
        boolean czyPelnoletni = wiek<=18;
        System.out.println("Czy wiek >= 18? "+czyPelnoletni);

        //wersja 2
        System.out.println("Czy wiek mniejszy rowny 18? " + (wiek<=18));

        System.out.println(" czy wiek rozny od 20 "+(wiek!=20));



    }
}
