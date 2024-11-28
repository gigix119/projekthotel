package proceduralne.tabliceWW;

import java.util.Random;
import java.util.Scanner;

public class Shultz {

    static int[][] plansza;

    public static void main(String[] args) {

//        long czas = System.currentTimeMillis();
//        System.out.println(czas/1000);

        long czas = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            rundaRozgrywki();
        }
        long czas2 = System.currentTimeMillis();
        System.out.println("Gra zajęła Ci " + (czas2 - czas) /1000 + " Sekund");
    }

    public static void rundaRozgrywki() {
        przygotujTablice();
        wyswietl();
        System.out.println("Poszukaj tej liczby " + losowa());
        czekajNaEnter();
    }

    public static void przygotujTablice() {
        plansza = new int[5][5];
        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza[i].length; j++) {
                Random random = new Random();
                plansza[i][j] = random.nextInt(99) + 1;

            }
        }
        plansza[2][2] = 0;
    }

    public static void wyswietl() {
        for (int[] row : plansza) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static int losowa() {
        Random random = new Random();
        int indexRzedu = random.nextInt(plansza.length);// 0-4
        int indexKolumny = random.nextInt(plansza.length);
        int wylosowanaLiczba = plansza[indexRzedu][indexKolumny];
        if (wylosowanaLiczba == 0) {
            return losowa();
        } else {
            return wylosowanaLiczba;
        }
    }

    public static void czekajNaEnter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Naciśnij enter");
        scanner.nextLine();
    }


}
 /*
Zad 27 - program z ćwiczeniem widzenia peryferyjnego metodą Shultza
Program ma wyświetlać tablicę 5/5 wartości.
Na środku ma być zero.
Reszta liczb losowana od 1 do 99.
Losowa z tych wartości ma być wyświetlona na górze jako poszukiwana. Program ma działać tak, że użytkownik
ma wpatrywać się w zero a jak zauważy kątem oka liczbę której ma szukać ma natychmiast wcisnąć enter.
Po 5 razach koniec programu. Na końcu pokazujemy ile czasu zajęło użytkownikowi znalezienie wszystkich liczb.
*/


// 4 5 6
// 1 0 3
// 5 7 1
// szukaj liczby 6 jak znajdziesz nacisnij enter