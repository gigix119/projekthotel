package programowanieOb.produktZadanie;

import programowanieOb.poczta.Przesylka;

public class ProduktDemo {
    public static void main(String[] args) {

       /* int aktalnaCena = 1000;
        int nowaCena = 1200;
        aktalnaCena=nowaCena;
        System.out.println(aktalnaCena);*/

        Produkt produktJeden = new Produkt("laptop",2_300);
        Produkt produktDwa = new Produkt("komputer",2_500);
        Produkt produktTrzy = new Produkt("pralka",1_300);
        Produkt produktCztery = new Produkt();
        /*produktJeden.cena = 1000;
        produktDwa.cena = 2.99;
        produktTrzy.cena = 12.99;
        produktCztery.cena = 19.99;
        produktJeden.nazwa = "pralka";
        produktDwa.nazwa = "szczoteczka";
        produktTrzy.nazwa = "szampon";
        produktCztery.nazwa = "recznik";*/

        System.out.println(produktDwa.podajDaneProduktu());
        System.out.println(produktTrzy.podajDaneProduktu());
        System.out.println(produktCztery.podajDaneProduktu());
        produktJeden.zmienCene(-1200);
        System.out.println(produktJeden.podajDaneProduktu());
        System.out.println(produktJeden.podatek());
        System.out.println(produktJeden);
        System.out.println(produktDwa);
        System.out.println(produktTrzy);
        System.out.println(produktCztery);



    }
}
