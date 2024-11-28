package programowanieOb.enumyDemo;

public enum RodzajKarty {
    DZIEWIATKA(9), DZIESIATKA(10), JOPEK(11),DAMA(12), KROL(13), AS(14);

    //cechy
    int sila;

    //konstruktory
    private RodzajKarty(int nowaSila){
        sila = nowaSila;
    }

    //zachowania
    public String toString(){
        return name() + " siła: " + sila;
    }

    //name() podstawia nazwe enuma

}
