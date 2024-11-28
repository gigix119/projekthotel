package proceduralne.ogrod;

import java.util.Random;

public class Kwiat {
    /*
    * Kwiat kwitnie lub nie i ma jakis kolor (String lub enum)
Nowo stworzony kwiat nie kwitnie.
Kwiat można stworzyć na dwa sposoby, można podać kolor lub nie.
Jeśli nie podamy koloru to powinien wstawić się losowy kolor z 4 możliwych.
(zastosuj dwa konstruktory)*/

    private boolean kwitnie = false;
    private Kolor kolor;

    public Kwiat(Kolor kolor) {
        this.kolor = kolor;
    }

    public Kwiat() {
        Random random = new Random();
        Kolor[] kolory = Kolor.values();
        int nowyKolor = random.nextInt(kolory.length);
        kolor = kolory[nowyKolor];
    }

    public void podlej() {
        kwitnie=true;
    }

    public void zaczekajNoc(){
        kwitnie=false;
    }

    @Override
    public String toString() {
        return "Kwiat{" +
                "kwitnie=" + kwitnie +
                ", kolor=" + kolor +
                '}';
    }
}
