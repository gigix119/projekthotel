package programowanieOb.enums;

public enum  Side {
    NORTH(0),EAST(90), SOUTH(180), WEST(270);
    //wymieniamy wszystkie wartosci(obiekty) typu Side

    //cechy
    private int degree;
    //konstruktory

   Side(int degree) {
        this.degree = degree;
    }


    //zachowania

    public int getDegree() {
        return degree;
    }
}
