package zajęcia5;
// pola w klasie
public class Osoba {
public String imie;
public String nazwisko;
public int wiek;
public double wzrost;
public double waga;

// konstruktor bezparametrowy
// jeśli nie ma żadnego konstruktora to pusty konstruktor generowany
// jest automatycznie;
//    jeśli zdefiniujemy JAWNIE konstruktor parametrowy, to ten konstruktor
//    już nie jest generowany automatycznie;
//    jeśli potrzebujemy domyślnego konstrukota to musimy go zdefiniować JAWNIE
//    jeśli usuniemy ten konstruktor to będziemy musieli zawsze tworzyć obiekty osoba
//    za pomocą konstruktora 3 argumetowego
    public Osoba(){
        System.out.println("Tworze obiekt typu osoba...");
    }


//  przeciążenie konstruktora
    public Osoba(String imie, String nazwisko, int w){
        this.imie = imie;
        this.nazwisko = nazwisko;
//        trzeci parametr nazywa się inaczej niż pole, więc this.wiek jest nie potrzebne
//        można od razu wiek = w;
        wiek = w;

    }

//    definicja metody do opisu Osoby

public String przedstawSie(){
        return "Na imię mam " + this.imie + " nazywam się " + this.nazwisko + " i mam " + wiek + " lat.";
}




}
