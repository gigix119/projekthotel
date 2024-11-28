package programowanieOb.cardEnum;

public enum Suit {
    HEART("Serce"),SPADES("Pik"),DIAMONDS("Karo"),CLUBS("Trefl");

    private String name;
    Suit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
