package proceduralne.graKarciana;

import java.util.Random;
import java.util.Scanner;

public class Pig {
    public static void main(String[] args) {
        //rzucasz kostka i po kazdym rzucie program pyta czy kontynuować
        //jesli powiesz ze nie, wyswietla ile dostales punktow

        //wyswietlamy ile wyrzucil w danej kolejce
        //jesli wyrzucil 1 nie zdobywa zadnych punktow

        //po zakonczeniu rzucania (przez powiedzenie nie lub przez wyrzucenie jedynki) przechodzimy do drugiego gracza
        int punktyGracza1 = 0;
        int punktyGracza2 = 0;

        punktyGracza1 += zagrajTure();
        System.out.println();
        System.out.println("Gre zaczyna gracz drugi");
        punktyGracza2 += zagrajTure();

        System.out.println("Pierwszy gracz ma :" + punktyGracza1);
        System.out.println("Drugi gracz ma :" + punktyGracza2);


    }

    public static int zagrajTure() {
        int punktyGracza = 0;
        String wybor;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        do {
            int wylosowana = random.nextInt(6) + 1;
            punktyGracza += wylosowana;
            System.out.println("Wylosowałem: " + wylosowana);
            if (wylosowana == 1) {
                System.out.println("Przerywa gre wyrzuciles jeden ");
                punktyGracza = 0;
                break;
            }
            System.out.println("Masz tyle punktow " + punktyGracza);
            System.out.println("Czy chcesz grac dalej?");
            wybor = scanner.nextLine();
        }
        while (wybor.equals("tak"));
        System.out.println("Zdobyłeś :" + punktyGracza);
        return punktyGracza;
    }
}
