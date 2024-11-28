package programowanieOb.telewizor;

public class TelewizorZadanie {
    public static void main(String[] args) {
        Telewizor tv = new Telewizor();
        tv.uruchamianieTelewizora();
        tv.ogladajTelewizor();
    }
}

   /* Przygotuj obiektową wersję telewizora.
        Powinna być możliwość włączenia, wyłączenia oraz oglądania telewizora.
        Oglądając wyłączony telewizor wyświetli się napis, że napierw należy go włączyć.
        Oglądając włączony telewizor wyświetli się informacja jaki kanał jest teraz ustawiony
        Na koniec należy dodać możliwość zmieniania na poprzedni lub następny kanał która działa tylko przy włączonym telewizorze.
        Telewizor ma mieć pulę 5 kanałów
*/