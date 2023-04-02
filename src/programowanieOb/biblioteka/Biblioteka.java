package programowanieOb.biblioteka;

import java.util.Arrays;
import java.util.Scanner;

public class Biblioteka {
    //cechy
   private Ksiazka[] ksiazki;

    //konstruktory
    public Biblioteka(Ksiazka[] noweKsiazki) {
        ksiazki = noweKsiazki;
    }

    //zachowania - metody
    public void wyswietlKsiazki() {
        System.out.println("Wszystkie książki");
        for (int i = 0; i < ksiazki.length; i++) {
            System.out.println(i+"." + ksiazki[i]);
        }
    }

    public void wyswietlWypozyczoneKsiazki() {
        System.out.println("Wypożyczone ksiązki");
        for (int i = 0; i < ksiazki.length; i++) {
            if (ksiazki[i].isWypozyczona()) {
                System.out.println(ksiazki[i]);
            }
        }
    }

    public void wyswietlDostepneKsiazki() {
        System.out.println("dostępne książki ");
        for (Ksiazka ksiazka : ksiazki) {
            if (!ksiazka.isWypozyczona()) {
                System.out.println(ksiazka);
            }
        }
    }

    public void wypozyczKsiazke() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Którą książke chcesz wypożyczyć ? ");
        wyswietlKsiazki();
        int numer = scanner.nextInt();
        if (numer >=ksiazki.length) {
            System.out.println("Nie ma ksiazki pod tym numerem");
            return;
        }

        Ksiazka wybranaKsiazka = ksiazki[numer];
        wybranaKsiazka.wypozyczKsiazke();
    }

    public String toString() {
        return "Książki: " + Arrays.toString(ksiazki);
    }
}


//hermetyzacji lub enkapsulacja - z obiektami powinno sie komunikować przez ich metody(zachowania) a nie bezpośrednio przez ich pola (cechy)