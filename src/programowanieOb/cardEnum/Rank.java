package programowanieOb.cardEnum;

public enum Rank {
    TWO(2,"Dwojka"),
    THREE(3,"Trojka"),
    FOUR(4,"Czworka"),
    FIVE(5,"Piatka"),
    SIX(6,"Szostka"),
    SEVEN(7,"Siodemka"),
    EIGHT(8,"Osemka"),
    NINE(9,"Dziewiatka"),
    TEN(10,"Dziesiatka"),
    JACK(10,"Jopek"),
    QUEEN(10,"Dama"),
    KING(10,"Krol"),
    AS(11,"As");
    private int strength;
    private String name;

    Rank(int strength,String name) {
        this.strength = strength;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
