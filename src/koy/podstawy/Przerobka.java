package koy.podstawy;

import java.util.Scanner;

public class Przerobka {
    public static void main(String[] args) {
        double firstNumber;
        int secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbe zeby sprawdzic ile wynosi z niej pierwiastek");
        firstNumber = scanner.nextDouble();
        System.out.println("Podaj o ile chcesz podniesc do potegi pierwsza liczbe");
        secondNumber = scanner.nextInt();
        double sqrt = Math.sqrt(firstNumber);
        double power = Math.pow(firstNumber, secondNumber);


        System.out.println("Pierwiastek z " + firstNumber + " wynosi: " + sqrt);
        System.out.println("Liczba " + firstNumber + " podniesiona do potegi " + secondNumber + " to " + power);


    }
}
