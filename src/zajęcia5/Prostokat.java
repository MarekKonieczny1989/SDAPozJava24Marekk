package zajęcia5;

public class Prostokat {
   private int wymiar_bok_A;
   private int wymiar_bok_B;
    public Prostokat(int wymiar_bok_A,int wymiar_bok_B ){
        this.wymiar_bok_A = wymiar_bok_A;
        this.wymiar_bok_B = wymiar_bok_B;

    }
public int Obliczanie_pola(){
        return wymiar_bok_A * wymiar_bok_B;

}
public int obliczanie_obowodu(){
        return (wymiar_bok_A *2) + (wymiar_bok_B *2);
}
// getter i setter

//    metoda gettera
    public int getWymiar_bok_A(){
        return this.wymiar_bok_A;
    }
//    metoda setter'a - nic nie zwraca, ustawia wartość przekazaną jako parametr
    public void setWymiar_bok_A(int wymiar_bok_A){
        if (wymiar_bok_A>0) {
            this.wymiar_bok_A = wymiar_bok_A;
        }
}
}
