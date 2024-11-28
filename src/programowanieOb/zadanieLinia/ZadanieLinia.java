package programowanieOb.zadanieLinia;

public class ZadanieLinia {
    public static void main(String[] args) {
        Linia linia1 = new Linia(5,'*');
        Linia linia2 = new Linia(8,'*');
        Linia linia3 = new Linia(3,'*');

       /* linia1.dlugosc=5;
        linia2.dlugosc=8;
        linia3.dlugosc=3;*/

        /*linia1.wypelnienie='*';
        linia2.wypelnienie='-';
        linia3.wypelnienie='/';
*/
        linia1.drukujLinie();
        linia2.drukujLinie();
        linia3.drukujLinie();
    }
}


   /* Stwórz obiekt Linia, który powinien mieć dwie cechy: "długość" i "wypełnienie". Następnie stwórz metodę void drukujLinie()
   , która przy ustawionej długości 6 i wypełnieniu "@" wydrukuje następującą linię:
@@@@@@
    Zaś przy długości 20 i  wypełnieniu "*" powinna wydrukować linię
           ********************
        W klasie LiniaDemo stwórz trzy różne linie o różnych długościach i różnych wypełnieniach oraz wydrukuj je.
*/
