package koy.podstawy;


import java.util.Arrays;

public class Tablica {
    public static void main(String[] args) {
        int tablica[] = {4,10,9,8,3,11,31,15};
        Arrays.sort(tablica);
        System.out.println(Arrays.toString(tablica));

        String strings [] = new String[5];
        Arrays.fill(strings, "Kordian");
        printArray(strings);
    }
    public static <T> void printArray(T[] arr){
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
