package proceduralne.asystent;

import java.util.Random;
import java.util.Scanner;

public class Loteria {
    public static void lottoGra() {

        //wprowadzanie liczb
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź 6 liczb z przedziału (1,24)");
        int[] podane = new int[6];
        int[] wylosowane = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Podaj liczbę numer " + (i + 1));
            int obstawiona = scanner.nextInt();
            if (obstawiona > 24) {
                System.out.println("Wybrałeś za duża liczbe");
                return; // Jak zrobic zeby przy podaniu zlej liczby prosil o podanie ponownie zamiast zamykac?
            } else if (obstawiona <= 0) {
                System.out.println("Wybrałeś za małą liczbe");
                return;
            }
            podane[i] = obstawiona;
        }
        //wyswietlanie zbioru
        System.out.println("Twoje liczby to ");
        for (int podana : podane) {
            System.out.print(podana + " ");
        }
        System.out.println();
        System.out.println();
        //losowanie liczb
        Random random = new Random();
        for (int i = 0; i < wylosowane.length; i++) {
            wylosowane[i] = random.nextInt(24) + 1; //jak uniknac losowania tej samej liczby ponownie?
        }
        //wyswietlanie zbioru
        System.out.println("Wylosowane liczby");
        for (int wylosowana : wylosowane) {
            System.out.print(wylosowana + " ");
        }
        System.out.println();
        //porownywanie zbiorow
        int trafienia = 0;
        for (int podana : podane) {
            for (int wylosowana : wylosowane) {
                if (podana == wylosowana) {
                    trafienia++;
                    System.out.println("Trafiłeś daną liczbe " + wylosowana);
                }
            }
        }
        System.out.println();
        System.out.println("Trafiłes tyle liczb " + trafienia);
        System.out.println();


        //wyświetlenie wyniku i nagrody:
        //        0-2 = 0zł, 3 = 16 zł
        //        4 = 200zł, 5 = 4 000 zł
        //        6 = 1 500 000 zł
        //wybieranie nagrody
        switch (trafienia) {
            case 3:
                System.out.println("Wygrałeś 16zł");
                break;
            case 4:
                System.out.println("Wygrałeś 200zł");
                break;
            case 5:
                System.out.println("Wygrałeś 4 000zł");
                break;
            case 6:
                System.out.println("Wygrałeś 1 500 000zł");
                break;
            default:
                System.out.println("Nic nie wygrałeś");
        }

    }
}
