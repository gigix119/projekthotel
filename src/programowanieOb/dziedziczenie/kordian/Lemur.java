package programowanieOb.dziedziczenie.kordian;

public class Lemur extends Animal {

    public Lemur (String  name, int age){
        super(name,age);
    }

    public Lemur(){
        super("Julian",3);
    }

    public void run(){
        System.out.println("Lemur biega ");
    }

    public void makeSound(){
        System.out.println("Lemur rozmawia");
    }
    public void feed(){
        super.feed();
        System.out.println("Lemur je banana");
    }

}
