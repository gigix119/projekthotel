package korepetycje;

import java.util.Scanner;

public class LekcjePierwsze {
    public static void main(String[] args) {
     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe pierwsza");

        int liczba = scanner.nextInt();

        int iloscDzielnikow = 0;
        System.out.println(liczba);
        for (int dzielnik = 1; dzielnik <=liczba ; dzielnik++) {
            if (liczba % dzielnik == 0 ) {
                System.out.println(dzielnik);
            iloscDzielnikow++;
            }
        }
        if (iloscDzielnikow == 2){
            System.out.println("Liczba jest liczba pierwsza");
        }else{
            System.out.println("Liczba nie jest liczba pierwsza");
        }*/

        //Stworzyc tablice 30 liczb

        int suma = 0;
        int tablica[] = {40, 20, 9, -9, -8, -3, 4,5, 2, 1,
                          10, 33, 15, 19, 41, 55, 77, 99, 90 ,55,
                            11,66,93,73,51,89,39,63,-2,-5};
        /*for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] % 2 == 0 ){
                System.out.println(tablica[i]);
                suma++;
            }
        }
        System.out.println(suma);*/

        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] % 10 == 9 || tablica[i] % 10 == -9 ){
                System.out.println(tablica[i]);
                suma++;
            }

        }
        System.out.println(suma);


        // zmienne, operatory, pętle i ich zastosowanie, tablice jedno i wielo wymiarowe

        // 1. Wypisz cyfry z danej liczby
        // 2. Sprawdz czy podana liczba sklada sie z takich samych cyfr
        // 3. Wypisz sume elemntów tablicy
        // 4. Wypisz tablice od tylu 
        // 5. Srednai arytmetyczna elementów w tablicy



    }
}
