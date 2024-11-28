package programowanieOb.cardEnum;

public class CardDemo {
    public static void main(String[] args) {

        Card card1 = new Card(Suit.HEART,Rank.KING);
        Card card2 = new Card(Suit.CLUBS,Rank.JACK);
        System.out.println(card1);
        System.out.println(card2);
        Rank[] ranks= Rank.values();
        for (Rank rank : ranks) {
            System.out.println(rank);
        }

        /*
        * Stwórz obiekt typu Karta (Card). Kartę będą opisywać dwa pola klas enumowych Rank(Ranga np. dziewiątka, as) oraz Suit (Kolor - np. pik).
Stwórz dwie dowolne karty w mainie, różniące się rangą i kolorem, zaprezentuj je wykorzystując nadpisaną metodę toString.
W mainie wyświetl wszystkie możliwe rangi wykorzystując statyczną metodę enumów - values().
Każda z rang ma mieć przypisaną siłę, dla dwójki 2, trójki 3 itd.
Obiekty kart mają mieć metodę pozwalającą na pobranie siły karty. Stwórz dodatkowy serwis pozwalający porównać dwie karty, drukujący tą która jest większa.
Stwórz listę wszystkich możliwych rang w kolorze pik. (wykorzystaj pętle dla automatyzacji zadania)
Stwórz całą talię, czyli listę wszystkich możliwych rang dla wszystkich możliwych kolorów.

*/


    }
}
