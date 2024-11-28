package podstawy.petle;

import java.util.Scanner;

public class Zadania1 {
    public static void main(String[] args) {
//        Zadanie 4.
//Napisz program, który wczytuje liczby podawane przez użytkownika dotąd, dopóki nie podana zostanie liczba 0.
// Następnie wyświetla sumę wszystkich podanych liczb. Zastosuj pętlę do-while.
        Scanner scanner = new Scanner(System.in);
        int liczba = 0;
        int suma = 0;
        do { System.out.println("Podaj liczbe :");
            liczba = scanner.nextInt();
            suma+=liczba;
        }while (liczba != 0);
        System.out.println(" Suma " + suma);
    }
}
