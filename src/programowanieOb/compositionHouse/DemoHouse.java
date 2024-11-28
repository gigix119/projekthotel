package programowanieOb.compositionHouse;

public class DemoHouse {
    /*
    * Zrób osobny pakiet, w którym stworzysz następującą strukturę.
Obiekt House posiada jedne drzwi i tablicę pokojów (obiekty Door i Room). Pokój posiada łóżko (Bed) oraz tablicę okien (Window).
Łóżko może być pościelone lub nie, a okno otwarte lub zamknięte.
Zadbaj aby program realizował następujące stwierdzenia:
Aby stworzyć dom należy wstawić tablicę pokojów, a drzwi frontowe powinny utworzyć się automatycznie.
Aby stworzyć pokój należy podać w argumencie konstruktora ile ma mieć okien (okna mają tworzyć się automatycznie jako zamknięte),
łóżko ma stworzyć się samo jako niepościelone


W programie stwórz dom z dwoma pokojami, jeden z dwoma oknami, a drugi, większy z czterema.
W klasie House przygotuj metodę sprzątającą, której zadaniem będzie pootwieranie wszystkich okien oraz pościelenie łóżek.
*/

    public static void main(String[] args) {
        Room room1 = new Room(2);
        Room room2 = new Room(4);
        Room[] rooms = {room1, room2};
        House house = new House(rooms);
        System.out.println(house);
        house.cleanHouse();
        System.out.println(house);


    }
}
