package koy.podstawy;

public class SwingPodstawy {
    private int number;
    private String name;

    public SwingPodstawy(int number, String name) {
        this.number = number;
        this.name = name;
    }

    void hej(){

    }

    @Override
    public String toString() {
        return "SwingPodstawy{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}

