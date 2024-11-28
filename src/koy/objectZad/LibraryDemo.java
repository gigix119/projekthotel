package koy.objectZad;

public class LibraryDemo {
    public static void main(String[] args) {
        Libray libray = new Libray();
        PeopleWhoRent peopleWhoRent = new PeopleWhoRent();
        Rent rent = new Rent();
        TypeBook typeBook = new TypeBook();

        int[] tablica = new int[10];
        String[] tab = new  String[12];

        for (int i = 0; i < tablica.length; i++) {
            System.out.println(i + tablica.length + 2);
            for (int j = 0; j <tab.length; j++) {
                System.out.println(tab[i]);
            }
        }
    }
}
