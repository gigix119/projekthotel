package zadankajava;

import java.util.Random;
import java.util.Scanner;

public class LosowanieIfy {
    public static void main(String[] args) {
        //rzut kostką 1-6

        //1 -> zwykle pole, nic sie nie stalo
        //2 -> zwykle pole, nic sie nie stalo
        //3 -> zwykle pole, nic sie nie stalo
        //4 -> dostajesz + 10 pkt
        //5 -> zwykle pole, nic sie nie stalo
        //6 -> wygrałeś


        //Wpisz 'start' aby rzucic kostka
        //start
        //wyrzuciles 6
        //wygrałeś!

        //Wpisz 'start' aby rzucic kostka
        //start
        //wyrzuciles 2
        //Trafiłeś na zwykle pole, nic sie nie stalo

        //Wpisz 'start' aby rzucic kostka
        //nie wpisze...wwwwwwwwwww
        //nie wpisujesz start to nie gramy..

        /*switch (wylosowana){
            case 1:
                System.out.println("cos");
                brek;
                case 2:
                System.out.println("cos innego");
                brek;
        }*/

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz start aby rzucic kostka ");
        String tekst = scanner.nextLine();
        if(!tekst.equals("start")){
            return;
        }
            //losowanie

        int wylosowana = random.nextInt(6)+1;
        System.out.println("Wyrzuciłeś taka liczbe na liczbe na kostce :" + wylosowana);

        switch(wylosowana){
            case 1:
            case 2:
            case 3:
            case 5:
            System.out.println("zwykle pole, nic sie nie stalo");
            break;
            case 4:
            System.out.println("dostajesz + 10pkt");
            break;
            case 6:
            System.out.println("wygrałeś");
            break;

        }


    }
}
