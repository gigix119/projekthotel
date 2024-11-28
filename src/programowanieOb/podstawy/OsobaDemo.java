package programowanieOb.podstawy;

public class OsobaDemo {
    public static void main(String[] args) {
        //Osoba.zwyklaMetoda();
        //Osoba.przywitajSie();

        Osoba osoba1 = new Osoba();
        Osoba osoba2 = new Osoba();

        System.out.println("Imie1: " + osoba1.imie);
        System.out.println("Imie2: " + osoba2.imie);
        osoba1.imie = "Marcin";
        osoba2.imie = "Maria";
        osoba1.wiek = 20;
        osoba2.wiek = 30;

        System.out.println(osoba1);
        System.out.println(osoba2);
/*
        System.out.println("Imie1: " + osoba1.imie);
        System.out.println("Imie2: " + osoba2.imie);

        System.out.println("Wiek1: " + osoba1.wiek);
        System.out.println("Wiek2: " + osoba2.wiek);*/
        osoba1.posiadanyProdukt = new Produkt();
        //osoba1.posiadanyProdukt.nazwa = "Pralka";

        System.out.println(osoba1.posiadanyProdukt.nazwa);

       osoba1.przywitajSie();
       //osoba2.przywitajSie();



    }
}
