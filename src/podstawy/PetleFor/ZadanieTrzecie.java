package podstawy.PetleFor;

public class ZadanieTrzecie {
    public static void main(String[] args) {
//        Zadanie 2.
//        Napisz program, który rysuje prostokąt z określonych znaków: szerokość 8 znaków, wysokość 4 wiersze, znak: “*”

        int a=6, b=15;

        for (int row=0; row<a; row++){
            for (int col=0; col<b; col++){
                System.out.print("*");
            }
            System.out.println( );
            
        }
    }
}
