package proceduralne.metody;

public class Przecianie { //overloading

    public static void main(String[] args) {
        przywitaj();
        przywitaj("Marcin");
        przywitaj(10);
        String text = "ababcbc";
        int zwroconyWynik = text.lastIndexOf('b'); // ostatni indeks

        int[] tab = new int[2];

        System.out.println(zwroconyWynik);
    }


    public static void przywitaj() {
        System.out.println("Hello");
    }

    public static void przywitaj(String imie) {
        System.out.println("Hello " + imie);
    }

    public static void przywitaj(int liczba) {
        for (int i = 0; i < liczba; i++) {
            System.out.println("Hello");
        }
    }
}
