package zajęcia5;

public class Pozycja {
    private String nazwa_Towaru;
    private int ile_Sztuk;
    private double Cena;

    public Pozycja(String nazwa_Towaru, int ile_Sztuk, double cena) {
        this.nazwa_Towaru = nazwa_Towaru;
        this.ile_Sztuk = ile_Sztuk;
        this.Cena = cena;
    }

    public String getNazwa_Towaru() {
        return nazwa_Towaru;
    }

    public int getIle_Sztuk() {
        return ile_Sztuk;
    }

    public double getCena() {
        return Cena;
    }

    public void setNazwa_Towaru(String nazwa_Towaru) {
        this.nazwa_Towaru = nazwa_Towaru;
    }

    public void setIle_Sztuk(int ile_Sztuk) {
        this.ile_Sztuk = ile_Sztuk;
    }

    public void setCena(double cena) {
        Cena = cena;
    }
    public double obliczwartosc(){
        return Cena * ile_Sztuk;
}
public String toString(){
        return this.nazwa_Towaru + " "+ Cena + " zł "+ ile_Sztuk+ " szt. "+ obliczwartosc()+" zł.";
}
}




