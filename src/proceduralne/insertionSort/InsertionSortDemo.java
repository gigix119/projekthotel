package proceduralne.insertionSort;


import java.util.Arrays;

public class InsertionSortDemo {
    public static void main(String[] args) {



        int[] arr= {3,6,9,4,1,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr) {
        int n = arr.length;
        int current;
        int otherIndex;
        for (int i = 1; i < n ; i++) {
            current = arr[i];
            otherIndex = i;
            while (otherIndex > 0 && current < arr[otherIndex - 1]){
                arr[otherIndex] = arr[otherIndex - 1];
                otherIndex--;
            }
            arr[otherIndex] = current;
        }
    }
}
//Podstawy JAVA

//I
//wstęp do programowania - zrobione

//II
//prog. proceduralne metody + algorytmy + macierze
// metody konczymy i alg.
//projekt asysten -> niedługo
// tablice wielowymiarowe + projekt kółko i krzyżyk

// III
//Blok teorii obiektowy
// konstruktory, pola, metody obiektów
// toString
// kompozycja
// enumy
// projekt - warsztat
// dziedziczenie
// polimorfizm
// interfejsy
// wyjątki

// IV
// Blok praktyczny z podstaw (programowanie obiektowe)
// zbijak -> gra polegajaca na przemieszczaniu pionka po planszy i zbijaniu innych pionkow sterowanych przez komputera
// opcjonalnie -> gra karciana w wojne lub inna
// sklep z dowolnym poroduktem obiektowo
// kwiaciarnia (rozbudowany projekt)
// escape room -> gra paragrafowa z intarakcja z przedmiotami w kolejnych pokojach
// aplikacja do zarzadzania hotelem (wynajmowanie pokoji sortowanie wyszukiwanie wolnych, rejestrowanie osób)

// Zaawansowana Java bloki czesc 2 (min. GIT)

// Bazy danych - bloki czesc 3 (+ hibernate)  + SQL podstowy
// można zaczącz szukać stazu
// Programowanie webowe czesc 4(min. Spring Boot, Rest API -> podstawy Spring

// warto regularnie szukac prace i chodzic na rozmowy

//częśc 5
// Spring backend -> mikroserwisy i zaawansowany backend lub.. // wieksza szansa dostania sie na Backend Developer -> Zaawansowany Spring

// Frontend -> html, css, javascript + Angular // kandydowanie na stanowisko Full Stack
//duzo wieksze szanse na znalezienie pracy

