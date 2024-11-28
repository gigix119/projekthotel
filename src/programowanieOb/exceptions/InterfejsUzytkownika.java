package programowanieOb.exceptions;

import java.util.List;
import java.util.Scanner;
//ta klasa sluzy do rozmawiania z uzytkownikiem
public class InterfejsUzytkownika {
    private Sklep sklep;

    public InterfejsUzytkownika(Sklep sklep) {
        this.sklep = sklep;
    }

    public void wyswietlProdukty() {

        System.out.println("Dostepne produkty : ");
        List<Produkt> produkty = sklep.getProdukty();
        for (int i = 0; i < produkty.size(); i++) {
            System.out.println(i + 1 + " : " + produkty.get(i));

        }
    }

    public void kupProdukt() {
        System.out.println("Napisz nazwe produktu ktory chcesz kupic");
        Scanner scanner = new Scanner(System.in);
        String nazwaProduktu = scanner.nextLine();
        System.out.println("Podales nazwe " + nazwaProduktu);
        System.out.println("Szukam produktu o nazwie: " + nazwaProduktu);
        Produkt znalezionyProdukt = sklep.znajdzProdukt(nazwaProduktu);

        if (znalezionyProdukt==null){
            System.out.println("Nie ma Twojego produktu ");
            return;
        }else {
            System.out.println("Produkt który podałeś został znaleziony i ma cenę : " + znalezionyProdukt.getCena()+ "zł");
        }

        System.out.println(nazwaProduktu);
        System.out.println("Napisz kwote ktora placisz ");
        int cena = scanner.nextInt();
        System.out.println("Placisz " + cena);
    }
}
