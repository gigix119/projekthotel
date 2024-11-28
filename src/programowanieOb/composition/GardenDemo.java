package programowanieOb.composition;

public class GardenDemo {
    public static void main(String[] args) {
        Bench bench = new Bench("wood");
        System.out.println(bench);
        Flower flower = new Flower("Red");
        Flower flower2 = new Flower("Blue");
      /* Flower[] flowers = new Flower[2];
        flowers[0] = flower;
        flowers[1] = flower2;*/
        Flower[] flowers = {flower, flower2};

        System.out.println(flower);
        Garden garden = new Garden(bench, 4,flowers);
        System.out.println(garden);
        garden.sitOnBench();
        garden.waterFlowers();
        garden.gatherFruits();
        garden.gatherFruits();
        System.out.println(garden);

    }
}
