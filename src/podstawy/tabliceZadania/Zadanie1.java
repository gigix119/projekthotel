package podstawy.tabliceZadania;

public class Zadanie1 {
    public static void main(String[] args) {

//        Zadanie 1.
//Napisz program “Poszukiwany”, stwórz i przypisz do odpowiednich zmiennych dwie tablice:
//tablica liczb z 4 miejscami,
//tablica tekstów z 2 miejscami.
//Następnie przypisz ręcznie:
//do liczb: osobno dzień,  miesiąc, rok ucieczki z więzienia,
//na 4 pozycji wpisz kwotę nagrody,
//do tekstów:  imię  i nazwisko uciekiniera.
//Wyświetl uzupełnioną wiadomość:
//“ … - … - ….. zbiegł więzień …… …….. !”
//“Nagroda za przyprowadzenie: ……….$!”

        String[] dane = new String[2];

        dane[0] = "Jan";
        dane[1] = "Kowalski";

        int[] liczby = new int[4];

        liczby[0] = 2002;
        liczby[1] = 02;
        liczby[2] = 19;
        liczby[3] = 80000;

        System.out.println(liczby[0] + "-" + liczby[1] + "-" + liczby[2] +  " " + "zbiegł więzień " + dane[0] + " " + dane[1] + "!");
        System.out.println("Nagroda za przyprowadzenie:" + liczby[liczby.length-1] + "$");
    }
}
