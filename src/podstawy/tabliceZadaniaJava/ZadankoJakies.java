package podstawy.tabliceZadaniaJava;

public class ZadankoJakies {
    public static void main(String[] args) {
        double first = 9.0;
        int second = 3;
        double sqrt = Math.sqrt(first); //pierwiastek kwadratowy
        double power = Math.pow(first, second); //9 do potęgi 3

        System.out.println("Pierwiastek z " + first + " wynosi: " + sqrt);
        System.out.println("Liczba " + first + " podniesiona do potegi " + second + " to " + power);

    }
}
