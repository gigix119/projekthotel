package programowanieOb.composition;

public class Bench {

    //rodzaj materiału
    private String material;
    private boolean inUse = false;

    public Bench(String material) {
        this.material = material;
    }

    public void sit(){
        if (inUse) {
            System.out.println("lawka zajeta!");
            return;
        }
        System.out.println("Siadasz");
        inUse = true;
    }

    @Override
    public String toString() {
        return "Bench{" +
                "material='" + material + '\'' +
                '}';
    }
}
