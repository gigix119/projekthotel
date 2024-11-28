package programowanieOb.podstawy;

public class MmaDemo {
    public static void main(String[] args) {
        PodrecznikTreningowy podrecznikMma = new PodrecznikTreningowy();
        PodrecznikTreningowy podrecznikPilka = new PodrecznikTreningowy();
        Uczen uczen1 = new Uczen();
        Uczen uczen2 = new Uczen();
        podrecznikMma.sport ="mma";
        podrecznikMma.cwiczenie="LowkKick";
        podrecznikPilka.sport ="Pilke Nozna";
        podrecznikPilka.cwiczenie="Rzuy Wolne";
        uczen1.imie="Bartek";
        uczen2.imie="Leo";
        uczen1.wytrzymalosc = 100;
        uczen2.wytrzymalosc = 90;
        uczen2.podrecznik=podrecznikPilka;
        uczen1.podrecznik=podrecznikMma;
        uczen1.przywitajSie();
        uczen1.jakiSportCwiczysz();
        uczen2.przywitajSie();
        uczen2.jakiSportCwiczysz();
        uczen1.cwiczeSport();
        uczen2.cwiczeSport();
        System.out.println(uczen1.wytrzymalosc);
        System.out.println(uczen2.wytrzymalosc);

        // uczniowie cwicza na zmiane tak dlugo az ktorys z nich nie otrzyma 300 wytrzymalosci. oglos zwyciezce
        // zaprojektować nowy rodzaj obiektu nadać mu 2 cechy, 2 zachowania i przetestować w osobnej klasie z mainem
    }
}
