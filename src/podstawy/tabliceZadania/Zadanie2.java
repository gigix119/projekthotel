package podstawy.tabliceZadania;

import java.util.Arrays;
import java.util.Random;

public class Zadanie2
{public static void main(String[] args) {
    //(typ)[] nazwa = new (typ)[rozmiar]; - tworzenie pustej tablicy
    double[] ceny = new double[4];
    ceny[0] = 34.56;
    ceny[1] = 3.56;


    System.out.println(ceny[2]);

    //  String tekst = null;
    // System.out.println(tekst.toUpperCase());
    String[] teksty = new String[3];
    //System.out.println(teksty[0].toUpperCase());

    //(typ)[] (nazwa) = { (wartosc1), (wartosc2)...};
    String[] imieINazwisko = {"Jan", "Kowalski", "Ala", "Roman", "Markowski", "Nowak"};
    Random random1 = new Random();
    // Random[] randomy = { new Random(),  new Random(),  new Random() };

    System.out.println(imieINazwisko.length);

    System.out.println(imieINazwisko[0]);
    System.out.println(imieINazwisko[1]);

    for (int i = 0; i < imieINazwisko.length; i++) {
        System.out.println(imieINazwisko[i]);
    }


    System.out.println(Arrays.toString(imieINazwisko));


}

}

//Podstawy
//podstawy -> pętle for i pętle for each
//proceduralne -> metody statyczne i pola statyczne + tablice wielowymiarowe
//obiektowość -> pola i metody obiektów i ich tworzenie, enkapsulacja, toString, equals, kostruktory, kompozycja, enumy
//cz2  -> dziedziczenie, polimorfizm, abstrakcyjne klasy, interfejsy, wyjątki
//zaawansowane
// kolekcje -> listy, sety, mapy, kolejki, sortowanie
// współbieznosc
// projekt z graficznym interfejsem np retro gra
//testy jestkowe (JUnit, Mockito, TDD)
//streamy
//wzorce projektowe
// uzupełnienie -> praca z plikami, refleksja, loggery, generyczne
//bazy danych
//SQL
//JDBC
//HIBERNATE
//Spring
//wstep
//start szukania pracy
//projekt portfolio
//Rest API
//projekt z rest API

//dalej...
//  frontend -> html,css,javasript
//  zaawansowany frontend -> angular
//  kolejny projekt portfolio Angular + Spring

