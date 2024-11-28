package podstawy.switchZadania;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
//        Zadanie 2.
//Napisz program kalkulator, który:
//pobierze od użytkownika znak równania jako String,
//pobierze dwie liczby,
//za pomocą switcha dobierze równanie do znaku i obliczy, znaki: +, -,
//wyświetli wynik


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj symbol");
        String znak = scanner.nextLine();
        System.out.println("Podaj liczbe");
         int liczba = scanner.nextInt();
        System.out.println("Podaj liczbe");
         int liczba1 = scanner.nextInt();
         int wynik;
         switch (znak){
             case "+":
                 wynik= liczba + liczba1;
                 break;
             case  "-":
                 wynik= liczba - liczba1;
                 break;
             case  "*":
                 wynik= liczba * liczba1;
                 break;
             case  "/":
                 wynik= liczba / liczba1;
                 break;
             default:
                 System.out.println("Niepoprawny znak");
                 return;

         }
        System.out.println(liczba + znak + liczba1 + " Twój wynik to = " + wynik);






    }
}
