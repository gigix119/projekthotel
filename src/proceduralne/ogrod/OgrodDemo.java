package proceduralne.ogrod;

public class OgrodDemo {
    public static void main(String[] args) {
        Lawka lawka = new Lawka("drewno");
        Drzewo drzewo = new Drzewo();
        String[] sztuczki = {"DajLape", "Siad", "Lezec", "Waruj"};
        Pies pies = new Pies("Reks", sztuczki);
        Kwiat kwiat = new Kwiat();
        Kwiat[] kwiaty = {kwiat, new Kwiat()};
        Ogrod ogrod = new Ogrod(lawka, kwiaty, 2,pies);
        drzewo.owocuj();
        System.out.println(lawka);
        System.out.println(drzewo);
        System.out.println(pies);
        System.out.println(kwiat);
        System.out.println(ogrod);
        System.out.println(drzewo.zbierajOwoce());
        System.out.println(drzewo);
        pies.bawSie();
        ogrod.wejdzDoOgrodu();
        ogrod.podlejKwiaty();
        System.out.println(ogrod);
        ogrod.odpocznij();
        ogrod.zbierajOwoce();
        ogrod.zbierajOwoce();
        ogrod.wyjdzZOgrodu();
        System.out.println(ogrod);
        ogrod.pracujWogrodzie();
    }
}
