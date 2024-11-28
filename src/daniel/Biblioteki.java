package daniel;

public class Biblioteki {
    public static void main(String[] args) {
        String tekst = "abcd";
        System.out.println(tekst.toUpperCase());


        int liczba = 10;

        System.out.println(Math.pow(liczba, 2));
        System.out.println(Math.random());
        double wylosowana = Math.random();
        wylosowana = wylosowana * 50 + 10;   // 10-60
        System.out.println("Liczba z zakresu 10-60?");
        System.out.println(wylosowana);
        int zakraglona = (int) wylosowana;
        System.out.println(zakraglona);

        int zaokraglona2 = (int) Math.round(wylosowana);
        System.out.println(zaokraglona2);


        String wiek = "a10abc";
       // int wiekInt = Integer.parseInt(wiek);
       // System.out.println(wiekInt *20);

        if (Character.isDigit(wiek.charAt(0))) {
            System.out.println("Pierwszy symbol to cyfra");
        }

        for (int i = 0; i < wiek.length(); i++) {
            System.out.println("Sprawdzam literę: " +wiek.charAt(i));
            if (Character.isDigit(wiek.charAt(i))) {
                System.out.println("Jest to cyfra");
            } else {
                System.out.println("Jest to litera");
            }
        }





    }
}
