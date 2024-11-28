package eclipse.warunkowa;

import java.util.Scanner;

public class RTV {
    public static void main(String[] args) {
       // W sklepie ze sprzętem AGD oferowana jest sprzedaż ratalna.
                //Napisz program umożliwiający wyliczenie wysokości miesięcznej raty za zakupiony sprzęt.  Danymi wejściowymi dla programu są:
//• cena towaru (od 100 zł do 10 tys. zł),
//• liczba rat (od 6 do 48).
  //      Program powinien sprawdzać, czy podane dane mieszczą się w określonych powyżej zakresach, a w przypadku błędu wyświetlać stosowny komunikat i natychmiast zakończyć działanie programu.
    //            Kredyt jest oprocentowany w zależności od liczby rat:
 //• od 6–12 wynosi 2.5% ,
//• od 13–24 wynosi 5%,
//• od 25–48 wynosi 10%.
  //      Obliczona miesięczna rata powinna zawierać również odsetki.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cene towaru");
        int towar = scanner.nextInt();
        if (towar>100 && towar<10000){
            System.out.println("Cena podana poprawnie");
        }else{
            System.out.println("Cena podana niepoprawnie");
            return;
        }
        System.out.println("Twoja miesieczna rata");
        int rata = scanner.nextInt();
        if (rata>6 && rata<48){
            System.out.println("Poprawna rata");
        }else{
            System.out.println("Niepoprawna rata");
            return;
        }
        double oprocentowanie;

        if (rata<=12){
            oprocentowanie=0.025;
        }else if(rata<=24){
            oprocentowanie=0.05;
        }else{
            oprocentowanie=0.1;
        }
        double kwotaOdsetek=oprocentowanie*towar;
        System.out.println(kwotaOdsetek);
        double ostatecznaCena= kwotaOdsetek+towar;
        System.out.println("Twoja cena raty wynosi :" + (ostatecznaCena/rata) );






    }
}
