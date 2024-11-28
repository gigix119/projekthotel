package podstawy.switchZadania;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
//        Zadanie 1.
//Tworzysz program, który pozwala poruszać się po wirtualnym świecie w każdej z 4 stron świata. Zapytaj użytkownika w którą stronę chce się udać. Może napisać:
//-północ
//-południe
//-wschód
//-zachód
//
//Zastosuj instrukcję warunkową switch aby, w zależności którą stronę wybrał, wyświetlić mu inny komunikat.
// Np. “Wyruszyłeś do stolicy przez las na wschodzie, po drodze zostałeś napadnięty przez bandytów, rozpoczyna się walka!”
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój kierunek :");
        String kierunek = scanner.nextLine();
        switch(kierunek){
            case "północ":
                System.out.println("N");
                break;
            case "południe":
                System.out.println("S");
                break;
            case "wschód":
                System.out.println("E");
                break;
            case "zachód":
                System.out.println("W");
                break;
            default:
                System.out.println("Niepoprawny kierunek");



        }



    }
}
