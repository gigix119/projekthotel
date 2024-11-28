package proceduralne.asystent;

import java.util.Random;
import java.util.Scanner;

public class ProjektAsystent {
    // public static String

    public static void main(String[] args) {
        /*Etap 1:
Stwórz pakiet asystent i skopiuj do niego trzy klasy najciekawszych programów które do tej pory zrobiłeś.
 W klasie Asystent zaimplementuj metodę główną void rozpocznijProgram( ) i wywołaj ją w metodzie main. Następnie zaimplementuj dwie metody pomocnicze:
String generujPowitanie() - losuje jedno z pięciu możliwych przywitań,
String generujPozegnanie() - zwraca tekst składający się losowo z 1-5 słów “pa” zakończonych “!” np. “papapa!”
Wywołaj te metody i wyświetl zwrócone wartości w konsoli.

*/


      /*  String litery = "a";
        for (int i = 0; i < 5; i++) {

            litery+= "a";
        }
       *//* litery += "a";
        litery += "a";
        litery += "a";
        litery += "a";
        litery += "a";*//*

        System.out.println(litery);*/



        /*Etap 2:
Nad metodami dodaj statyczne pole przechowujące dostępne opcje programu jako tablica typu String.
 Przykładowe opcje: “Zagrajmy w lotto”, “wyświetl prostokąt”, “policz do 10”.
Zaimplementuj metodę void uruchomMenu() i wywołaj ją pomiędzy przywitaniem, a pożegnaniem. Metoda powinna korzystać z 3 mniejszych metod:
void drukujListeOpcji( ) - metoda drukuje opcję z jej numerem wykorzystując wcześniej stworzone pole,
int pobierzWybor( ) - metoda prosi o podanie opcji interesującej użytkownika tak długo, dopóki nie poda on liczby z właściwego zakresu i zwraca wybór,
void uruchomOpcje( int ) - metoda przyjmuje wcześniej pobraną liczbę i wyświetla opcję, która została wybrana.

*/



       /*Etap 3:
W trzech wcześniej przeniesionych klasach zmień metodę main na własną metodę.
 Zdekomponuj ją na mniejsze metody jeśli ma więcej niż 30 linijek kodu.
  W klasie Asystent zmodyfikuj metodę uruchomOpcje() tak, aby zamiast wyświetlać jaką opcję uruchomi, faktycznie to zrobiła.
   Na koniec zmodyfikuj,  tak żeby menu powtarzało się dopóki użytkownik nie wybierze opcji “Zakończ program”.
Podpowiedź: wywołanie statycznej metody z innej klasy robimy tak, jak korzystaliśmy ze statycznych bibliotek np. Lotto.zagraj();
*/


        rozpocznijProgram();
    }

    public static void rozpocznijProgram() {
        System.out.println(generujPowitanie());
        uruchomMenu();
        System.out.println(generujPozegnanie());
    }

    public static String generujPowitanie() {
        Random random = new Random();
        int liczba = random.nextInt(5);
        String[] powitania = {"czesc", "siema", "hej", "elo", "witam"};
        return powitania[liczba];
    }

    public static void uruchomMenu() {
        int wybranaOpcja;
        do {
            drukujListeOpcji();
            wybranaOpcja = pobierzWybor();
            uruchomOpcje(wybranaOpcja);
        }
        while (wybranaOpcja < 4);

    }

    public static void drukujListeOpcji() {
        System.out.println("Drukuje liste opcji");
        System.out.println("1. Uruchom Loterie ");
        System.out.println("2. Uruchom Sklep ");
        System.out.println("3. Przelicz Waluty ");
        System.out.println("4. Zamknij Program ");
    }

    public static int pobierzWybor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz, którą metode chcesz wybrać - (1,4)");
        int liczba = scanner.nextInt();
        return liczba;
    }

    public static void uruchomOpcje(int wybranaOpcja) {
        System.out.println("Uruchamiam opcje numer " + wybranaOpcja);
        if (wybranaOpcja == 1) {
            System.out.println("Uruchamiam Loterie");
            Loteria.lottoGra();
        } else if (wybranaOpcja == 2) {
            System.out.println("Uruchamiam Sklep");
            Sklep.dzialanieSklepu();
        } else if (wybranaOpcja == 3) {
            System.out.println("Przeliczam Waluty");
            Waluty.przeliczWaluty();
        } else if (wybranaOpcja == 4) {
            System.out.println("Zamykam Program");
        } else {
            System.out.println("Nie ma takiej liczby. ");
        }
    }


    public static String generujPozegnanie() {
        Random random = new Random();
        int liczby = random.nextInt(5) + 1;  //1-5
        String tekst = "";
        for (int i = 0; i < liczby; i++) {
            tekst += "pa";
        }
        return tekst + "!";
    }

}
