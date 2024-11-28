package zadankajava;

import java.util.Scanner;

public class IfyString {
    public static void main(String[] args) {
        // napisz program który pozwala podać nowe hasło do aplikacji
        //hasło musi spełniać wymogi:
        //-minimum 6 znaków
        //- nie może zawierać symboli: @, # ani $
        //-nie może zaczynać się ani kończyć znakiem spacją

        //jeśli któryś z wariantów nie został spełniony wyświetl odpowiedi komunkat, jeśli wszystko dobrze wyswiel ze haslo poprawne

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nowe hasło :");
        String haslo = scanner.nextLine();

        if(haslo.length() < 6 ){
            System.out.println("Za mało znaków ");
        }else if (haslo.contains("@" ) || haslo.contains("#") || haslo.contains("$")){
            System.out.println("Zawiera zły znak ");
        }else if (haslo.startsWith(" ") || haslo.endsWith(" ")){
            System.out.println("Nie może zaczynać się ani kończyć spacją ");
        }else{
            System.out.println("Twoje hasło jest poprawne ");
        }





    }
}
