package proceduralne.metodyjeden;

import java.util.Random;

public class ZadaniaDaniel {
    public static void main(String[] args) {
        System.out.println("Start");
        mojaMetoda();
        System.out.println("Koniec");
        mojaMetoda();

        //Arrays.toString("imie");

        przywitaj("Marcin",3);
        przywitaj("Tomek", 10);
        przywitaj("Wojtek", 10);

        Random random = new Random();
        int wylosowana =  random.nextInt(10);
        int zwrocona = prostaMetoda();
        System.out.println("Metoda dała: " + zwrocona);
        String tekst = prostaMetoda2();
        System.out.println("Metoda 2 dała: " + tekst);

        double wynik = potegowanie(3.0);
        double wynik2 = potegowanie(5.0);
        double wynik3 = potegowanie(6.0);
        System.out.println(wynik);
        System.out.println(wynik2);
        System.out.println(wynik3 + potegowanie(2));


        System.out.println(prostaMetoda());


    }


    //metoda wyświetla "Cześć [imie]!"
    public static void przywitaj(String imie, int liczba){
        if (imie.equals("Wojtek")) {
            System.out.println("Spadaj wojtek");
            return;
        }
        System.out.println("Cześć " + imie + " wybrałeś liczbę: " + liczba);
    }



    public static void mojaMetoda(){
        System.out.println("Cześć co słychać?");
        System.out.println("Pozdrowienia z metody");
    }


    public static int prostaMetoda() {
        return 6;
    }

    public static String prostaMetoda2() {
        return "Hello";
    }

    public static double potegowanie(double wartosc){
        return wartosc * wartosc;
    }


    // przygotuj metodę która przyjmie dwie liczby i zwróci sumę tych liczb



}

