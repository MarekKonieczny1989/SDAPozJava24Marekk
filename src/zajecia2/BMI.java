package zajecia2;

        import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj swoja wage: ");
        double waga = czytnik.nextDouble();
        System.out.println("podaj swoj wzrost [w metrach]");
        double wzrost = czytnik.nextDouble();
        double bmi = waga/Math.pow(wzrost,2);
        // albo double bmi = waga/(wzrost *wzrost);
        System.out.println("twoje bmi wynosi: "+ bmi);

        if(bmi<18.5){
            System.out.println("waga zbyt niska ");
        }else if(bmi<25) {
            System.out.println("waga ok");
        }else if(bmi<30) {
            System.out.println("nadwaga");
        } else{
            System.out.println("otyłość");

        }
        System.out.println("koniec programu...");
    }
}
