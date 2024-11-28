package proceduralne.ogrod;

import java.util.Random;

public class Drzewo {
    private int owoce = 0;

    public Drzewo() {
        Random random = new Random();
        int iloscOwocow = random.nextInt(901) + 100; // 0-100 / 100 - 1100
        owoce = iloscOwocow;
    }

    public void owocuj() {
        Random random = new Random();
        owoce += random.nextInt(100) + 1;

    }

    public int zbierajOwoce() {
        int noweOwoce = owoce;
        owoce = 0;
        return noweOwoce;
    }

    @Override
    public String toString() {
        return "Drzewo{" +
                "owoce=" + owoce +
                '}';
    }
}
