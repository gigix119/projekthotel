package programowanieOb.interfaces.example.kordian;

public interface IFamilyMember {
    /*
    * 1.	Utwórz interfejs ICzłonekRodziny i metodą przedstawSie():void. Wykorzystaj interfejs i implementuj go w klasach Matka, Ojciec, Syn, Córka.
a.	dla klasy Matka niech instancja wypisuje wartość “i am mother”,
b.	dla klasy Ojciec niech instancja wypisuje wartość “i am your father”,
c.	dla klasy Córka niech instancja wypisuje wartość “i am daughter ;) ”,
d.	dla klasy Syn niech instancja wypisuje wartość “who’s asking?”

e.	Dopisz w interfejsie dodatkową metodę jestDorosły():boolean która zwraca dla rodziców true, dla dzieci false.
f.	Stwórz w mainie kilka instancji powyższych klas. Przechowaj je w liście, a następnie iteruj i wypisuj w kolejnych liniach ich metody ‘przedstawSie()’ oraz “jestDorosły”
g.	we wszystkich klasach dodaj pole imie.
h.	Zmień metodę ‘przedstawSie()’ tak, aby poza treścią wypisywała również imie członka rodziny. Imie przypisuj w konstruktorze
i.	*Zamień metodę przedstawSie():void na defaultową. Domyślnie metoda ma wypisać “I am just a simple family member”.
*/
    default void whoAreYou() {
        System.out.println("I am just a simple family member ");
    }

    boolean isMatuer();

}
