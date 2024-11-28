package podstawy.tablice1;

public class main {
    public static void main(String[] args) {

        //tablice
        //typ tablicy[] nazwaTablicy = slowo kluczowe ,,new'' typTablicy[rozmiar]
        String[] dniTygodnia = new String[7];

        //bardzo wazne, tablcie indeksujemy od 0

        //przypisnanie czegos do tablicy
        dniTygodnia[0] = "Poniedzailek";
        dniTygodnia[1] = "Wtorek";
        dniTygodnia[2] = "Sroda";
        dniTygodnia[3] = "Czwartek";
        dniTygodnia[4] = "Piatek";

        System.out.println(dniTygodnia[0]);

        //null to taka informacja o braku informacji
        System.out.println(dniTygodnia[5]);

        //odwolanie sie do nieistniejacego indeksu
        //System.out.println(dniTygodnia[10]);

        //rozmiar tablicy
        System.out.println("Rozmiar tablicy: " + dniTygodnia.length);

        //drugi sposob deklaracji tablciy
        String[] miesiace = {"Styczen", "Luty", "Marzec", "Kwiecien", "Maj"};

        //wypisanie calej tablicy
        //tak nie wypiszemy calej tablicy
        System.out.println(miesiace);

        //zeby wypisac tablice musimy uzyc petli
        for (int i = 0; i < miesiace.length; i++) {
            System.out.print(miesiace[i] + " ");
        }
        System.out.println();
        // Zadeklaruj tablice intow dwoma sposobami, przypisz do nich wartosci, wypisz
        // ich dlugosc i niektore elementy

        int[] liczby = new int[5];
        liczby[1] = 4;
        liczby[2] = 3;
        liczby[3] = 2;
        liczby[4] = 1;
        System.out.println(liczby[3]);

        System.out.println("rozmiar tablicy: " + liczby.length);

        int[] cyfry = {8, 1, 4, 10, 5, -3, 11, 2};

        for (int i = 0; i < cyfry.length; i++) {
            System.out.print(cyfry[i] + " ");
        }
        // wyswietl tylko liczby wieksze niz 4
        // policz sume element�w tablicy
        // znajdz element najwiekszy
        // znajdz element najmniejszy
        System.out.println();

        for (int i = 0; i < cyfry.length; i++) {
            if (cyfry[i] > 4) {
                System.out.print(cyfry[i] + " ");
            }

        }

        for (int i = 0; i < cyfry.length; i++) {
            if (cyfry[i] > 4) {
                System.out.print(cyfry[i] + " ");
            }

        }

        for (int i = 0; i < cyfry.length; i++) {
            if (cyfry[i]> cyfry.length){
                System.out.println(cyfry[i] + " ");
            }
        }

    }
}
