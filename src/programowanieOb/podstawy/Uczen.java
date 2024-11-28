package programowanieOb.podstawy;

import java.util.Random;

public class Uczen {
    String imie;
    PodrecznikTreningowy podrecznik;
    int wytrzymalosc;

    public void przywitajSie(){
        System.out.println("Nazywam sie " + imie);
    }

    public void jakiSportCwiczysz(){
        System.out.println("Ćwiczę " + podrecznik.sport);
    }

    public void cwiczeSport(){
        System.out.println("Zaczynam cwiczyc "+ podrecznik.sport);
        Random random = new Random();
        int ileWykonan = random.nextInt(wytrzymalosc);
        wytrzymalosc+=ileWykonan / 10;
        System.out.println("Wykonuje " + ileWykonan+ " " + podrecznik.cwiczenie);
    }

    //p uza 10 wykonanych cwiczen rosnie mu 1 punkt wytrzymalosci
}
