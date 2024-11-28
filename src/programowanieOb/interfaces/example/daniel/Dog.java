package programowanieOb.interfaces.example.daniel;

public class Dog extends Animal implements FriendlyAnimal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
        super("Burek", 2);
    }


    public void makeSound(){
        System.out.println("hau hau");
    }

    public void sit() {
        System.out.println("Siada na komende");
    }

    public void feed(){
        super.feed();
        System.out.println("Pies je kość");
    }

}
