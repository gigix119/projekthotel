package eclipse.warunkowa;

import java.util.Random;
import java.util.Scanner;

public class Warunki {
    public static void main(String[] args) {
        //Zrób grę w zgadywanie, w której program losuje liczbę od 1 do 10, a gracz ma 2 próby aby zgadnąć liczbę.
        // W przypadku każdej odpowiedzi gracz dostaje informację zwrotną: za wysoko/za nisko/trafiona.

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int wylosowana = random.nextInt(10)+1;
        System.out.println(wylosowana);
        System.out.println("Zgadnij liczbe od 1-10");
        int pobrana = scanner.nextInt();
        if(pobrana == wylosowana){
            System.out.println("Wygrałeś");
            return;
        } else if(pobrana>wylosowana){
            System.out.println("Trafiles za wysoko");
        }else{
            System.out.println("Trafiles za nisko");
        }

        System.out.println("Zgadnij liczbe od 1-10");
         pobrana = scanner.nextInt();
        if(pobrana == wylosowana){
            System.out.println("Wygrałeś");
        } else if(pobrana>wylosowana){
            System.out.println("Trafiles za wysoko");
        }else{
            System.out.println("Trafiles za nisko");
        }










    }
}
