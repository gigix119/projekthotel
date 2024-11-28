package programowanieOb.lists;

import java.util.ArrayList;

public class ListyZadanie {
    public static void main(String[] args) {

        /*
        * Stwórz listę imion i uzupełnij je 5 imionami.
Wyświetl wszystkie imiona
Wyświetl pierwsze imię
Zmień drugie imię na “Marcin”
Usuń jedno z imion
Stwórz drugą listę z dwoma kolejnymi imionami i dodaj do niej wszystkie imiona z poprzedniej za pomocą metody addAll
Wyświetl wszystkie imiona z drugiej listy wielkimi literami
Wyświetl tylko żeńskie imiona (umownie - te kończące się na ‘a’)
*/

        ArrayList<String> names = new ArrayList<>();
        names.add("Łukasz");
        names.add("Piotr");
        names.add("Marcin");
        names.add("Dawid");
        names.add("Mateusz");

        System.out.println(names.set(1, "Marcin"));
        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.remove(2));
        System.out.println(names);

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Ala");
        names1.add("Zofia");

        names1.addAll(names);
        System.out.println(names1);
        for (String name : names1) {
            System.out.print(name.toUpperCase() + " ");
        }
        System.out.println( );
        for (String name : names1) {
            if (name.endsWith("a")){
                System.out.println("Imie żeńskie " + name);
            }
        }
    }
}
