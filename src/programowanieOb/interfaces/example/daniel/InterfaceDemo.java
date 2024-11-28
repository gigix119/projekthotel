package programowanieOb.interfaces.example.daniel;

public class InterfaceDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bruno", 7);
        HouseCat cat = new HouseCat();
        Tiger tiger = new Tiger("Mickey", 4);
        AnimalGuide guide = new AnimalGuide();
        guide.feedAnimal(dog1);
        guide.feedAnimal(cat);
      //  guide.feedAnimal(tiger);

        WildAnimal wildTiger = tiger;
        wildTiger.hunt();
        wildTiger.findGroup();

    }

    //interfejsy:
    //maksymalnie abstrakcyjne -> tylko abstrakcyjne metody
    //mozna implementowac wiele interfejsow

    //sluza do definionia nowych typow zmiennych (tematycznich grup obiektow)
    //interfejsy nie maja zmiennych ani konstruktorow
    //klasy abstrakcyjne sluza do przygotowywania bazowego szkieletu klas



}
