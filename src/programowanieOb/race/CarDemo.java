package programowanieOb.race;

import java.util.Arrays;
import java.util.Scanner;

public class CarDemo {

  /*  Stwórz klasę typu Samochod oraz SamochodDemo z metodą main.
    W metodzie main stwórz dwa obiekty typu samochód.
    Obiekty typu Samochod mają mieć następujące cechy: marka, przebieg oraz przebieg do przeglądu, ta ostatnia uzupełniona jakąś wartością np 20 000 km.
    W metodzie main nadaj wartości dla cech stworzonych wcześniej samochodów.

    Dla obiektów typu Samochod przygotuj następujące zachowania oraz przetestuj je w main:

    Stwórz metodę wyświetlającą markę samochodu oraz przebieg
    Stwórz metodę przyjmującą odległość do przejechania i zwiększającą przebieg samochodu o tę odległość
    Stwórz metodę zwracającą ilość kilometrów po których trzeba będzie wykonać przegląd (uwzględniając aktualny przebieg)

    wariant trudniejszy: stwórz w main tablicę samochodów a następnie wykorzystując pętlę wyświetl dane każdego z nich*/


/*    W tym zadaniu wykorzystaj wcześniej przygotowaną klasę Samochod. zaprogramuj aplikację pytającą o model Twojego samochodu oraz przebieg.
    Możesz zrobić to w metodzie main. Aplikacja ta ma stworzyć obiekt samochód i sprawdzić czy dany samochód powinien zrobić przegląd czy nie.
    Jeśli tak, powinna wyświetlić “samochód o marce … powinien zrobić przegląd już … kilometrów temu!”, a jeśli wszystko jest okej może wyświetlić “
    Dla samochodu o marce … zostało jeszcze … kilometrów do przeglądu”.*/



    /*Przenieś kod obsługujący kontrolę przeglądów do osobnego obiektu typu SamochodSerwis.
     Powinieneś w nowej klasie uzyskać dwie metody, jedna tworząca samochód i zwracająca go a
      druga przyjmująca samochód i wyświetlająca dane na temat przeglądu.
wariant trudniejszy: Przygotuj w main tablicę samochodów. Oblicz ich łączny przebieg wykorzystując pętlę foreach.
 Przenieś nową funkcjonalność do klasy CarService jako metodę przyjmującą tablicę i zwracającą int.

*/

    public static void main(String[] args) {

        Car car1 = new Car("Ferrari", 15.500);
        Car car2 = new Car("McLaren", 13.300);

        Car[] cars = new Car[2];
        cars[0] = car1;
        cars[1] = car2;

        System.out.println(car1);
        System.out.println(car2);
        car1.ride(3.50);
        System.out.println(car1);
        System.out.println(car1.kilometersToOcerview());

        //iter
        for (Car car : cars) {
            car.ride(4.70);
        }
        System.out.println(Arrays.toString(cars));


        CarService carService= new CarService();
        Car car =carService.buildCar();
        carService.checkOverview(car);


    }


}
