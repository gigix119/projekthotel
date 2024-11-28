package programowanieOb.race;

import java.util.Scanner;

public class CarService {


    public Car buildCar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the model of your car?");
        String model = scanner.nextLine();
        System.out.println("What is your mileage?");
        double mileage = scanner.nextDouble();
        Car car3 = new Car(model, mileage);
        return car3;
    }

    public void checkOverview(Car car) {

        double overview = car.kilometersToOcerview();
        if (overview > 0) {
            System.out.println("Overview jest przed tobą za " + overview + "km");
        } else {
            System.out.println("Trzeba było zrobić przegląd " + -overview + " temu");
        }
    }


}
