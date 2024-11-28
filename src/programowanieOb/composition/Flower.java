package programowanieOb.composition;

public class Flower {

    //kwitnie lub nie
    //kolor

    private boolean bloom = false;
    private String color;

    public Flower(String color) {
        this.color = color;
    }

    public void water() {
        bloom = true;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "bloom=" + bloom +
                ", color='" + color + '\'' +
                '}';
    }
}
