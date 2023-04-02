package programowanieOb.dziedziczenie.kordian;

public class Hamster extends Animal {

    public Hamster (String name, int age){
        super(name,age);
    }
        public Hamster(){
            super("Felix",1);
        }

    public void sleep(){
        System.out.println("Chomik śpi ");
    }

    public void run(){
        System.out.println("Chomik biega, w kolku ");
    }
    public void makeSound(){
        System.out.println("Chomik piszczy ");
    }
    public void feed(){
        super.feed();
        System.out.println("Chomik je karme ");
    }


}
