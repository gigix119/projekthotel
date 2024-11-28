package proceduralne.ogrod;

import java.util.Arrays;

public class Ogrod {
    private Lawka lawka;
    private Pies pies;
    private Drzewo[] drzewa;
    private Kwiat[] kwiaty;

    public Ogrod(Lawka lawka, Kwiat[] kwiaty, int iloscDrzew, Pies pies) {
        this.lawka = lawka;
        this.pies = pies;
        this.kwiaty = kwiaty;
        drzewa = new Drzewo[iloscDrzew];
        for (int i = 0; i < drzewa.length; i++) {
            drzewa[i] = new Drzewo();

        }
    }

    public Ogrod(Lawka lawka, Kwiat[] kwiaty, int iloscDrzew) {
        this(lawka, kwiaty, iloscDrzew, null);
    }

    public void wejdzDoOgrodu() {
        if (pies == null) {
            System.out.println("Szum wiatru");
        } else {
            System.out.println("Pies robi sztuczke");
            pies.bawSie();
        }
    }

    public void podlejKwiaty() {
        for (Kwiat kwiat : kwiaty) {
            kwiat.podlej();
        }
    }

    public void odpocznij() {

        System.out.println("Siadasz na ławce z materiału " + lawka.getMaterial());
    }

    public void zbierajOwoce() {
        int suma = 0;
        for (Drzewo drzewo : drzewa) {
            suma += drzewo.zbierajOwoce();
        }
        System.out.println(suma);

        if (suma==0){
            System.out.println("Przyjdz jutro");
        }

    }

    public void wyjdzZOgrodu(){
        for (Drzewo drzewo : drzewa) {
            drzewo.owocuj();

        }

        for (Kwiat kwiat : kwiaty) {
            kwiat.zaczekajNoc();
        }
    }

    public void pracujWogrodzie(){
        wejdzDoOgrodu();
        podlejKwiaty();
        odpocznij();
        zbierajOwoce();
        wyjdzZOgrodu();
    }


    @Override
    public String toString() {
        return "Ogrod{" +
                "lawka=" + lawka +
                ", pies=" + pies +
                ", drzewa=" + Arrays.toString(drzewa) +
                ", kwiaty=" + Arrays.toString(kwiaty) +
                '}';
    }
}
