package programowanieOb.exceptions;

public class Produkt {
    private int cena;
    private String nazwa;

    public Produkt(int cena, String nazwa) {
        this.cena = cena;
        this.nazwa = nazwa;
    }

    public int getCena() {
        return cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    @Override
    public String toString() {
        return nazwa +" "+ cena + " zł";
    }
}
