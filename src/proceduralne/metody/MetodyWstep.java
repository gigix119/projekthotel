package proceduralne.metody;

import java.util.Random;

public class MetodyWstep {
    public static void main(String[] args) {
//       int liczba = wylosujLiczbe();
//        System.out.println(liczba);

        System.out.println("Gracz ma: " +  zwrocLiczbe());


        int gracz1 = zwrocLiczbe();
        int gracz2 = zwrocLiczbe();

//        System.out.println("Start");
//        mojaMetoda();
//        System.out.println("Koniec");

    }


    public static int zwrocLiczbe(){

        int punktyGracza = 10;
        return punktyGracza;
    }

    public static int wylosujLiczbe() {
        Random r = new Random();
      int  wylosowana = r.nextInt(5);
        if (wylosowana > 2) {
            return 1;
        } else {
            return 0;
        }
    }








    public static void mojaMetoda (){
       System.out.println("Hejka");
        kolejanMetoda();

      pozdrow("Michał", "Nowak");
        pozdrow("Szymon", "Nowak");
        pozdrow("Andrzej", "Kowalski");
        int suma1=suma(1,2);
        int suma2=suma(2,3);
       int przyjeta = zwrocLiczbe();
        System.out.println(przyjeta);
        int suma3 = suma(suma1,suma2);
        System.out.println(suma3);

    }
    public  static  void kolejanMetoda (){
        System.out.println("Ala ma kota");
        System.out.println("Andrzej Duda");
    }
    public static void pozdrow (String imie, String nazwisko ){
        System.out.println("Pozdrawiam Cię : " + imie + " " + nazwisko);
    }

    public static int suma (int liczba1, int liczba2){
        int suma = liczba1+liczba2;
        return suma;
    }


}
