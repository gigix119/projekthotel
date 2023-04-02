package programowanieOb.biblioteka;

public class Ksiazka {
    private String nazwa;
    private String autor;
    private int strony;
    private boolean wypozyczona;

    public Ksiazka() {
        nazwa = "Pan Tadeusz";
        autor = "Adam Mickiewicz";
        strony = 300;
        wypozyczona = false;
    }

    public Ksiazka(String nowaNazwa, String nowyAutor, int startoweStrony) {
        nazwa = nowaNazwa;
        autor = nowyAutor;
        strony = startoweStrony;
        wypozyczona = false;
    }


    public void wypozyczKsiazke() {
        if (wypozyczona) {
            System.out.println("Twoja książka jest wypożyczona");
        } else {
            System.out.println("Wypożyczyłeś ksiażke " + nazwa);
            wypozyczona = true;
        }
    }

    public void zwrocKsiazke() {
        if (wypozyczona) {
            System.out.println("Zwrociles ksziazke");
            wypozyczona = false;
        } else {
            System.out.println("Twoja książka juz byla zwrocona");
        }
    }

    public String toString() {
        String notkaWypozyczenie = "";
        if (wypozyczona) {
            notkaWypozyczenie = "wypozyczona";
        } else {
            notkaWypozyczenie = "nie wypozyczona";
        }
        return "Nazwa książki to: " + nazwa + " Której autreom jest: " + autor + " Zawiera " + strony + " Stron i " + notkaWypozyczenie;
    }
    public boolean isWypozyczona(){
        return wypozyczona;
    }

}
