package podstawy.zadaniaDodatkowe;

public class zadanieGwiazdka {
    public static void main(String[] args) {
        //
        //VI. Napisz program, który wykorzystując pętle utworzy szachownicę składający się z literałów reprezentujących gwiazdkę (*) i spację:




        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 9; i++) {
                if ((i+j)%2==1 ){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println( );
        }


    }
}
