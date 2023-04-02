package programowanieOb.dziedziczenie.kordian;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void feed(){
        System.out.println(name +"Zabier sie do jedzenia");
    }
    public abstract void makeSound();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
