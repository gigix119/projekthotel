package programowanieOb.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerException {
    public static void main(String[] args) {
       /* int liczba;
        do {
            liczba = podajLiczbe();
        } while (liczba==-1);*/
        podajLiczbeDwa();
    }

    public static int podajLiczbe() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");

        try {
            int liczba = scanner.nextInt();
            System.out.println("Twoj liczba to " + liczba);
            return liczba;
        } catch (InputMismatchException exception) {
            System.out.println("Trzeba było podac liczbe");
            return -1;
        }
    }
    public static int podajLiczbeDwa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");

        try {
            int liczba = scanner.nextInt();
            System.out.println("Twoj liczba to " + liczba);
            return liczba;
        } catch (InputMismatchException exception) {
            System.out.println("Trzeba było podac liczbe");
            return podajLiczbeDwa();
        }
    }
}
