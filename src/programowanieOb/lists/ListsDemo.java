package programowanieOb.lists;

import programowanieOb.race.Car;

import java.util.ArrayList;
import java.util.Random;

public class ListsDemo {
    public static void main(String[] args) {
        Car car1 = new Car(1000);
        Car car2 = new Car(2000);
        Car car3 = new Car(3000);

        Car[] cars = new Car[]{car1,car2,car3};
        for (Car car : cars) {
            System.out.println(car);
            car.ride(100);
        }


        ArrayList<Car> carsList = new ArrayList<>();
        System.out.println(carsList.size());
        carsList.add(car1);
        System.out.println(carsList.size());
        System.out.println(carsList);
        carsList.add(car2);

        for (Car car : carsList) {
            System.out.println(car);
        }
        ArrayList<Integer> numbers = new ArrayList<>(); //w <> można wstawiać tylko obiekty
        Integer numer = 10; //autoboxing
        int numer2 = numer;//unboxing
        //Byte, Short, Integer, Double, Character...
        numbers.add(123);
        numbers.add(345);
        numbers.add(23);
        numbers.add(34);
        System.out.println(numbers);
        System.out.println(numbers.size());
        numbers.remove(0);
        System.out.println(numbers);
        System.out.println(numbers.size());
//        numbers.clear();
//        System.out.println(numbers);
//        System.out.println(numbers.size());

        ArrayList<Integer> numers2 = new ArrayList<>();
        numbers.add(23);
        numbers.add(24);
        numbers.add(25);
        numbers.add(26);
        //numbers.addAll(numers2);
        //System.out.println(numbers);
        numbers.removeAll(numers2);
        System.out.println(numbers);

        ArrayList<String> names = new ArrayList<>();
        names.add("Marcin");
        names.add("Ala");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Zofia");
        names2.add("Marcin");

        //names.retainAll(names2);
        names.remove("Ala");
        System.out.println(names);
        System.out.println(names2);


    }
}
