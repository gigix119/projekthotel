package programowanieOb.podstawy;

public class Osoba {

    //cechy -> pola
    String imie;
    int wiek;
    Produkt posiadanyProdukt;


    //zachowania -> metody
    public void przywitajSie() {
        System.out.println("Cześć nazywam się " +imie + " i mam " + wiek + " lat");
        System.out.println("Kupiłem produkt o nazwie: "+ posiadanyProdukt.nazwa);
    }

    public static void zwyklaMetoda() {
        System.out.println("Hello");
    }

}
