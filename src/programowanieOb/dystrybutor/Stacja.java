package programowanieOb.dystrybutor;

public class Stacja {
    public static void main(String[] args) {
        Dystrybutor dystrybutor1 = new Dystrybutor(5.30,2000);
        /*dystrybutor1.cenaPaliwo = 5.1234;
        dystrybutor1.litry = 1000;*/
        dystrybutor1.nalejPaliwa();
        dystrybutor1.nalejPaliwa();


        //formatowanie String
        int liczba1 = 10;
        String tekst = "hello";
        double cena = 19.999999998;
        System.out.printf("Ilosc produktu: %d nazwa zamowienia %s  cena zamowienia %.2f\n",liczba1,tekst,cena);
        //dla calkwoitych : %d
        //dla zmiennoprzecinkowych: %f
        //dla stringow : %s
    }

}


    /*zadanie dystrybutor -> przygotuj obiekt Dystrybutor z metodą "nalejPaliwa" dystrybutor ma określoną cenę za litr oraz ilość litrów.
        W metodzie nalewającej paliwo wykorzystaj scanner do komunikacji z użytrkownikiem i pytaj się go "czy nalewa dalej" za każdym razem nalewaj od 1 do 5 litrów paliwa.
         po wtarzaj tak długo dopóki użytkownik nie zdecyduje się przestać tankować lub zapełni się bak (50 litrów)
        na koniec wyświetl nalaną ilość paliwa oraz cenę łączną do zapłaty*/
