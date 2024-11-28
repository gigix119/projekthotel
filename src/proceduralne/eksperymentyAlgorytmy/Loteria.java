package proceduralne.eksperymentyAlgorytmy;

import java.util.Arrays;
import java.util.Random;

public class Loteria {
    public static void main(String[] args) {
        int obstawiane [] = {6,25,17,16,19,10,26,30,27,3,5};
        System.out.println(Arrays.toString(obstawiane));
        //System.out.println(wylosujNieWystepujacaWZbiorze(obstawiane));


        int[] testValues = new int[15];
        for (int i = 0; i < testValues.length; i++) {
            testValues[i] = wylosujNieWystepujacaWZbiorze(obstawiane);
        }

        System.out.println(Arrays.toString(testValues));

        System.out.println(Arrays.toString(obstawiane));
    }

    public static int wylosujNieWystepujacaWZbiorze(int[] liczby){
        Random random = new Random();
        int wylosowa = random.nextInt(20);
        for (int i = 0; i < liczby.length; i++) {
          if (wylosowa == liczby[i]){
             return wylosujNieWystepujacaWZbiorze(liczby);
          }
        }
        return wylosowa;
    }
}