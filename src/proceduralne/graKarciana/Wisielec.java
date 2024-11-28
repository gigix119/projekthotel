package proceduralne.graKarciana;

import java.util.Random;
import java.util.Scanner;

public class Wisielec {
    public static void main(String[] args) {
        String haslo = wylosujHaslo();
        System.out.println("Hasło to: " + haslo);
        System.out.println("Hasło do odgadnięcia to :");
        String odgadniete = " ";
        int punktyZycia = 5;
        String zakodowane;

        do {
            System.out.println("Twoje litery: " + odgadniete);
            zakodowane = zakoduj(odgadniete, haslo);
            System.out.println(zakodowane);
            odgadniete += pobierzLitere(odgadniete);
            if (!haslo.toLowerCase().contains(odgadniete.charAt(odgadniete.length() - 1) + "")) {
                punktyZycia -= 1;
                System.out.println("Straciłeś punkt ");
            }
            zakodowane = zakoduj(odgadniete, haslo);
        } while (punktyZycia > 0 && zakodowane.contains("*"));
        if (punktyZycia>0){
            System.out.println("Wygrałeś gre");
        }else {
            System.out.println("Przegrałeś gre");
        }

    }

    public static String wylosujHaslo() {
        Random random = new Random();
        String[] hasla = {"Ala ma kota", "Jak kuba bogu", "Władcy Pierścieni", "Piraci z Karaibów"};
        int liczba = random.nextInt(hasla.length);
        return hasla[liczba];
    }

    public static String zakoduj(String obstawioneLitery, String haslo) {
        String zakodowane = "";
        haslo = haslo.toLowerCase(); // zmieniamy do malych zeby obstawianie malymi trafialo
     //   obstawioneLitery = obstawioneLitery.toLowerCase(); // napisane duze litery tez potraktujemy jako male
        for (int i = 0; i < haslo.length(); i++) {
            char litera = haslo.charAt(i);
            if (obstawioneLitery.contains(litera + "")) {
                zakodowane += litera;
            } else {
                zakodowane += "*";
            }
        }
        return zakodowane;
    }

    public static String pobierzLitere(String uzyte) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz litere");
        String litera = scanner.nextLine().toLowerCase();
        if (uzyte.contains(litera)) {
            System.out.println("Podawałeś już tą litere");
            return pobierzLitere(uzyte);
        }
        else {
            return litera;
        }

    }
    //pobiera litere
    //sprawdza czy ta litera już jest wśród odgadnięych
    //jeśli ta litera już jest to prosi o podanie jeszcze raz
    //zwraca nową literę
}
// "a" zawiera "axywc" // false
// "axywc" zaweraja "a" // true

//Kilka mozliwych hasel i program losuje jedno na starcie
//pokazywanie zakodowanego hasla i trzeba przechowywac litery obstawiane
//Uzytkownik moze wybrac litere
//jesli ta litera jest w tekscie to ta litera m sie pokazywac w hasle, jesli nie to traci punkt
//gracz przegrywa jesli straci wszystkie punkty (5) a wygrywa jesli odkryje wszystkie litery
//wykorzystaj metody toUpperCase(), replace(char,char), substring(int,int) i charAt(int)
