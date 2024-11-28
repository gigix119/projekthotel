package proceduralne.graKarciana;

import java.util.Scanner;

public class TicTacToe {

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

    static final char EMPTY_SPACE = '-', CIRCLE = 'O', CROSS = 'X';

    static char[][] board = new char[3][3];
    static final char[] players = {CIRCLE, CROSS};

    public static void main(String[] args) {
        playGame();
    }

    private static void playGame() {
        prepareBoard();
        int playerIndex = 0;
        do {
            if (playerIndex >= players.length) {
                playerIndex = 0;
            }
            playRound(players[playerIndex++]);
            showBoard();
            char winner = whoHasWon();
            if (winner != EMPTY_SPACE) {
                announceWinnerAndEndGame(winner);
            }
        }
        while (areThereAnySpace());
        announceWinnerAndEndGame(EMPTY_SPACE);
    }

   private static void prepareBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = EMPTY_SPACE;
            }
        }
    }

   private static void playRound(char playerSymbol) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(playerSymbol + " move!");
        System.out.println("Type row");
        int row = scanner.nextInt() - 1;
        System.out.println("Type column");
        int col = scanner.nextInt() - 1;
        if (board[row][col] != '-') {
            System.out.println("Field already taken");
            playRound(playerSymbol);
            return;
        }

        placeSymbol(playerSymbol, row, col);
    }

   private static void showBoard() {
        for (char[] row : board) {
            for (char symbol : row) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

   private static void placeSymbol(char symbol, int row, int col) {
        board[row][col] = symbol;
    }

   private static boolean areThereAnySpace() {
        for (char[] row : board) {
            for (char symbol : row) {
                if (symbol == EMPTY_SPACE) {
                    return true;
                }
            }
        }
        return false;
    }

   private static void announceWinnerAndEndGame(char winner) {
        if (winner == EMPTY_SPACE) {
            System.out.println("No one won!");
        } else {
            System.out.println(winner + " has won!");
        }
        System.exit(0);
    }

   private static char whoHasWon() {
        char winner = whoHasVerticalLine();
        if (winner == EMPTY_SPACE) {
            winner = whoHasHorizontalLine();
        }
        if (winner == EMPTY_SPACE) {
            winner = whoHasLeftDiagonalLine();
        }
        if (winner == EMPTY_SPACE) {
            winner = whoHasRightDiagonalLine();
        }
        return winner;
    }

   private static char whoHasVerticalLine(){
        char symbol= board[0][0];
        for (int col = 0; col < board[0].length; col++) {
            for (int row = 0, timesFound = 0; row < board.length; row++) {
                if (timesFound == 0) {
                    symbol = board[row][col];
                    timesFound++;
                } else if (symbol == board[row][col]) {
                    timesFound++;
                }
                if (timesFound == board.length) {
                    return symbol;
                }
            }
        }
        return EMPTY_SPACE;
    }

   private static char whoHasHorizontalLine(){
        char symbol= board[0][0];
        for (int row = 0; row < board[0].length; row++) {
            for (int col = 0, timesFound = 0; col < board.length; col++) {
                if (timesFound == 0) {
                    symbol = board[row][col];
                    timesFound++;
                } else if (symbol == board[row][col]) {
                    timesFound++;
                }
                if (timesFound == board.length) {
                    return symbol;
                }
            }
        }
        return EMPTY_SPACE;
    }

   private static char whoHasLeftDiagonalLine() {
        char symbol = board[0][0];
        for (int rowAndCol = 1, timesFound = 1; rowAndCol < board.length; rowAndCol++) {
            if (board[rowAndCol][rowAndCol] == symbol) {
                timesFound++;
            }
            if (timesFound == board.length) {
                return symbol;
            }
        }
        return EMPTY_SPACE;
    }

   private static char whoHasRightDiagonalLine() {
        char symbol = board[0][board.length-1];
        for (int row =1, col = board.length-2, timesFound = 1; row < board.length; row++,col--) {
            if (board[row][col] == symbol) {
                timesFound++;
            }
            if (timesFound == board.length) {
                return symbol;
            }
        }
        return EMPTY_SPACE;
    }
}
