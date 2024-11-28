package programowanieOb.warsztat;

import java.util.Arrays;

public class WarsztatDemo {
    public static void main(String[] args) {
        /*Zadanie 1.
        W programie zrealizuj następujący scenariusz: Samochód ma koła, a ich opony mają ustalone ciśnienie i mogą być przebite.
                Warsztat może przyjmować samochód żeby go naprawić. W klasie WarsztatDemo stwórz samochód z czterema kołami oraz  warsztat.
        Następnie tworząc i wywołując odpowiednie metody zasymuluj następujące zdarzenia:
        samochód łapie gumę w losowym kole,
        warsztat przyjmuje samochód do naprawy,
                warsztat sprawdza stan kół i wymienia przebite opony,
                warsztat po wykonaniu usługi drukuje ile kół wymienił i ile będzie to kosztowało.
*/
        Warsztat warsztat = new Warsztat();
        Kolo kolo1 = new Kolo(2.3);
        Kolo kolo2 = new Kolo(2.3);
        Kolo kolo3 = new Kolo(2.1);
        Kolo kolo4 = new Kolo(2.1);

        Kolo[] kola = new Kolo[4];
        kola[0] = kolo1;
        kola[1] = kolo2;
        kola[2] = kolo3;
        kola[3] = kolo4;
        Samochod samochod = new Samochod(kola);
        System.out.println(samochod);
        System.out.println(kolo1);
        samochod.zlapGume();
        System.out.println(samochod);
        samochod.zlapGume();
        warsztat.napraw(samochod);
        System.out.println(samochod);

    }
}

