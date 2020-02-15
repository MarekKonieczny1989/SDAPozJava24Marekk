package zajecia4;

public class funckcje {

    static int dodaj(int a,int b){
        return a+b;
    }
//    funkcja,która nic nie zwraca ,ale wypisuje zawartosć tablicy
    static void printArray(String[]array){
        System.out.print("[");
        for (String i:array){
            System.out.print(i+",");
        }

//        kasujemy ostatni przecinek
//        na przyszłość: eleganckie
        System.out.print('\b');


        System.out.print("]");
    }

    static int fibonacci(int n){
        int fib1=1;
        int fib2=1;
        int suma =0;
        for (int i=3; i<=n;i++){
            suma = fib1+fib2;
            fib1=fib2;
            fib2=suma;
        }
        return suma;
    }

    public static void main (String[]args){
        int pierwszaLiczba = 10;
        int drugaLiczba = 20;
        int wynik=dodaj(pierwszaLiczba,drugaLiczba);
        System.out.println("wynik dodawania to: "+ wynik);

        String[]imiona = {"Jan","Tomek","Ola"};
        printArray(imiona);
//wywołaj funkcje fibonacci
        System.out.println(fibonacci(10));

    }
}
