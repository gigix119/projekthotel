package programowanieOb.dystrybutor;

import java.util.Random;
import java.util.Scanner;

public class Dystrybutor {
    private double cenaPaliwo;
    private  int litry;

    public Dystrybutor(double nowaCenaPaliwa, int noweLitry){
        cenaPaliwo=nowaCenaPaliwa;
        litry=noweLitry;
    }

    public void nalejPaliwa() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        String odpowiedz;
        int paliwoWsamochodzie = 0;

        do {
            System.out.println("Czy chcesz kontynuować dalej nalewanie paliwa?");
            odpowiedz = scanner.nextLine();

            if (odpowiedz.equals("tak")) {
                paliwoWsamochodzie += random.nextInt(5) + 1;
                System.out.println("nalałeś litrów paliwa :" + paliwoWsamochodzie);
            }
            //todo zatrzymaj tankowanie gdy zapełnisz bak (pojemność 50 litrów)

        } while (odpowiedz.equals("tak"));
        System.out.println(paliwoWsamochodzie);
        System.out.println(cenaPaliwo);
       double lacznacena= cenaPaliwo * paliwoWsamochodzie;
        System.out.printf("Za paliwo zapłaciłeś :%.2f złotych\n" ,lacznacena);
    }
}
