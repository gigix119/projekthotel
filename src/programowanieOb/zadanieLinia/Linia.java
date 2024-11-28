package programowanieOb.zadanieLinia;

public class Linia {
    private int dlugosc;
    private char wypelnienie;

    public Linia (int dlugosc, char wypelnienie){
        this.dlugosc=dlugosc;
        this.wypelnienie=wypelnienie;
    }
    public void drukujLinie(){
        for (int i = 0; i < dlugosc; i++) {
            System.out.print(wypelnienie);
        }
        System.out.println();
    }
}
