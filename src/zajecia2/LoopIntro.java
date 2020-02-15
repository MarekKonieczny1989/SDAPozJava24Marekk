package zajecia2;

public class LoopIntro {
    public static void main(String[]args){
        // prosta petla while wpisujaca wartosci od 0-9
        int wiek = 20;
        //1.zwiekszenie wartosci zmiennej
        wiek = wiek +5;
        System.out.println(wiek);

//        wiek += 5;
//        System.out.println(wiek);
// wiek++; //oznacz zwiekszenie o 1
//        System.out.println(wiek);
//
//        //post-sv pre -inkrementacja
//        int liczba= 25;
//        System.out.println(liczba ++);
//        System.out.println(liczba);
//
//        int number =0;
//        System.out.println(++number);
//        System.out.println(number);


        System.out.println("petla while");
        //petla wypisujaca liczby od 0-9, petla while moze nie wykonac sie wogole, albo tyle razy ile w warunku
        int licznik =0;
        while(licznik<10){
            System.out.println(licznik++);}
    }

}




