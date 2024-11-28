package proceduralne.metodyCwiczenia;

import java.util.Arrays;

public class MetodyZadanieK {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayOfMultiples2(7,5)));
        System.out.println(Arrays.toString(arrayOfMultiples2(12,10)));
        System.out.println(Arrays.toString(arrayOfMultiples2(17,6)));
    }
    public static int[] arrayOfMultiples(int num, int length){
        int [] liczby= new int[length];
        for (int i = 0; i <liczby.length ; i++) {
            liczby[i]=num*(i+1);
        }
     return    liczby;
    }

    public static int[] arrayOfMultiples2(int num, int length){
        int [] liczby= new int[length];
        int doWstawienia = num;
        for (int i = 0; i <liczby.length ; i++) {
            liczby[i]= doWstawienia;
            doWstawienia += num;
        }
        return    liczby;
    }
}



    /*arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]

        arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]

        arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]
*/