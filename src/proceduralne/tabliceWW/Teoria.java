package proceduralne.tabliceWW;

import java.util.Arrays;
import java.util.Random;

public class Teoria {
    public static void main(String[] args) {
        int[][] liczby = new int[4][5];


        liczby[2][1] = 11;
        liczby[3][4] = 22;

        System.out.println(Arrays.deepToString(liczby));

        for (int y = 0; y < liczby.length; y++) {
            for (int x = 0; x < liczby[y].length; x++) {
                Random random = new Random();
//                System.out.print(liczby[y][x] + " ");
                liczby[y][x] = random.nextInt(100);
            }
            System.out.println();
        }
        System.out.println();
        for (int[] row : liczby) {
            for (int liczba : row) {
                System.out.print(liczba + " ");
            }
            System.out.println();
        }

        String[][] teksty = {
                {"abc","cde","e"},
                {"ala"},
                {"qwe","ert"}
        };

    }
}
