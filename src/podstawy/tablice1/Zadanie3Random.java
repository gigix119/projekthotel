package podstawy.tablice1;

import java.util.Random;
import java.util.Scanner;

public class Zadanie3Random {
    public static void main(String[] args) {
        //Zadanie 3.
        //Napisz program, który zapyta o imię i  wyświetli jego losową literę.

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jak masz na imie ? :");
        String imie = scanner.nextLine();
        int dlugosc = imie.length();
        int indekslitery = random.nextInt(dlugosc);
        char litera = imie.charAt(indekslitery);
        System.out.println(litera);




    }
}
