package podstawy.tablicewielowymiarowejava;

public class TablicePierwszeZadanie {
    public static void main(String[] args) {

        int[][] tablica = new int[3][];
        tablica[0] = new int[3];
        tablica[1] = new int[2];
        tablica[2] = new int[1];

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                System.out.print(tablica[i][j]);
            }
            System.out.println();
        }
        System.out.println( );

        int[][] x = new int[5][5];
        for(int i=0; i<5; i++)
            for(int j=0; j<5; j++)
                x[i][j] = i*5+j;

        for(int[] wiersz: x)
            for(int element: wiersz)
                System.out.println(element);
        int wiersz = 0;
        int kolumna = 0;
        while(wiersz < x.length) {
            kolumna = 0;
            while(kolumna < x[wiersz].length) {
                System.out.println(x[wiersz][kolumna]);
                kolumna++;
            }
            wiersz++;
        }
    }

}
