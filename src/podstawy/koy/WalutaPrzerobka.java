package podstawy.koy;

import java.util.Scanner;

public class WalutaPrzerobka {
    public static void main(String[] args) {
        //wybor waluty
        Scanner scanner = new Scanner(System.in);
        System.out.println("Którą walute chcesz wybrać (Dolar,Euro,Frank szwajcarski,Rubel rosyjski) : ");
        String nazawaWaluty = scanner.nextLine();
        double kurs;
       /* if (nazawaWaluty.equals("dolar")){
            kurs=3.70;
            napisać cos zeby program dalej liczbyl dla dolara
        }else{kurs=4.50;
            napisać coś zeby program liczył walte dla euro
        }*/
        // przypisanie odpowiedniego kursu
        switch(nazawaWaluty){
            case "Dolar":
                kurs=3.70;
                break;
            case "Euro":
                kurs=4.50;
                break;
            case "Frank szwajcarski":
                kurs =4.20;
                break;
            case "Rubel rosyjski":
                kurs=0.050;
                break;
            default:
                System.out.println("Nie podałeś poprawnie waluty ");
                // kurs=0;
                return;
        }

        //pytanie o kwote
        System.out.println("Wprowadz ile kwoty chcesz przeliczyc ? ");
        double waluta = scanner.nextDouble();
        //przeliczenie kursu i rezultat
        waluta = waluta * kurs;
        System.out.println("Suma po przeliczeniu waluty na złotówki " + waluta);

    }
}