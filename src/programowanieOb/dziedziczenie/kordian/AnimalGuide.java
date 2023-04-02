package programowanieOb.dziedziczenie.kordian;

public class AnimalGuide {
    public void feedAnimal(Animal animal){
        animal.feed();
        animal.makeSound();
        System.out.println(animal);
        System.out.println("Nakarm zwierze ");
    }
}
