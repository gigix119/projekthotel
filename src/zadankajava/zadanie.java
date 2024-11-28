package zadankajava;

import java.util.Scanner;

public class zadanie {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Podaj liczbe :");
        String word = x.nextLine();
        byte [] wordbytearray = word.getBytes();
        byte [] result = new byte [wordbytearray.length];
        for ( int i=0; i< wordbytearray.length; i++){
            result[i] = wordbytearray[wordbytearray.length - i - 1];
        }
        System.out.println( new String(result));
    }
}
