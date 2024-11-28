package zzajecia;

import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {

        Lambda lambda = new Lambda();
        String result = lambda.mojaMetoda();
        System.out.println(result);

        DriveInterface car = new Car();
        System.out.println(car.jedz());

        AtrapaSamochodu atrapaSamochodu = new Car();
        DriveInterface jezdzenie = new Car();
        Object jazda = new Car();
        Car car1 = new Car();


        Example example = new Example() {
            @Override
            public String mojaMetoda(String slowo) {
                return null;
            }

            @Override
            public String mojaMetoda2(String slowo) {
                return null;
            }
        };

       /* Example example1 = slowo -> {
            return null;
        };*/

        List<String> imiona = List.of("Artur", "Krzysiek", "Robert");

        List<String> filterdList = imiona.stream().filter(imie -> imie.length() > 5)
                .collect(Collectors.toList());

        System.out.println(filterdList);
    }


    //Deklaracja metody---->
    public String mojaMetoda() {
        return "Hello world! ";
    }
    //miedzy klamrami cialo metody.
}
