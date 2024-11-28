package programowanieOb.interfaces.example.daniel;

public class Cat extends Animal{


  /*  public Cat() {
       super(); //;wywolanie konstruktora bazowego
        name = "Maurycy";
        age = 3;
    }*/

    public Cat(){
        super("Maurycy",3);
    }

    public Cat(String name, int age){
        super(name,age);
    }

    public void makeSound() {
        System.out.println("Miał!");
    }

    public void hunt() {
        System.out.println(getName() + " poluje na myszy");
    }
/*
    public void feed(){
        super.feed();
        System.out.println("Kot je rybę");
    }*/

    @Override
    public void feed() {
        super.feed();
        System.out.println("Kot je rybę");
    }
}
