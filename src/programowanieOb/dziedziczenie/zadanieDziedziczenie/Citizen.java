package programowanieOb.dziedziczenie.zadanieDziedziczenie;

public abstract class  Citizen {

    private String name;

    public Citizen(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean canVote();

    /*
    * 4.	Stwórz klasę abstrakcyjną Citizen oraz klasy dziedziczące:
a.	Peasant(Chłop),
b.	Townsman(Mieszczanin),
c.	King(Król),
d.	Soldier(Żołnierz)
Wszystkie klasy posiadają pole imie (przemyśl gdzie powinno się znajdować to pole).
*  Citizen powinien być klasą abstrakcyjną która posiada metodę abstrakcyjną 'canVote' która zwraca true dla townsman'a i soldier'a, ale false dla chłopa i króla.

Stwórz klasę Town która posiada tablicę Citizenów. Dodaj do niej kilku citizenów (różnych w mainie
* ) i stwórz metody howManyCanVote które zwracają ilość osób które mogą głosować. Stwórz w klasie Town metodę "whoCanVote" która wypisuje imiona osób które mogą głosować.
*/

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                '}';
    }
}
