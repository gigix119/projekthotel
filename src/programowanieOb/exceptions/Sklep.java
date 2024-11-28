package programowanieOb.exceptions;

import java.util.ArrayList;
import java.util.List;

//zarzadzanie danymi
public class Sklep {
    private List<Produkt> produkty = new ArrayList<>();


    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }

    public Produkt znajdzProdukt(String nazwaProduktu) {
        for (Produkt produkt : produkty) {
            if (nazwaProduktu.equals(produkt.getNazwa()))  {
                return produkt;
            }
        }
        return null;
    }

    public List<Produkt> getProdukty() {
        return produkty;
    }

    @Override
    public String toString() {
        return "Sklep{" +
                "produkty=" + produkty +
                '}';
    }
}
