package proceduralne.ogrod;

import java.util.Arrays;
import java.util.Random;

public class Pies {
    private String imie;
    private String[] sztuczki;

    public Pies(String imie, String[] sztuczki) {
        this.imie = imie;
        this.sztuczki = sztuczki;
    }

    public Pies(String[] sztuczki) {
        this("Reksio", sztuczki);
    }

    public void bawSie() {
        Random random = new Random();
        int wylosowanaSztuczka = random.nextInt(4);
        System.out.println(sztuczki[wylosowanaSztuczka]);
    }

    //Konstrukcja teleskopowa

    @Override
    public String toString() {
        return "Pies{" +
                "imie='" + imie + '\'' +
                ", sztuczki=" + Arrays.toString(sztuczki) +
                '}';
    }
}
