package tablice;

public class Main {

	public static void main(String[] args) {

		// tablice
		// typTablicy[] nazwaTablicy = s�owo kluczowe new typTablicy[rozmiar];
		String[] dniTygodnia = new String[7];

		// bardzo wazne, tablice indeksujemy od 0

		// przypisanie czegos do tablicy
		dniTygodnia[0] = "Poniedzialek";
		dniTygodnia[1] = "Wtorek";
		dniTygodnia[2] = "sroda";
		dniTygodnia[3] = "Czwartek";
		dniTygodnia[4] = "Piatek";

		System.out.println(dniTygodnia[2]);

		// null to taka informacja o braku informacji
		System.out.println(dniTygodnia[5]);

		// odwo�anie sie do nieisteniajcego indeksu
		// System.out.println(dniTygodnia[10]);

		// rozmiar tablicy
		System.out.println("Rozmiar tablicy: " + dniTygodnia.length);

		// drugi spos�b deklaracji tablicy
		String[] miesiace = { "Styczen", "Luty", "Marzec", "Kwiecien", "Maj" };

		// wypisanie ca�ej tablicy

		// tak nie wypiszemy tablicy, tylko adres obiektu w pamieci komputera
		System.out.println(miesiace);

		// zeby wypisac tablice musimy uzyc petli
		for (int i = 0; i < miesiace.length; i++) {
			System.out.print(miesiace[i] + " ");
		}

		System.out.println();
		// Zadeklaruj tablice int�w dwoma sposobami, przypisz do nich wartosci, wypisz
		// ich dlugosc i niektore elementy

		int[] liczby = new int[5];
		liczby[1] = 4;
		liczby[2] = 3;
		liczby[3] = 2;
		liczby[4] = 1;
		System.out.println(liczby[3]);

		System.out.println("rozmiar tablicy: " + liczby.length);

		int[] cyfry = { 8, 1, 4, 10, 5, -3, 11, 2 };

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
		System.out.println();
		for (int i = 0; i < cyfry.length; i++) {
			if (cyfry[i] % 2 == 0) {
				System.out.print(cyfry[i] + " ");
			}
		}
		int suma = 0;
		for (int i = 0; i < cyfry.length; i++) {
			suma = suma + cyfry[i];
		}
		System.out.println();
		System.out.println(suma);

		int najwieksza = -100;
		for (int i = 0; i < cyfry.length; i++) {
			if (cyfry[i] > najwieksza) {
				najwieksza = cyfry[i];  
			}
		}
		System.out.println(najwieksza + " ");
		int najmniejsza = 100;
		for (int i = 0; i < cyfry.length; i++) {
			if (cyfry[i] < najmniejsza) {
				najmniejsza = cyfry[i];
			}
		}
		System.out.println(najmniejsza + " ");

	}

}