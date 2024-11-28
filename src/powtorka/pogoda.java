package powtorka;

import java.util.Scanner;

public class pogoda {
    public static void main(String[] args) {

        //prymitywne : int, double, char, boolean...
        //referencyjne: String, Scanner, LocalDate...
        int liczba = 10;
        int liczba2 = 10;
        String tekst = new String("abc");
        String tekst2 = new String("abc");

        System.out.println(liczba == liczba2);
        System.out.println(tekst.equals(tekst2) );



        ///I. Dana jest zmienna typu boolean czyPada zainicjowana wartością true, oraz zmienna
        ///typu boolean czySwieciSlonce zainicjowaną dowolną wartością. Napisz program
        //wykorzystujący instrukcję warunkową if i wyświetlający stany pogody jako:
//• plucha – gdy pada i nie świeci słońce,
//• tęcza – gdy pada i świeci słońce
//• słonecznie - gdy świeci słońce i nie pada,
//• pochmurno - gdy nie świeci słońce i nie pada.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy pada ?");
        String odpowiedz = scanner.nextLine();
        boolean czyPada;
        if (odpowiedz.equals("tak")){
            czyPada=true;
        }else{
            czyPada=false;
        }
        boolean czySwieciSlonce = true;
        if(czyPada&&!czySwieciSlonce){
            System.out.println("plucha");
        }else if (czyPada&&czySwieciSlonce){
            System.out.println("tęcza");
        }else if (!czyPada&&czySwieciSlonce){
            System.out.println("słonecznie");
        }else{
            System.out.println("pochmurno");
        }

//        . Utwórz program przedstawiający deklarację z inicjacją zmiennej
//                , której zostanie przypisana wartością 5 gdy czyPada jest true lub 8 w przeciwnym przypadku.

        int a;

        if(czyPada){
            a =5;
        }else {
            a =8;
        }
        System.out.println(a);


    }
}
