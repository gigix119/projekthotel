package programowanieOb.biblioteka;

public class KsiazkaDemo {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Dziady","Adam Mickiewicz",200);
        Ksiazka ksiazka2 = new Ksiazka("Kordian","Juliusz Słowacki",100);
        Ksiazka ksiazka3 = new Ksiazka("Tango", "Sławomir Mrożek", 150 );
        Ksiazka ksiazka4 = new Ksiazka("Romeo i Julia", "William Shakspeare", 350);
        Ksiazka ksiazka5 = new Ksiazka();
        //System.out.println(ksiazka1);
        //System.out.println(ksiazka2);
        //ksiazka1.wypozyczKsiazke();
       // ksiazka1.zwrocKsiazke();
        //ksiazka2.zwrocKsiazke();
        //ksiazka1.zwrocKsiazke();
       /* ksiazka2.wypozyczKsiazke();
        ksiazka1.wypozyczKsiazke();*/

        int data;

        Ksiazka[] ksiazki = new Ksiazka[5];
        ksiazki[0] = ksiazka1;
        ksiazki[1] = ksiazka2;
        ksiazki[2] = ksiazka3;
        ksiazki[3] = ksiazka4;
        ksiazki[4] = ksiazka5;


        Biblioteka biblioteka1 = new Biblioteka(ksiazki);
       // System.out.println(biblioteka1);


       // biblioteka1.wyswietlKsiazki();
     //   biblioteka1.wyswietlWypozyczoneKsiazki();
       // biblioteka1.wyswietlDostepneKsiazki();
        biblioteka1.wypozyczKsiazke();

    }
}
