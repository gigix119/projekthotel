package podstawy.PetleFor;

public class PetleFor {
    public static void main(String[] args) {

        int[] numbers = {345, 56, 4, 34, 6565};

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number < 100)
                System.out.println(number);
        }

        //petla for-each - prosta wersja petli
        // do przegladania tablic
        // zawsze od poczatku do konca wszystkie elementy (iteracja)
        // nie pozwala na dodawania ani usuwania elementow (bez mozliwosci modyfkacji)

        //skrot do for zwyklego: fori
        //skrot do for-each: iter

        for(int number : numbers ){
            if (number < 100)
                System.out.println(number);
        }
        System.out.println( );
        for (int number : numbers){
            if (number>100)
                System.out.println(number);
        }

        //todo foreach zad 2
        //todo for zad 2
        //todo projekt loteria


        //fixme

        /**
        * */


    }
}
