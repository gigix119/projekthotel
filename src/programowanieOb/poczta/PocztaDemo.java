package programowanieOb.poczta;

import programowanieOb.figury.Kolo;

import java.util.Random;

public class PocztaDemo {
    public static void main(String[] args) {
        Przesylka przesylka1 = new Przesylka(1.2, "paczka","Jan Kowalski Warszwa Mickiewicza 1");
        Przesylka przesylka2 = new Przesylka(1.3,"list", "Andrzej Kowalski Warszwa Złota 4");
        System.out.println(przesylka1);
        System.out.println(przesylka2);

        przesylka1.setWaga( 1.5);  // modyfikacja wartosci wagi przez setter

     /*  przesylka1.rodzaj = "paczka";
        przesylka1.waga = 1.5;
        przesylka1.adresat = "Jan Kowalski Warszwa Mickiewicza 1";


        przesylka2.rodzaj = "list";
        przesylka2.waga = 1.3;
        przesylka2.adresat = "Andrzej Kowalski Warszwa Złota 4";*/




        przesylka1.wyswietlAdresata();
        przesylka2.wyswietlWage();

       // System.out.println(przesylka1.adresat);

        System.out.println("Adres przesyłki to: " + przesylka1.getAdresat());
//        Object przesylka3 = new Przesylka();
//        przesylka3 = new Kolo();

        String tekst = przesylka1.toString();
        System.out.println(tekst);
        System.out.println(przesylka2.toString());
       // System.out.println(przesylka1 == przesylka2);
        System.out.println(przesylka1); // metoda toString dyktuje domyslny sposob pokazania obiektu
        System.out.println(przesylka2);


    }
}
