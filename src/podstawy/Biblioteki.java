package podstawy;

import java.util.ArrayList;

public class Biblioteki {
    public static void main(String[] args) {
        int liczba = 4;
        System.out.println(Math.random() * 10);

        String liczba1 = "1234";
        int liczba2 = Integer.parseInt(liczba1);
        System.out.println(liczba2 + 10);
        System.out.println(Math.round(55.8));


        //Zadanie 1.
        //Wyświetl piątą potęgę liczby 2 wykorzystując bibliotekę Math.

        int liczba3 = 2;
        System.out.println(Math.pow(2, 5));

        //Zadanie 2.
        //Przechowaj w zmiennej tekst “ul. Wiejska 1”,  a następnie za pomocą odpowiedniej metody wyświetl odpowiedź na pytanie czy ostatni znak jest cyfrą?
        // Przykładowy wynik w konsoli: “ostatni znak to cyfra: true”.

        String ulica = "ul. Wiejska 1a";
        if (Character.isDigit(ulica.charAt(ulica.length() - 1))) {
            System.out.println("Tak jest cyfrą");
        } else {
            System.out.println("Nie jest cyfra");
        }


        //Zadanie 3.*
        //Napisz program, który wyświetli komunikat: “Jutro będzie padać na X%!”
        //Gdzie “X” jest losową liczbą z przedziału od 0 do 100 generowaną na nowo przy każdym uruchomieniu programu.
        double wylosowana = Math.random() * 100;
        System.out.println("Jutro bedzie padac na " + Math.round(wylosowana) +  " %!");

        //biblioteki z metodami statycznymi
        //Math, Arrays String
        //Byte, Short, Inteeger, Long, Double, Float, Character, Boolean

        //klasy obiektowe
        //String, Random, Scanner, LocalDate, BigDecimal, ArrayList,
        String text = new String("avc");




    }
}
