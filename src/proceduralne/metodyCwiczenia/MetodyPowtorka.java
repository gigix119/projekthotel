package proceduralne.metodyCwiczenia;

import java.util.Scanner;

public class MetodyPowtorka {
    public static void main(String[] args) {
        /*System.out.println(returnTrue());
        System.out.println(sumOfTwoNumbers(3,2));
        System.out.println(sumOfTwoNumbers(-3,-6));
        System.out.println(sumOfTwoNumbers(7,3));
        //
        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(2));*/

      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Ile chcesz przeliczyć minut na sekundy");
        int liczba = scanner.nextInt();
        System.out.println(convert(liczba));*/

        System.out.println(howManyWalls(54, 1, 43));
        System.out.println(howManyWalls(46, 5, 4));
        System.out.println(howManyWalls(100, 4, 5));
        System.out.println(howManyWalls(10, 15, 12));
        System.out.println(howManyWalls(41, 3, 6));

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz farby w m^");
        int iloscFarby = scanner.nextInt();
        System.out.println("Jak wysokie masz sciany? ");
        int wysokoscSciany = scanner.nextInt();
        System.out.println("Jak szerokie masz sciany? ");
        int szerokoscSciany = scanner.nextInt();
        System.out.println(howManyWalls(iloscFarby, wysokoscSciany, szerokoscSciany));*/
        poradyMalarskie();
    }
    /*
    * zbuduj metodę do której przeniesiesz zakomentowany kod pytający o ilość minut i wyliczajacy sekund
    * napisz w mainie kod ktory zapyta, czy chcesz obliczac sekundy z minut czy wyliczać farbe malarską. Na podstawie
    * odpowiedzi przekieruj dalsze działanie do metody poradyMalarskie lub tej nowej pytajacej o minuty
    * */

    public static boolean returnTrue() {

        return true;
    }

    public static int sumOfTwoNumbers(int numberOne, int numberTwo) {

        return numberOne + numberTwo;

    }

    public static int convert(int minutes) {
        return minutes * 60;
    }

    public static int howManyWalls(int farba, int wysokosc, int szerokosc) {
        int wymiary = wysokosc * szerokosc;
        return farba / wymiary;
    }

    public static void poradyMalarskie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz farby w m^");
        int iloscFarby = scanner.nextInt();
        System.out.println("Jak wysokie masz sciany? ");
        int wysokoscSciany = scanner.nextInt();
        System.out.println("Jak szerokie masz sciany? ");
        int szerokoscSciany = scanner.nextInt();
        System.out.println(howManyWalls(iloscFarby, wysokoscSciany, szerokoscSciany));
    }
}
// Pierwsze zadanie
//        SumOfTwoNumbers(3, 2) ➞ 5
//
//SumOfTwoNumbers(-3, -6) ➞ -9
//
//SumOfTwoNumbers(7, 3) ➞ 10

//Drugie zadanie
//convert(5) ➞ 300
//
//convert(3) ➞ 180
//
//convert(2) ➞ 120

//Trzecie zadanie
//howManyWalls(54, 1, 43) ➞ 1
//
//howManyWalls(46, 5, 4) ➞ 2
//
//howManyWalls(100, 4, 5) ➞ 5
//
//howManyWalls(10, 15, 12) ➞ 0
//
//howManyWalls(41, 3, 6) ➞ 2


//