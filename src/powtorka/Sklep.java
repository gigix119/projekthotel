package powtorka;

import java.util.Scanner;

public class Sklep {
    public static void main(String[] args) {
        //ile mamy kg pszenicy
        //ile mamy zamowic
        //ile zostalo
        int stan = 500;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dostępne jest " + stan + " kg : \nPszenicy \nŻyta \nKukurydzy \nJęczmien \nZiemniak \nIle chcesz zamówić kg produktu ? ");
        int zamowienie = scanner.nextInt();
        stan = stan - zamowienie;
        if (zamowienie>stan){
            System.out.println("Nie ma tyle kg pszenicy na stanie ");
            return;
        }else if (zamowienie<0){
            System.out.println("Za mało kg pszenicy ");
            return;
        }
        System.out.println("Cena za kg = 2.50. \nIle płacisz? ");
        double zaplata = scanner.nextDouble();
        double lacznaCena = 2.50*zamowienie;
        if (zaplata<lacznaCena){
            System.out.println("Nie masz wystarczająco pieniędzy");
            return;
        }else{
            System.out.println("Twoja reszta to : " + (zaplata - lacznaCena ));
        }
        System.out.println("Pozostało " + stan + " kg pszenicy. ");
    }
}

//dodać cene za kg i mozliwosc podania kwoty ktora placisz
//program ma sprawdzac czy podałeś poprawną kwote


//przyklad dzialania:
//ile chcesz zamowic kg pszenicy, cena za kg to 2,3zl?
//2
//ile placisz?
//4
//zaplaciles za malo, zabraklo 0,6 zl


//dodać 5 róznych rodzajow towarow
//wybor jednego z nich
//kazdy ma jakis inny stan
//program drukuje stan wszystkich 5 towarow po zakupie
// tablice + petle się przydadza




