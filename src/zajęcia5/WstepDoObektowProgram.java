package zajęcia5;

public class WstepDoObektowProgram {
    //pierwsze przykłady użycia obiektów

    public static void main(String[] args) {

        // "student" jest obiektem typu Osoba
//       new Osoba()-----> wywołanie konstruktora bezparametrowego klasy Osoba
        Osoba student = new Osoba();
        student.imie = "Marek";
        student.nazwisko = "Konieczny";
        student.waga = 90;
        student.wiek = 30;
        student.wzrost=1.85;

        // " uczen " jest obiektem typu Osoba
        Osoba uczen = new Osoba();
        uczen.imie = "Jan";
        uczen.nazwisko = "Kowalski";
        uczen.wiek = 15;

        //odczyt pola
        String a= student.imie;
        System.out.println("wartośc pola to "+ a);

//        szybszy preferowany zapis
        System.out.println("Nazwisko studenta to: "+ student.nazwisko);
        System.out.println(student.waga);

//        wartości drugiego obiektu -wartości ucznia
        System.out.println(uczen.imie);
        System.out.println(uczen.nazwisko);
        System.out.println(uczen.wiek);


//zmiana nazwiska studenta
        System.out.println("po zmianie nazwiska u studenta");
        student.nazwisko = "aaaaaaaaaaaaaaaaa";
        System.out.println(student.nazwisko);
        System.out.println(uczen.nazwisko);


//        tworzymy obiekty z użyciem konstruktora parametrowego

        Osoba pracownik = new Osoba("Anna","Adamiak",28);
        System.out.println(pracownik.imie);
        System.out.println(pracownik.nazwisko);
        System.out.println(pracownik.wiek);

//        Wywołujemy metodę " przedstaw się"
        System.out.println(student.przedstawSie());
        System.out.println(uczen.przedstawSie());
        System.out.println(pracownik.przedstawSie());
    }
}
