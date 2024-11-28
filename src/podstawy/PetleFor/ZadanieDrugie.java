package podstawy.PetleFor;

import java.util.Arrays;
import java.util.Random;

public class ZadanieDrugie {
    public static void main(String[] args) {
//        Zadanie 2.
//        Wylosuj 500 000 liczb od 1 do 100 za pomocą pętli for i zapisz je w tablicy.
//        Następnie wykorzystaj pętlę for each, aby przejrzeć wylosowane liczby i policzyć ile razy wystąpiła liczba 25.

        Integer asd =3;
        Random random = new Random();
        int[] liczby = new int[50000];

        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = random.nextInt(99) + 1;
        }
        System.out.println(Arrays.toString(liczby));

        int licznik = 0;

        for (int liczba : liczby) {
            if (liczba == 25)
                licznik++;
        }
        System.out.println(licznik);

    }
}
