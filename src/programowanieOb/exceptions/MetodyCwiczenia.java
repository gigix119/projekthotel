package programowanieOb.exceptions;

import programowanieOb.komputer.Laptop;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class MetodyCwiczenia {

    public static void main(String[] args) {
        FabrykaProduktow fabryka = new FabrykaProduktow();
        Produkt produktZFabryki = fabryka.stworzProdukt();
        System.out.println("Moja fabryka zbudowala mi produkt: " + produktZFabryki);
        try {
            Produkt laptop1 = fabryka.zbudujBardzoDrogiProdukt();
            System.out.println(laptop1);
            Produkt laptop2 = fabryka.zbudujBardzoDrogiProdukt();
            System.out.println(laptop2);
            Produkt laptop3 = fabryka.zbudujBardzoDrogiProdukt();
            System.out.println(laptop3);
            Produkt laptop4 = fabryka.zbudujBardzoDrogiProdukt();
            System.out.println(laptop4);
        } catch (MissingPartsException e) {
            System.out.println(e.getWiadomosc());
        }

    }
}


class FabrykaProduktow {

    private int czesciDoLaptopa = 3;

    public Produkt stworzProdukt() {
        System.out.println("Buduje produkt");
        Produkt produkt = new Produkt(7, "jajka");
        System.out.println("Zbudowano produkt " + produkt);
        return produkt;
    }

    public Produkt zbudujBardzoDrogiProdukt() {
        if (czesciDoLaptopa == 0) {
            throw new MissingPartsException("Zabrakło nam częsci!");
        }
        Produkt laptop = new Produkt(4000, "laptop");
        czesciDoLaptopa--;
        return laptop;
    }


}

class MissingPartsException extends RuntimeException{

    private String wiadomosc;

    public MissingPartsException(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }

    public String getWiadomosc() {
        return wiadomosc;
    }
}

