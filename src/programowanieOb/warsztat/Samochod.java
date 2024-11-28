package programowanieOb.warsztat;

import java.util.Arrays;
import java.util.Random;

public class Samochod {

    private Kolo[] kola;

    public Samochod(Kolo[] kola) {
        this.kola = kola;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "kola=" + Arrays.toString(kola) +
                '}';
    }

    public void zlapGume(){
        Random random=new Random();
        int wylosowana =random.nextInt(kola.length);
        kola[wylosowana].przebij();
    }

    public Kolo[] getKola() {
        return kola;
    }
}
