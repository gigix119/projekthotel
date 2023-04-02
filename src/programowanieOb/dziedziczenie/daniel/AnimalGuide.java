package programowanieOb.dziedziczenie.daniel;

public class AnimalGuide {

  /*  public void feedAnimal(Dog dog) {
        System.out.println("Opiekun karmi psa");
        dog.feed();
    }

    public void feedAnimal(Cat cat) {
        System.out.println("Opiekun karmi kota");
        cat.feed();
    }*/

    public void feedAnimal(Animal animal) {
        System.out.println("Opiekun karmi zwierze");
        animal.feed();
        animal.makeSound();
    }

}
