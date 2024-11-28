package podstawy;

import java.util.Scanner;

public class Scannertest {
    public static void main(String[] args) {
        /*Zadanie 1.
        Napisz program który: pobierze imię, nazwisko i wiek,
        następnie przywita użytkownika oraz poinformuje
        komunikatem true/false czy użytkownik jest pełnoletni.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Jak masz na imię i nazwisko?");
        String imienazwisko = scanner.nextLine();
        System.out.println(" A teraz podaj wiek ");
        int wiek = scanner.nextInt();
        if (wiek>=18){
            System.out.println("Jesteś pełnoletni ");
        }else{
            System.out.println("Jesteś niepełnoletni");
        }




    }
}
