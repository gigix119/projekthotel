package podstawy.zadaniaArkusz;


public class Kalendarz {


    public static void main(String[] args) {

//        Dane są zmienne int dzien i int miesiac, które należy zainicjować bieżącą datą.
//        Napisz program liczący ile dni upłynęło od rozpoczęcia roku do tej daty.

        int dzien = 28, miesiac = 5;

        // System.out.println(miesiac * 30 - 30 + dzien);

        int[] dlugosci = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // ctrl+d
        //fori
        int suma = 0;
        for (int i = 0; i != miesiac - 1; i++) {
            suma = dlugosci[i] + suma;
            //if (i == miesiac - 2) {
            //      break;
            //    }
        }
        System.out.println(suma + dzien);
    }
}

