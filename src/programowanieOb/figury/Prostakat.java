package programowanieOb.figury;

public class Prostakat {
    private int range;


    public Prostakat(int range) {
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Prostakat{" +
                "range=" + range +
                '}';
    }
}

