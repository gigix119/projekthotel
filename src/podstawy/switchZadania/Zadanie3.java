package podstawy.switchZadania;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
//        Zadanie 3.
//Program ma pobierać miesiąc oraz dzień urodzin użytkownika w formie liczbowej. Na tej podstawie ma powiedzieć jaka jest to pora roku.

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Wprowadź czas urodzin :");
        System.out.println("Podaj miesiac :");
        int miesiac = scanner.nextInt();
        System.out.println("Podaj dzien :");
        int dzien = scanner.nextInt();
        switch (miesiac){
            case 1:
            case 2:
                System.out.println("Zima");
                break;
            case 3:
                if (dzien<21){
                    System.out.println("Zima");
                }else{
                    System.out.println("Wiosna");
                }
                break;
            case 4:
            case 5:
                System.out.println("Wiosna");
                break;
            case 6:
                if (dzien<21){
                    System.out.println("Wiosna");
                }else{
                    System.out.println("Lato");
                }
                break;
            case 7:
            case 8:
                System.out.println("Lato");
                break;
            case 9:
                if (dzien<22){
                    System.out.println("Lato");
                }else{
                    System.out.println("Jesień");
                }
                break;
            case 10:
            case 11:
                System.out.println("Jesień");
                break;
            case 12:
                if (dzien<21){
                    System.out.println("Jesień");
                }else{
                    System.out.println("Zima");
                }





        }



    }
}
