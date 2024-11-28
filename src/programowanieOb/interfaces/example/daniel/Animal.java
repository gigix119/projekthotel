package programowanieOb.interfaces.example.daniel;

public abstract class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void feed() {
        System.out.println(name + " zabiera się do jedzenia");
    }


    public abstract void makeSound();  // metoda abstrakcyjna nie ma działania (bez klamry)

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//klasa abstrakcyjna:
//może mieć abstrakcyjne metody
//nie można robić obiektu bezpośrednio z tej klas

//private -> tylko w klasie
//package-default -> tylko w pakiecie
//protected -> pakiet i klasy dziedziczace
//public -> wszystkie pakiety
