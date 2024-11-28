package programowanieOb.warsztat;

public class Kolo {
    private double cisnienie;
    private boolean przebite;

    public Kolo(double cisnienie) {
        this.cisnienie = cisnienie;
        przebite=false;

    }

    @Override
    public String toString() {
        return "Kolo{" +
                "cisnienie=" + cisnienie +
                ", przebite=" + przebite +
                '}';
    }

    public void przebij(){
        przebite=true;
        cisnienie=0;
    }
    public void napraw(){
        przebite=false;
        cisnienie=2.3;
    }

    public boolean isPrzebite() {
        return przebite;
    }
}
