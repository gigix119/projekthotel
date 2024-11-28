package programowanieOb.interfaces.example.daniel;

public class Tiger extends Cat implements WildAnimal {
    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("roar!");
    }

    @Override
    public void feed() {
        System.out.println("tygrys je opiekuna");
    }

    @Override
    public void hunt() {
        System.out.println("tygrys goni ofiarę");
    }

    @Override
    public void findGroup() {
        System.out.println("Szuka innych tygrysów");
    }
}
