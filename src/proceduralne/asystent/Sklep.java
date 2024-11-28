package proceduralne.asystent;

import java.util.Scanner;

public class Sklep {

    public static void dzialanieSklepu() {

        //przygotowanie danych
        String[] nazwy = {"Pszenica", "Żyto", "Kukurydza", "Jeczmień", "Ziemniak"};
        double[] ceny = {2.50, 3.40, 5.50, 4.60, 7.30};
        int[] ilosc = {100, 150, 300, 400, 500};

        //prezentacja towarow
        System.out.println("Dzisiaj dostepne towary to :\n");

        for (int i = 0; i < ceny.length; i++) {
            System.out.println(i + " : " + ceny[i] + "zł " + nazwy[i]);
        }
        //pobieranie numeru produktu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer");
        int produkt = scanner.nextInt();
        //sprawdzenie ilosci
        System.out.println("Mamy tyle kg tego produktu : " + ilosc[produkt]);

        //pobieranie oczekiwanej wagi + zmniejszenie wagi naszego produktu + komunikowanie rezulatu
        System.out.println("Ile chcesz zamówić kg produktu ? ");
        int zamowienie = scanner.nextInt();
        ilosc[produkt] = ilosc[produkt] - zamowienie;
        if (zamowienie > ilosc[produkt]) {
            System.out.println("Nie ma tyle kg produktu na stanie ");
            return;
        } else if (zamowienie < 0) {
            System.out.println("Za mało kg produktu " + nazwy[produkt]);
            return;
        }

        //platnosc za produkt
        System.out.println(ceny[produkt] + "Złotych za kg. \nIle płacisz? ");
        double zaplata = scanner.nextDouble();
        double lacznaCena = ceny[produkt]*zamowienie;
        if (zaplata<lacznaCena){
            System.out.println("Nie masz wystarczająco pieniędzy");
            return;
        }else{
            System.out.println("Twoja reszta to : " + (zaplata - lacznaCena ));
        }
        System.out.println("Pozostało " + ilosc[produkt] + " kg. " + nazwy[produkt]);
    }
}
