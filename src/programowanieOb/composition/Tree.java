package programowanieOb.composition;

import java.util.Random;

public class Tree {

    //iloscOwocow
    private int fruits;

    public Tree() {
        Random random = new Random();
        fruits = random.nextInt(10);
    }

    public int gatherFruits() {
        int gathered = fruits;
        fruits = 0;
        return gathered;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "fruits=" + fruits +
                '}';
    }
}
