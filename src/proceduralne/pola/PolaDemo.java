package proceduralne.pola;

import proceduralne.metodyZadania.DrugieZadanie;

public class PolaDemo {

   static int liczba2; // pole (zmienna dla klasy)
    // pola uzupelniaja sie domyslnymi wartosciami jesli nic nie przypiszemy
    static boolean poleString;


    public static void main(String[] args) {
        System.out.println(poleString);
        int liczba = 10; // zmienna lokalna
        DrugieZadanie.wyswietlLiczby(2,4); // dostęp do metod z innych klas jest możliwy przez nazwe klasy
        przywitaj(liczba2);
        System.out.println(liczba);
        System.out.println(liczba2);
        przywitaj();
    }

    public static void przywitaj(int ileRazy){
        for (int i = 0; i < ileRazy; i++) {
            System.out.println("Hello");
        }
        System.out.println();
    }

    public static void przywitaj(){
       int liczba2 = 2; // zmienna lokalna nazwana jak pole, zasłania to pole
        for (int i = 0; i <  PolaDemo.liczba2 ; i++) { // odnoszac sie przez nazwe klasy, wywołuje pole, mimo że może zasłać mi je zmienna lokalna
            System.out.println("Hello");
        }
        System.out.println();

    }
}
