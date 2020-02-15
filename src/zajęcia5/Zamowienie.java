package zajęcia5;

public class Zamowienie {
    private final static int Domyslny_Rozmiar_Zamowienia = 10;
 private Pozycja [] pozycje;
 private  int ileDodanych;
 private int maksRozmiar;

// konstruktor bezparametrowy może służyć do ustawienia wartości domyślnych
//    wywołujemy konstruktor parametrowy przekazując domyslny rozmiar zamowienia
 public Zamowienie(){
     this(Domyslny_Rozmiar_Zamowienia);
 }

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
        pozycje = new Pozycja[maksRozmiar];
    }
    public void dodajPozycje(Pozycja poz){
     if (this.ileDodanych>=maksRozmiar){
         System.out.println("Nie można dodac zamowienia - osiągnięto max rozmiar");
     }else{
         this.pozycje[ileDodanych]=poz;
         ileDodanych++;

//         lub w 1 linijce
//         this.pozycje [ileDodanych++]=p;
     }

    }
    public double obliczWartosc(){
    double wartoscZamowienia =0;
for (Pozycja p: pozycje) {
    if (p!=null){
    wartoscZamowienia+=p.obliczwartosc();
}
}
return wartoscZamowienia;
}
public String toString (){
     String result = "Zamówienie: \n";
    for (int i = 0; i <ileDodanych ; i++) {
        result+= pozycje[i].toString()+"\n";
    }
    return result;
}
}



