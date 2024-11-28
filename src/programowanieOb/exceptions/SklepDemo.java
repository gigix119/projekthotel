package programowanieOb.exceptions;

import java.util.ArrayList;
import java.util.List;

public class SklepDemo {
    public static void main(String[] args) {
        Produkt produkt = new Produkt(5, "pepsi");
        Produkt produkt1 = new Produkt(7, "masło");
        Produkt produkt2 = new Produkt(5, "Chipsy");
        Sklep sklep = new Sklep();
        InterfejsUzytkownika interfejsUzytkownika = new InterfejsUzytkownika(sklep);
     /*   sklep.produkty.add(produkt);
        sklep.produkty.add(produkt1);
        sklep.produkty.add(produkt2);*/
        sklep.dodajProdukt(produkt);
        sklep.dodajProdukt(produkt1);
        sklep.dodajProdukt(produkt2);
        interfejsUzytkownika.wyswietlProdukty();
        interfejsUzytkownika.kupProdukt();

    }
}

