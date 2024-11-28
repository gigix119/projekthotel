package eclipse.tablice;

import java.util.Random;

public class TabliceWW {
    public static void main(String[] args) {

        System.out.println(Math.min(5,8));



        int[] liczby = new int[5];
        int[] liczby2 = {23, 45, 567, 345};

        int[][] tablicaWW = new int[2][3]; // 2 tablice intow po 3 liczb

        String[][] litery =  { // tablica poszarpana
                { "a", "b", "c"  },
                {"d", "e"},
                {"f"}
        };

       for (int row=0; row<litery.length; row++){
           for (int col=0; col< litery[row].length; col++){
               System.out.print(litery[row][col]);
           }
           System.out.println();
       }

//        0,0,0
//        0,0,0
//
        liczby[0] = 10;

        tablicaWW[1][1] = 20;
//        20,0,0
//        0,0,0
        tablicaWW[0] = liczby2;


        for (int[] tab1w : tablicaWW) {
            for (int liczba : tab1w) {
                System.out.print(liczba + " ");
            }
            System.out.println();
        }

        int[][] tablica3 = new int[25][10];
        tablica3[5][6] = 6;
        Random losowa = new Random();
        for ( int row=0; row<tablica3.length; row++){
            for (int col=0;  col<tablica3[row].length; col++){
                tablica3[row][col] = losowa.nextInt(10);
                System.out.print(tablica3[row][col] + " ");
            }
            System.out.println();
        }

//        System.out.println(tablica3[24][24]);
        System.out.println();

        for ( int col=0; col<tablica3[2].length; col++){
            System.out.print(tablica3[2][col] + " ");
        }
        System.out.println();
        for (int row=0; row<tablica3.length; row++){
            System.out.print(tablica3[row][1] + " ");
        }
        System.out.println();
        for (int rowAndCol=0;     rowAndCol< Math.min(tablica3.length, tablica3[0].length)  ; rowAndCol++){
            System.out.print(tablica3[rowAndCol][rowAndCol] + " ");
        }









    }
}
