package programowanieOb.composition;

import java.util.Arrays;

public class Garden {
    //jedna ławka
    //wiele drzew
    //wiele kwiatów

    private Bench bench; // obiekt posiada inny obiekt -> kompozycja
    private Tree[] trees;
    private Flower[] flowers;


    //ławkę nalezy wstawić przy tworzeniu ogrodu
    //trzeba podać ile ma się stworzyć drzew
    //trzeba przekazać kwiaty

    public Garden(Bench bench, int treesCount, Flower[] flowers) {
        this.bench = bench; // pozwala pobrać ławke przy tworzeniu i wstawic ja do pola bench
        trees = new Tree[treesCount];
        for (int i = 0; i < treesCount; i++) {
            trees[i] = new Tree();
        }

        this.flowers = flowers;
    }

    //waterFlowers
    public void waterFlowers() {
        for (Flower flower : flowers) {
            flower.water();
            System.out.println("Podlewam kwiat koloru: " + flower.getColor());
        }
    }

    //gatherFruits
    public void gatherFruits() {
        int allFruits = 0;
        for (Tree tree : trees) {
            allFruits += tree.gatherFruits();
        }
        System.out.println("Zebrrałeś: " + allFruits + " owoców ");
    }

    //sitonBench
    public void sitOnBench() {
        bench.sit();

    }


    @Override
    public String toString() {
        return "Garden{" +
                "bench=" + bench +
                ", trees=" + Arrays.toString(trees) +
                ", flowers=" + Arrays.toString(flowers) +
                '}';
    }
}
