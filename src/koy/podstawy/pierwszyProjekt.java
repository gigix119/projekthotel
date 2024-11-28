package koy.podstawy;

public class pierwszyProjekt {
    public static void main(String[] args) {
        //napisz swoje imie
        //sout + ctrl+ spacja
        //println- przejscie do nowego wiersza
        System.out.println("Czesc jestem kuba i lubie dobre dupeczki");
        System.out.println("Czesc jestem kuba i lubie dobre dupeczki");
        System.out.println("Czesc jestem kuba i lubie dobre dupeczki");
        System.out.println("Czesc jestem kuba i lubie dobre dupeczki");
        System.out.println("Czesc jestem kuba i lubie dobre dupeczki");
        System.out.println();
        //print - brak przejscia do nowego wiersza
        System.out.print("hejka");
        System.out.print("hejka");
        System.out.print("hejka");
        System.out.println();

        //znaki specjalne
        // \n - znak specalny do nowego wiersza
        System.out.println( );
        System.out.println("Ula\nma psa.");

        // \t- znak tabaulacji
        System.out.println("Koy \tma bete.");


        //ctrl + shift + /- Tworzy  komentarz wierszowy i mozesz sobie pisac w nim co chcesz bla bla
       /*elo
       * hej
       * dupa
       * cycki
       * */

        System.out.println( );
        System.out.println("Siema chcialbym kupic bete \nza 2zeta");

        //Zmienne
        //typZmiennej nazwaZmiennej = wartosc;
        System.out.println();
        int li = 4;
        System.out.println(li);

        //nadpisywanie zmiennej , to nie jest tworzenie nowej zmiennej tylko jej napidsanie....
        li = 6;
        System.out.println(li);

        //zmienna typu double - liczba rzeczywista
        double liczbaRzeczywista = 6.69;
        System.out.println(liczbaRzeczywista);

        //zmiena typu char - pojedynczy znak z klawiatury
        char znak = 'g';
        System.out.println(znak);

        //zmienna typu boolean - przechowuje true.false
        boolean wartosc = false;
        System.out.println(wartosc);
        System.out.println( );

        ////Operatory matematyczne
        //operator +
        int a = 4, b=5;
        String tekst1 = "kot" , tekst2 = "pies";

        //jesli opreatora + uzyjemy do typow liczbowych, to dziala on jak zwykle matematyczne dodawanie
        System.out.println(a+b);

        //jesli operatora + uzyjemy do Stringa i jakiegos typu to dziala on jako operator konkatenacji czyli scalanie
        System.out.println(tekst1 + " " + tekst2);

        System.out.println(tekst1 + " " +(a+b));

        System.out.println("testowanie " + (a + b)  + tekst1);
        System.out.println();

        // np mozesz sobie zadeklarowac dwie zmienne typu double i wykonac dzialania za pomoca operatorow : +,*,-,/)
        double i = 2.5, j = 2.2;
        System.out.println("Suma wynosi" + (i+j));
        System.out.println("Mnozenie wynosi" + (i*j));
        System.out.println("Roznica wynosi" + (i-j));
        System.out.println("Iloraz wynosi" + (i/j));
        System.out.println();

        //Stworzyc prosty kalkulator, zadeklaruj dwie zmienne typu double
        //Stworzyc mozliwosc wypisania na konsoli dzialan matematycznych +,*,-,/

        double suma = i + j;
        double roznica = i - j;
        double mnozenie = i * j;
        double dzielenie = i / j;

        System.out.println("Suma" + suma);
        System.out.println("roznica" + roznica);
        System.out.println("mnozenie" + mnozenie);
        System.out.println("Dzielenie" + dzielenie);




    }
}

