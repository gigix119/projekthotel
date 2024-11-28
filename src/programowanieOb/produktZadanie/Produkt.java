package programowanieOb.produktZadanie;

public class Produkt {
    private String nazwa;
    private double cena;

    public Produkt() {
        nazwa = "Komputer";
        cena = 2_500;
    }

    public Produkt(String nowaNazwa, double nowaCena) {
        nazwa = nowaNazwa;
        cena = nowaCena;
    }

    public String podajDaneProduktu() {
        return nazwa + cena;
    }

    public void zmienCene(double nowaCena) {
        if (nowaCena > 0) {
            System.out.println("Twoja cena nie jest ujemna");
            cena = nowaCena;
        } else {
            System.out.println("Twoja cena jest ujemna ");
        }
    }

    public double podatek() {
        double podatek = 0.21;
        return cena + podatek * cena;
    }

    public String toString() {
        return nazwa + " kosztuje " + cena;
    }
}





/*

    Stwórz klasę Produkt i przypisz produktom dwa pola: cena i nazwa.
     W klasie ProduktDemo stwórz cztery obiekty typu Produkt: pralkę o cenie 1000 zł, szczoteczkę do zębów o cenie 2.99 zł, szampon o cenie 12.99 zł i ręcznik o cenie 19.99 zł.
    Stwórz i przetestuj dla nich trzy metody:
    metoda pozwalająca zmienić cenę,
      metoda pozwalająca zmienić cenę (ma się upewnić że nie ustawiamy ujemnej)
metoda zwraca cenę po doliczeniu podatku 21%

*/

