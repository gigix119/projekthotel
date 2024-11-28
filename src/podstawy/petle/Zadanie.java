package podstawy.petle;

import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        //liczby malejąco od 99 do 66,

        for (int i=99; i>=66; i--){
            System.out.println(i);
        }
        //wyłącznie parzyste liczby od 20 do 40,

        for (int i=20; i<40; i++){
            if ( i % 2 == 0){
                System.out.println(i);
            }
        }

//        Zadanie 2.
//        Napisz program, który wyświetla tajny komunikat.
//        Zanim wyświetli komunikat prosi o podanie hasła liczbowego (sam wymyśl jakie ma być hasło).
//        W przypadku wprowadzenia niepoprawnego hasła program pyta ponownie o liczbę tak długo dopóki użytkownik nie wpisze poprawnego hasła.
        Scanner scanner = new Scanner(System.in);
        String ala = "Ala ma kota";
        String haslo = "2115";
        String probaHasla  ;
        do{ System.out.println("Podaj liczbe :");
            probaHasla = scanner.nextLine();
        }while(!probaHasla.equals(haslo) );
        System.out.println(ala);


    }
}
