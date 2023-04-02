package proceduralne.bubbleSort;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] liczby= {100,9,8,7,5,6,7,4,32,1,37};
//        int[] liczby= {1,3,3,5,6,4,8,7};
//        int[] liczby= {1,2,3,5,6,4,8,7};

        /*for (int i = 0; i <liczby.length-1; i++) {
            if (liczby[i]>liczby[i+1]){
                //zapamietac co jest na pozycji i+1
                int liczba = liczby[i+1];
                liczby[i+1]=liczby[i];
                liczby[i]=liczba;  // odtworzyc zapamietana liczbe ktora znajdowala sie na i + 1
            }
        }*/

        for (int j = 0; j < liczby.length ; j++) {
            for (int i = 0; i <liczby.length-1 - j; i++) {
                if (liczby[i]>liczby[i+1]){
                    //zapamietac co jest na pozycji i+1
                    int liczba = liczby[i+1];
                    liczby[i+1]=liczby[i];
                    liczby[i]=liczba;  // odtworzyc zapamietana liczbe ktora znajdowala sie na i + 1
                }
            }
        }
        System.out.println(Arrays.toString(liczby));
    }
}
// select sort (wybór)
// insert sort (wstawienie)
