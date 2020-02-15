package zajecia2;

import java.util.Scanner;

public class KalkulatorPodatku {
    public static void main(String[]args) {
        Scanner czytnikDochodu = new Scanner(System.in);
        System.out.println(" podaj dochód");
        double dochod = czytnikDochodu.nextDouble();
        if (dochod < 85_528) {
            System.out.println("twój podatek to: " + (dochod * 0.18 - 556.02));
        } else {
            System.out.println("twój podatek to "+((dochod - 85_528) * 0.32 + 14_839.02));
        }
    }
}






