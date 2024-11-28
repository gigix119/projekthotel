package proceduralne.metodyZadania;

public class DrugieZadanie {
    public static void main(String[] args) {
        wyswietlLiczby(3, 7);
        wyswietlLiczby(1, 4); // 1,2,3,4
        System.out.println("Dzisiaj jest: " + zwrocDate(2021,2,2));  //  "Dzisiaj jest: 2021-02-02"
    }

    public static void wyswietlLiczby(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static String zwrocDate(int rok, int miesiac, int dzien) {
        String miesiacTekst = "";
        if (miesiac<10){
            miesiacTekst += "0";
        }
        miesiacTekst += miesiac;
        String dzienTekst = "";
        if (dzien<10){
            dzienTekst+= "0";
        }
        dzienTekst += dzien;
       return  rok + "-" + miesiacTekst + "-" + dzienTekst;
    }


    public static String zwrocDate2(int rok, int miesiac, int dzien) {
        String data = "";
        data += rok;
        data += "-";
        if (miesiac < 10) {
            data += "0";
        }
        data += miesiac;
        data += "-";
        if (dzien < 10) {
            data += 0;
        }
        data += dzien;
        return data ;
    }



}

// wyswietlLiczby(3,7) -> 3,4,5,6,7 (wyswietlone)
// zwrocDate(2021,2,2) -> "2021-02-02"


/*void wyswietlLiczby(int, int) - metoda wyświetla liczby od wybranej wartości do wybrane
String zwrocDate(int, int, int) - metoda przyjmuje trzy liczby i zwraca datę jako tekst. */

