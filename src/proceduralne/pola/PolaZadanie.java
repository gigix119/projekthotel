package proceduralne.pola;

public class PolaZadanie {

   static String dna = "tttgctgatgtaccaatatcgtgaccgcta";

    public static void main(String[] args) {
        System.out.println(dna);
        zwiekszLitery();
        System.out.println(dna);
        zamianaLiter();
        System.out.println(dna);
        skrocKod();
        System.out.println(dna);
        wstawSpacje();
        System.out.println(dna);
    }
public static void zwiekszLitery(){
    dna=dna.toUpperCase();
}

public static void zamianaLiter(){
    dna=dna.replace("A","T").replace("G","C");
}
public static void skrocKod(){
        dna=dna.substring(0,15);
}
public static void wstawSpacje(){
        String nowaWersja = "";
    for (int i = 0; i <dna.length(); i++) {
        nowaWersja+=dna.charAt(i)+"";
        if (nowaWersja.length()>3){
            nowaWersja+= " ";
        }
    }dna=nowaWersja;
}
}

   /* W nowej klasie zadeklaruj pole odpowiedniego typu o nazwie “dna”, a jego treść uzupełnić losową sekwencją 30 liter wykorzystując ten generator kodu DNA.
        Stwórz metody, które wykonają następujące operacje:
        zapisanie kodu dużymi literami,
        zmiana wszystkich A na T i wszystkich G na C,
        przycięcie kodu do pierwszych 15 znaków,
        * wstawienie spacji co trzeci znak. */


