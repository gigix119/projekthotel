package podstawy;

import java.util.Random;
import java.util.Scanner;

public class ZadanieRandom {
    public static void main(String[] args) {
//        Zadanie 2.
//        Napisz program, który pobierze jedną przykładową ilości ścian kostki,
//        np. 4-ścienna, itp., a następnie zasymuluje rzut kostką o wybranej liczbie ścian i wyświetli wylosowaną liczbę.

        //chcemy zeby program nie losowal liczby jesli podano minusowa liczbe, zero, 2 lub nieparzystą
        //zamiast tego ma wyświetlić komunikat o błedzie

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile chciałbyś wylosowac ścianek ");
        System.out.println("Podaj liczbe ");
        int ścianka = scanner.nextInt();




        if (ścianka % 2 ==0 && ścianka>2){ // czy scianka ok
            System.out.println("Scianka ok");
            int liczba = random.nextInt(ścianka ) + 1;
            System.out.println("Wylosowałeś " + liczba);
        }else{
            System.out.println("ilosc sciane zla");
        }





    }
}
