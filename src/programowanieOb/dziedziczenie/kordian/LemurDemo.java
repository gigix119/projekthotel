package programowanieOb.dziedziczenie.kordian;

public class LemurDemo {
    public static void main(String[] args) {
        Hamster hamster = new Hamster("Roman", 3);
        Lemur lemur = new Lemur("Stefan",2);
        lemur.feed();
        lemur.run();
        hamster.run();
        hamster.sleep();
        hamster.feed();
        AnimalGuide animalGuide1 = new AnimalGuide();
        AnimalGuide animalGuide2 = new AnimalGuide();
        animalGuide1.feedAnimal(hamster);
        animalGuide2.feedAnimal(lemur);
        Elephant elephant = new Elephant("Dyzio",5);
        elephant.makeSound();


    }
}
