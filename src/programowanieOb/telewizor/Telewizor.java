package programowanieOb.telewizor;

import java.util.Scanner;

public class Telewizor {
    public static String[] kanaly = {"jedynka", "polsat", "tvn", "hbo", "dwojka"};
    private String kanal;
    private boolean uruchamianie = false;


    public void uruchamianieTelewizora() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy chcesz włączyć telewizor ?");
        String odpowiedz = scanner.nextLine();

        if (odpowiedz.equals("tak")) {
            uruchamianie = true;
            kanal = kanaly[0];
            System.out.println("Włączasz telewizor");
        } else {
            uruchamianie = false;
            System.out.println("Wyłączasz telewizor");
        }
    }

    public void ogladajTelewizor() {

        if (uruchamianie) {
            System.out.println("oglądasz teraz :" + kanal);
        } else {
            System.out.println("Musisz najpierw wlaczyc telewizor");
        }
    }

    public void zmienkanal(String nowykanal) {
        if (uruchamianie) {
            kanal = nowykanal;
            System.out.println("Zmieniłes kanal na : " + kanal);
        } else {
            System.out.println("Nie mozesz zmienic knalau");
        }
//    public void wybierzKanal() {
//        if (uruchamianie) {
//            System.out.println("Czy chcesz zmienic kanal do przodu, czy do tylu ?");
//            Scanner scanner = new Scanner(System.in);
//            String odpowiedz = scanner.nextLine();
//            if (odpowiedz.equals("do przodu")){

    }
}




/* Przygotuj obiektową wersję telewizora.
        Powinna być możliwość włączenia, wyłączenia oraz oglądania telewizora.
        Oglądając wyłączony telewizor wyświetli się napis, że napierw należy go włączyć.
        Oglądając włączony telewizor wyświetli się informacja jaki kanał jest teraz ustawiony
        Na koniec należy dodać możliwość zmieniania na poprzedni lub następny kanał która działa tylko przy włączonym telewizorze.
        Telewizor ma mieć pulę 5 kanałów
*/