package zadankajava;

import java.util.Scanner;

public class ZadanieInstrukcja {
    public static void main(String[] args) {
        //Napisz program, który pobierze liczbę reprezentującą wiek użytkownika w latach (liczba całkowita),
        // a następnie wyświetli czy jest on pełnoletni czy nie.





        // shift +f6
        // ctrl + z
        // ctrl + alt +l



            //Zadanie 2.
        //Napisz program który pobierze od użytkownika liczbę całkowitą i:
        //wyświetli informację czy jest ona dodatnia, ujemna czy równa zero,
        //wyświetli informację czy jest ona parzysta czy nieparzysta.

        Scanner scannner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą :");
        int calkowita = scannner.nextInt();

        if(calkowita>0){
            System.out.println("Całkowita jest dodatnia" );

        }else if (calkowita==0){
            System.out.println("Całkowita jest równa zero " );
        }else{
            System.out.println("Całkowita jest ujemna");
        }

        if(calkowita % 2 ==0){
            System.out.println("Całkowita jest parzysta "  );
        }else {
            System.out.println("Całkowita jest nieparzysta " );
        }



    }
}
