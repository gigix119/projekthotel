package koy.podstawy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ZadanieJava {
    public static void main(String[] args) {
        /*
        * Napisz program, który wyświetli komunikat: “Jutro będzie padać na X%!”
Gdzie “X” jest losową liczbą z przedziału od 0 do 100 generowaną na nowo przy każdym uruchomieniu programu.
*/
        Random random = new Random();
       /* int losowa=random.nextInt(100);
        System.out.println("Jutro bedzie padac na " + losowa + "%");*/
        
        
        
        /*
        * Zadanie 1. 
Napisz program który: pobierze imię, nazwisko i wiek, następnie przywita użytkownika oraz poinformuje komunikatem true/false czy użytkownik jest pełnoletni. 
*/

  /*Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imie i ile masz lat ?");
        String dane = scanner.nextLine();
        System.out.println("A teraz podaj swoj wiek");
        int wiek = scanner.nextInt();
        if (wiek>=18){
            System.out.println("jestes pelnoletni");
        }else{
            System.out.println("jestes niepeloletni");
        }
*/



        /*
        * Napisz program, który rysuje prostokąt z określonych znaków: szerokość 8 znaków, wysokość 4 wiersze, znak: “*”
        * */

        int szer = 8;

        int wys = 4;


        for (int i = 0; i < wys; i++)

        {

            for (int j = 0; j < szer; j++)

                if((i == 0)||(i == wys-1))

                    System.out.print('*');

                else

                if((j == 0)||(j == szer-1))System.out.print('*');

                else System.out.print(' ');

            System.out.println();

        }


        for (int i = 0; i < 10; i++) {
            if (i % 3 ==0){
                System.out.println(i);
            }
        }


    }
}
