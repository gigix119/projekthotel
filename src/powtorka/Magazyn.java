package powtorka;

import java.util.Scanner;

public class Magazyn {
    public static void main(String[] args) {


        String[] nazwy = {"Pszenica", "Żyto", "Kukurydza", "Jeczmień", "Ziemniak"};
        double[] ceny = {2.50, 3.40, 5.50, 4.60, 7.30};
        int[] ilosc = {100, 150, 300, 400, 500};

        System.out.println("Dzisiaj dostepne towary to :\n");

        for (int i = 0; i < ceny.length; i++) {
            System.out.println(i + " : " + ceny[i] + "zł " + nazwy[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer");
        int produkt = scanner.nextInt();
        System.out.println("Mamy tyle kg tego produktu : " + ilosc[produkt]);

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

        //wyświetl cenę wybranego produktu
        //zabezpiecz program przed podaniem zbyt wysokiego numeru


//                        //
//                        Pszenicy
//        Żyta
//                Kukurydzy
//        Jęczmien
//                Ziemniak
    }
}
