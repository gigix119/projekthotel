package programowanieOb.sklep;

public class Produkt {
    private int cena;
    private int sztuki;
    private String nazwa;

    public Produkt (int nowaCena, int noweSztuki, String nowaNazwa){
        cena=nowaCena;
        sztuki=noweSztuki;
        nazwa=nowaNazwa;
    }

    public int getCena(){
        return cena;
    }
    public int getSztuki(){
        return sztuki;
    }
    public String getNazwa(){
        return nazwa;
    }
    public void setSztuki(int noweSztuki){
        sztuki=noweSztuki;
    }


}
