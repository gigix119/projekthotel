package programowanieOb.podstawy;


public class PierwszyProgram {
    public static void main(String[] args) {
        Produkt przenica = new Produkt();
        przenica.cena = 10.99;
        przenica.iloscWKg = 100;
        przenica.nazwa = "Przenica";

        Osoba osoba1 = new Osoba();
        Osoba osoba2 = new Osoba();
        Osoba osoba3 = new Osoba();
        Osoba osoba4 = osoba1;


        System.out.println(osoba1);
        System.out.println(osoba2);
        System.out.println(osoba3);
        System.out.println(osoba4);

        if (osoba1 == osoba2) {
            System.out.println("Ten sam obiekt");
        } else {
            System.out.println("Inny obiekt");
        }

        if (osoba1 == osoba4) {
            System.out.println("Ten sam obiekt");
        } else {
            System.out.println("Inny obiekt");
        }



    }
}

