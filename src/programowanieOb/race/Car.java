package programowanieOb.race;

public class Car {
 /*   Stwórz metodę wyświetlającą markę samochodu oraz przebieg
    Stwórz metodę przyjmującą odległość do przejechania i zwiększającą przebieg samochodu o tę odległość
    Stwórz metodę zwracającą ilość kilometrów po których trzeba będzie wykonać przegląd (uwzględniając aktualny przebieg)*/


    private String brand = "Lamborghini";
    private double mileage;
    private double carOverview = 20_000;

    public Car(String brand, double mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }


    public Car(double mileage) {
        this.mileage = mileage;
    }

    public void ride(double distance) {
        mileage += distance;
    }

    public double kilometersToOcerview(){
        double overview;
        overview=carOverview-mileage;
        return overview;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", mileage=" + mileage +
                ", carOverview=" + carOverview +
                '}';
    }
}
