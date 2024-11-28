package proceduralne.tabliceWW;

import java.util.Arrays;
import java.util.Random;

public class ZadaniePierwsze {

    static int mojePole;
    static String mojePoleString;
    static boolean mojePoleBoolean;


    public static void main(String[] args) {
        int liczbaLokalnie;
//        System.out.println(liczbaLokalnie);
//        System.out.println(mojePole);
//        System.out.println(mojePoleString);
//        System.out.println(mojePoleBoolean);


        System.out.println(mojePole);


        int[][] tablica = stworzTablice();
        drukowanieTablicy(tablica);
        System.out.println(policzWystapienia(tablica,9));
    }

    public static int[][] stworzTablice() {
        int[][] liczby = new int[10][12];
        for (int i = 0; i < liczby.length; i++) {
            for (int j = 0; j < liczby[i].length; j++) {
                Random random = new Random();
                liczby[i][j] = random.nextInt(50);
            }
        }
        return liczby;
    }

    public static void drukowanieTablicy(int[][] tablica){
        for (int[] row : tablica) {
            for (int liczba : row) {
                System.out.print(liczba + " ");
            }
            System.out.println();
        }
    }
    //przyjac tablice WW liczb oraz jakas liczbe n i policzyc ile razy ta liczba wystepuje w tablicy i zwrocic wynik
    public static int policzWystapienia(int[][] tablica, int n){
        int wystapienie = 0;
        for (int row = 0; row < tablica.length; row++) {
            for (int col = 0; col <tablica[row].length ; col++) {
                if (tablica[row][col] == n){
                    wystapienie++;
                }
            }
        } return wystapienie;
    }
}
