package podstawy;

public class Main {
    public static void main(String[] args) {

        System.out.println(" witaj ");
        //Stwórz zmienną typu String i zainicjuj ją dowolnym zdaniem złożonym, a następnie:
        //wyświetl zdanie dużymi literami,
        //zapisz w zmiennej odpowiedniego typu ilość symboli w zdaniu,
        //wyświetl pierwszą literę w tym zdaniu,
        //nadpisz oryginalną zmienną tak, żeby zawierała zdanie wielkimi literami,
        //wyświetl odpowiedź na pytanie czy w zdaniu znajduje się słowo “nie” (true/false),
        //wyświetl fragment tekstu od znaku 5 do 13,
        //wyświetl fragment tekstu od znaku 7 do końca,
        //*wyświetl ostatnią literę zdania, program ma działać poprawnie dla zdania dowolnej długości
        //*wyświetl zdanie 5 razy dodając po drodze symbol nowej linni metodą concat(String)

        // ctrl+alt+l
        String tekst = "krzeslo stoi przy stole";
        System.out.println(tekst.toUpperCase());
        int dlugosc = tekst.length();
        System.out.println(dlugosc);
        System.out.println(tekst.charAt(0));
        System.out.println(tekst);
        //tekst=tekst.toUpperCase();
        System.out.println(tekst);
        //tekst=tekst.length()+"";
        //System.out.println(tekst);
        if (tekst.contains("nie")) {
            System.out.println("zdanie zawiera \"nie\"");
        } else {
            System.out.println("zdanie nie zawiera słowa \"nie\"");
        }
        System.out.println(tekst.substring(5,13));
        System.out.println(tekst.substring(7));
        System.out.println(tekst.charAt(tekst.length()-1));
        System.out.println(tekst.concat("\n").repeat(5).length());
    }
}
