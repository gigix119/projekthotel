package programowanieOb.poczta;

import java.util.Random;

public class Przesylka {

    //cechy
    private double waga;
    private String rodzaj;
    private String adresat;

    //konstruktory - sluzy do przygotowania cech obiektu
    public Przesylka() {  //nie ma typu zwracanego, nazwa taka jak klasa
        waga = 1;
        rodzaj = "Paczka";
        adresat = "Jan Kowalski";
    }

    public Przesylka(double waga, String rodzaj, String adresat) {
        this.waga = waga;
        this.rodzaj = rodzaj;
        this.adresat = adresat;
    }


    //zachowania
    public void wyswietlAdresata() {
        System.out.println(rodzaj + " zaadresowana na: " + adresat);
    }

    public void wyswietlWage() {
        System.out.println(rodzaj + " waży: " + waga + " kg");
    }

    public String toString() {
        return "Waga: " + waga + "kg Rodzaj: " + rodzaj + " adres: " + adresat;
    }

    public void setWaga( double nowaWaga){
        waga = nowaWaga;
    }

    public String getAdresat(){
        return adresat;
    }


}

//private , - tylko w klasie
// default, - tylko w pakiecie i klasie
// protected, - dla klas dziedziczacych i w pakiecie i klasie
// public  - wszędzie: dla innych pakietów dla klas dziedziczacych i w pakiecie i klasie
// -> modyfikatory dostępu
