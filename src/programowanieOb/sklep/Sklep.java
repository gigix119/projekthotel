package programowanieOb.sklep;

import java.util.Scanner;

public class Sklep {
    public static Produkt[] produkty;

    public static void main(String[] args) {
        Produkt produkt1 = new Produkt(200,4,"Papryka");
        Produkt produkt2 = new Produkt(300,6,"cebula");
        Produkt produkt3 = new Produkt(150,2,"mleko");

        produkty = new Produkt[]{produkt1, produkt2, produkt3};

       /* produkt1.cena = 3;
        produkt2.cena = 5;
        produkt3.cena = 8;

        produkt1.nazwa = "mleko";
        produkt2.nazwa = "papryka";
        produkt3.nazwa = "Cebula";

        produkt1.sztuki = 2;
        produkt2.sztuki = 3;
        produkt3.sztuki = 5;*/
        for (int i = 0; i < 10; i++) {
            zrobZakupy();
        }


    }

    public static void zrobZakupy() {
        for (int i = 0; i < produkty.length; i++) {
            System.out.println("Mamy " + produkty[i].getNazwa() + " " + produkty[i].getSztuki() + " Sztuki pod pozycją  " + i);

            System.out.println("Cena za jedną sztuke wynosi " + produkty[i].getCena() + " złotych");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer produktu");
        int numer = scanner.nextInt();
        System.out.println("Ile chcesz kupic sztuk ? ");
        int wielkoscZakupow = scanner.nextInt();
        System.out.println("Ile placisz za wszystko ?");
        int zaplata = scanner.nextInt();
        if (wielkoscZakupow > produkty[numer].getSztuki()) {
            System.out.println("Nie mamy tyle na stanie");
            return;
        }
        if (zaplata == produkty[numer].getCena()) {
            System.out.println("Poprawna cena");
        } else if (zaplata > produkty[numer].getCena()) {
            System.out.println("Twoja reszta : " + (zaplata - produkty[numer].getCena()));
        }
        produkty[numer].setSztuki(wielkoscZakupow - produkty[numer].getSztuki());
    }
}
//wstep obiektowosc
// toString metoda
// konstruktory
// kompozycja (composition)
// ArrayList
// gettery / settery (enkapsulacja/hermetyzacja)
// enumy
// 2 projekty na poćwiczenie


//później:
//dziedziczenie
//polimorfizm - możliwość wstawiania wielu roznych obiektów do tego samego typu zmiennej więc jej metody mają różne zachowania
//klasy abstrakcyjne (i metody)
//interfejsy
//wyjątki

//projekty:
// zbijak
// hotel
// game mashine
// kwiaciarnia
// escape room



// ZAAWANSOWANA
// GIT
// Kolekcje
// wielowatkowosc
// testowanie
// wzorce
// java 9 (stream lambda)
// projekt portfolio 1. np gra snake
//refleksja, operacje na plikach


// BD

//Spring

