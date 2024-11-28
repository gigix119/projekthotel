package proceduralne.graKarciana;

import java.util.Scanner;

/*
   Część I - interakcja
  Przygotuj nową klasę KolkoIKrzyzyk, a w niej metodę main.
  Stworzą nową metodę void zagraj(), w której będzie ogólny schemat rozgrywki.
  Przygotuj pole i zainicjalizuj je tablicą wielowymiarową znaków o wymiarach 3x3, będzie reprezentować planszę.
  Stwórz metodę - void przygotujPlansze(), która uzupełni wszystkie komórki w tablicy znakiem '-', będzie on reprezentował puste pole.
  Przygotuj metodę void wydrukujPlansze(), która będzie drukowała planszę w postaci tabeli
  Wywołaj obie nowe metody w metodzie zagraj, a tę wywołaj w mainie - przetestuj działanie obu metod, powinny wiświetlić się 3 rzędy po 3 myślniki
  Stwórz metodę void wstawGracza(char,int,int), której będziesz używał do wstawiania symboli 'O' i 'X' do konkretnego rzędu i kolumny w tablicy
  Przetestuj nowo stworzoną metodę wstawiając po jednym krzyżyku i kółku w różne miejsca a następnie wyświetlając ponownie planszę.
  Przygotuj metodę void zagrajRunde(char), która przyjmuje symbol grającego gracza. Metoda ma pobierać z konsoli rząd oraz kolumnę ruchu a następnie
  za pomocą metody wstawGracza uzupełniać planszę.
    Przygotuj metodę boolean czyPoprawnyRuch(int, int) która sprawdza czy można wykonać ruch w nade miejsce (kontroluje wyjscie poza plansze oraz czy pole puste)
  Zabezpiecz metodę zagrajRunde metodą kontrolujaca poprawnosc ruch (przy niepoprwanym ruchu ma zapytac o nowe koordynaty)
  Metoda, przy niedoswolonych koordynatach ma prosić o ponowne wpisanie koordynatów ruchu.
  Przetestuj nową metodę wykonując w metodzie zagraj() jeden ruch dla O i jeden dla X
  Przygotuj metodę boolean czySaWolneMiejsca(), która będzie zwracała true, jeśli jest conajmniej jedno puste miejsce na planszy
  Wykorzystaj nową metodę do udoskonalenia metody zagraj tak, żeby ruchy graczy były wywoływane na zmianę aż do zapełnienia planszy - wtedy program ma się zakończyć

  Część II - rozpoznawanie wygranej
  Dodaj do programu statyczne pole z tablicą 2 znaków: O oraz X
  Przerób pętlę w metodzie zagraj tak, aby wykorzystywała tablicę do tego, żeby wystarczyło tylko jednokrotne wywołanie metod zagrajRunde oraz wydrukujPlansze
  Aby osiągnąć porządany efekt możesz stworzyć pomocniczą zmienną która powinieneś obsługiwać tak, aby na zmianę wskazywała na 0 i 1 pozycję z tablicy graczy
  Przygotuj metodę char ktoWygral(), która będzie wyszukiwać gracza, który stworzył linie w pionie, poziomie lub skosie a jeśli go nie znajdzie, zwróci symbol pustego pola, na razie pozostaw metodę pustą
  Metoda ktoWygral będzie korzystać z 4 pomocniczych metod, które będziemy implementowali po kolei i przy jej pomocy testowali ich działanie
  Przygotuj metode ktoWstawilPionowaLinie, która będzie przeglądać wszystkie kolumny i jeśli znajdzie po 3 symbole tego samego typu zwraca ten symbol. Jeśli nie odnajdzie to zwraca symbol pustego pola
  Metodę tę oraz metody sprawdzające inne linie pisz tak aby zmienienie wymiarów planszy nie wymagało dużego modyfikowania jej działania.
  Dodaj nową metodę do programu i przetestuj. W tym celu w metodzie ktoWygral zwracaj to co zwraca metoda ktoWstawilPionowaLinie. W pętli rozgrywki w metodzie zagraj, wkorzystamy metode ktoWygral aby pobrac do
  zmiennej char symbol gracza, który wygrał. Skonstruuj instrukcje warunkową, która sprawdzi, czy zwrócony wynik to nie jest puste pole i jeśli nie jest ogłosi zwycięzcę.
  Do ogłoszenia zwycięzcy najlepiej będzie przygotować nową metodę: void oglosZwyciezceIZakonczProgram(char), która przyjmie symbol wygranego i pogratuluje mu i zatrzyma działanie programu instrukcją System.exit(int)
  Zaimplementuj pozostałe 3 metody: ktoWstawilPoziomaLinie, ktoWstawilLewySkos oraz ktoWstawilPrawySkos, metody te testuj, uwzględniając ich wywołanie w metodzie ktoWygral, która ma pobierać symbole z metod
  sprawdzających linie i jeśli którakolwiek zwróci coś innego niż puste pole -> zwracać ma tego gracza.
  Na koniec do metody oglosZwyciezceIZakonczProgram dodaj wariant reagujący na przekazanie symbolu pustego pola -> w takiej sytuacji metoda ma ogłaszać remis. W takiej konfiguracji wywołaj te metodę jeśli pętla
  zakończy się naturalnie -> tzn puste pola się skończą a nikt nie uzyska konfiguracji wygrywającej grę.
   * */
public class KolkoiKrzyzykGra {
    static char[][] plansza = new char[3][3];


    public static void main(String[] args) {
        zagraj();
    }

    public static void zagraj() {
        przygotujPlansze();

        do {
            wyswietlenia();
            zagrajRunde('o');
            if (ktoWygral() != '*' || !czyJestWolenMiejsce()) {
                break;
            }
            wyswietlenia();
            zagrajRunde('x');
        } while (ktoWygral() == '*' && czyJestWolenMiejsce());

        char wygrany = ktoWygral();
        if (wygrany == 'x') {
            System.out.println("Wygrywa krzyżyk");
        } else if (wygrany == 'o') {
            System.out.println("Wygrywa kółko");
        } else {
            System.out.println("Remis");
        }

        wyswietlenia();
    }


   /* public static void zagraj2() {
        przygotujPlansze();
        char[] gracze = {'o','x'};
        int index = 0;
        wyswietlenia();
        do {
            zagrajRunde(gracze[index]);
            wyswietlenia();
            index++;
            if (index == 2) {
                index = 0;
            }
        } while (ktoWygral() == '*' && czyJestWolenMiejsce());

        char wygrany = ktoWygral();
        if (wygrany == 'x') {
            System.out.println("Wygrywa krzyżyk");
        } else if (wygrany == 'o') {
            System.out.println("Wygrywa kółko");
        } else {
            System.out.println("Remis");
        }

        wyswietlenia();
    }*/

    public static void przygotujPlansze() { // wstawia * w kazde puste miejsce planszy
        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza.length; j++) {
                plansza[i][j] = '*';
            }
        }
    }

    public static void wyswietlenia() {
        for (char[] row : plansza) {
            for (char pole : row) {
                System.out.print(pole + " ");
            }
            System.out.println();
        }
    }

    public static void wstawGracza(char symbol, int rzad, int kolumna) {
        plansza[rzad][kolumna] = symbol;
    }

    public static void zagrajRunde(char symbol) {
        Scanner scanner = new Scanner(System.in);
        int rzad;
        int kolumna;

        do {
            System.out.println("Wybierz rząd");
            rzad = scanner.nextInt();
            System.out.println("Wybierz kolumne");
            kolumna = scanner.nextInt();
            if (czyNiepoprawnyPoprawnyRuch(rzad, kolumna)) {
                System.out.println("Niepoprawny ruch");
            }
        } while (czyNiepoprawnyPoprawnyRuch(rzad, kolumna));
        System.out.println("Poprawny ruch");
        wstawGracza(symbol, rzad, kolumna);
    }

    public static boolean czyNiepoprawnyPoprawnyRuch(int rzad, int kolumna) {
        return rzad > 2 || kolumna > 2 || rzad < 0 || kolumna < 0 || plansza[rzad][kolumna] != '*';
    }

    public static char ktoWygral() {
        char wygrany = wygranaPion();
        if (wygrany != '*') {
            return wygrany;
        }
        wygrany = wygranaPoziom();
        if (wygrany != '*') {
            return wygrany;
        }

        return wygranaSkos();

    }

    public static boolean czyJestWolenMiejsce() {
        for (int row = 0; row < plansza.length; row++) {
            for (int col = 0; col < plansza.length; col++) {
                if (plansza[row][col] == '*') {
                    return true;
                }
            }
        }
        return false;
    }

    public static char wygranaPion() {
        for (int col = 0; col < plansza.length; col++) {
            if (plansza[0][col] == plansza[1][col] && plansza[0][col] == plansza[2][col] && plansza[0][col] != '*') {
                return plansza[0][col];
            }
        }
        return '*';
    }

    public static char wygranaPoziom() {
        for (int row = 0; row < plansza.length; row++) {
            if (plansza[row][0] == plansza[row][1] && plansza[row][0] == plansza[row][2] && plansza[row][0] != '*') {
                return plansza[row][0];
            }

        }
        return '*';

    }

    public static char wygranaSkos() {

        if (plansza[0][0] == plansza[1][1] && plansza[1][1] == plansza[2][2]) {
            return plansza[0][0];
        } else if (plansza[0][2] == plansza[1][1] && plansza[1][1] == plansza[2][0]) {
            return plansza[0][2];
        }
        return '*';

    }

}


  /* public static boolean czyPoprawnyRuch(int rzad, int kolumna) {
        if (rzad > 2 || kolumna > 2) {
            return false;
        } else if (plansza[rzad][kolumna] == 'o' || plansza[rzad][kolumna] == 'x') { //|| - lub && - oraz
            return false;
        } else {
            return true;
        }
    }*/
