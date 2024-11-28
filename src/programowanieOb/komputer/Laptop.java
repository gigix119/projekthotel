package programowanieOb.komputer;

public class Laptop {
    private int ram;
    private String firma;
    private int dysk;
    private String kartaGraficzna;

    public Laptop(int ram, String firma, int dysk, String kartaGraficzna) {
        this.ram = ram;
        this.firma = firma;
        this.dysk = dysk;
        this.kartaGraficzna = kartaGraficzna;
    }

    public int getDysk() {
        return dysk;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                ", firma='" + firma + '\'' +
                ", dysk=" + dysk +
                ", kartaGraficzna='" + kartaGraficzna + '\'' +
                '}';
    }
}
