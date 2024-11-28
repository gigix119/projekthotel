package zadankajava;

import java.util.Arrays;
import java.util.Scanner;

public class TablicaWielo {
    public static void main(String[] args) {
        //Zadanie 1
        //Napisz program który tworzy tablicę dwuwymiarową 5x5, uzupełnia ją liczbami naturlanymi od
        //liczby podanej przez użytkownika (jako zmienna) w dół i liczy sumę wszystkich wprowadzonych
        //liczb.
        //Zadanie 2
        //Napisz program który tworzy tablicę dwuwymiarową 5x5 i uzupelnia ją kolejnymi liczbami
        //naturalnymi zaczynając od 10, wypisz przekątną takiej macierzy idacą od lewej do prawej, od
        //góry do dołu.
        //Zadanie 3
        //Napisz program który tworzy tablicę dwuwymiarową 8x8 i uzupelnia ją liczbami podzielnymi
        //przez 3 zaczynając od 10, wypisz całą macierz. Następnie wypisz macierz w ten sposób, że
        //liczby które są podzielne przez 4 wypisujemy, a jeśli nie to wstawiamy w ich miejsce liczbę -1.


        /*Scanner scanner = new Scanner(System.in);

        int[][] tablica = new int[5][5];
        int suma = 0;
        System.out.println("Podaj liczbe");
        int liczba = scanner.nextInt();
        for(int i = 0; i < tablica.length; i++){
            for (int j = 0; j < tablica.length; j++){
                tablica[i][j] = liczba;
                suma+= tablica[i][j];
                liczba--;
            }
        }
        System.out.println(Arrays.deepToString(tablica));
        System.out.println(suma);
*/

        /*int[][] tablica2 = new int [5][5];
        int liczba1 = 10;
        for(int row  = 0; row < tablica2.length; row++){
            for ( int col = 0; col < tablica2.length; col++){
                tablica2[row][col]=liczba1;
                liczba1++;
                System.out.print(tablica2[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(tablica2));
        System.out.println();

        for (int rowAndcol = 0; rowAndcol<tablica2.length; rowAndcol++){
            System.out.println(tablica2[rowAndcol][rowAndcol] + " ");
        }*/

        int[][] tablica3 = new int [8][8];
        int liczba2 = 12;
        for (int i = 0; i < tablica3.length; i++){
            for (int j = 0; j < tablica3.length; j++){
                tablica3[i][j]=liczba2;
               liczba2+=3;

               if(tablica3[i][j] % 4 ==0){
                   System.out.print(tablica3[i][j] + " ");
               }else{
                   System.out.print(-1 + " ");
               }


            }
            System.out.println();
        }


    }
}
