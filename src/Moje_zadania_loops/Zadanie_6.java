package Moje_zadania_loops;

public class Zadanie_6 {
    // wyświetlenie alfabetu od A do Z za pomocą pętli for
    public static void main(String[]args){
        {
            String alfabet = "ABCDEFGHIJKLMNOPRSTQUWXYZ";
            for (int i = 0; i < alfabet.length(); i++) {
                System.out.print(alfabet.charAt(i) + " ");
            }
// wyświetlanie alfabetu od A do Z za pomocą pętli while

            System.out.println();
            int i = 0;
            {
                while (i < alfabet.length()) {
                    System.out.print(alfabet.charAt(i) + " ");
                    i++;
                }

            }
            //wyświetlanie alfabetu od A do Z za pomocą pętli do while

        System.out.println();
//        int i = 0;
//        String alfabet = "ABCDEFGHIJKLMNOPRSTQUWXYZ";
       do{System.out.print(alfabet.charAt(i) + " ");
        i++;}
        while(i<alfabet.length());

}
}
}


