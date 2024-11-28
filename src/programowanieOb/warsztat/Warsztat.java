package programowanieOb.warsztat;

public class Warsztat {

    final static int KOSZT_NAPRAWY = 50;
    public void napraw(Samochod samochod) {
        int ilosc=naprawaKol(samochod);
        rachunek(ilosc);

    }

    public int naprawaKol(Samochod nowySamochod) {
        Kolo[] kolaDoNaprawy = nowySamochod.getKola();
        int zepsuteKola = 0;
        for (int i = 0; i < kolaDoNaprawy.length; i++) {
            System.out.println(i + "." + kolaDoNaprawy[i]);
            if (kolaDoNaprawy[i].isPrzebite()) {
                kolaDoNaprawy[i].napraw();
                zepsuteKola++;

            }
        }
        return zepsuteKola;
    }

    public void rachunek(int zepsuteKola) {
        System.out.println("Przebiłeś " + zepsuteKola);
        System.out.println("Do zapłaty masz " + zepsuteKola * KOSZT_NAPRAWY);

    }
}
