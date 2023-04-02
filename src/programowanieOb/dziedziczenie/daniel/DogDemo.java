package programowanieOb.dziedziczenie.daniel;

import java.util.Random;

public class DogDemo {
    public static void main(String[] args) {
       Dog dog1 = new Dog("Bruno",7);

        dog1.makeSound();
        dog1.sit();
        dog1.feed();

        System.out.println(dog1);

        Cat cat = new Cat();
        cat.makeSound();
        cat.hunt();
        cat.feed();

       // Animal animal = new Animal();


        System.out.println(cat);

        AnimalGuide guide = new AnimalGuide();
        guide.feedAnimal(dog1);
        guide.feedAnimal(cat);

        Random random = new Random();

        Animal animal;
        if (random.nextBoolean()) {
            animal = new Dog();
        } else {
            animal = new Cat();
        }
        animal.feed();

        //jesli jest to pies to ma usiasc, jesli jest to kot to ma polować


        if(animal instanceof Cat){ // sprawdza czy zmienna animal zawiera obiekt typu Cat
            Cat someCat =(Cat) animal; // downcasting -> rzutowanie w dol
            someCat.hunt();
        }else {
            Dog someDog = (Dog) animal;
            someDog.sit();
        }


        Mouse mouse = new Mouse("Mickey", 4);
        mouse.makeSound();



    }


    //instanceof
    //abstrakcyjne metody




}
