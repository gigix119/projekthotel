package konwertowanie;

public class Main {

	public static void main(String[] args) {

		// W nowej klasie zadeklaruj zmienne typu int,
		// long oraz double i zainicjalizuj je dowolnymi warto�ciami liczbowymi.
		// Spr�buj wstawi� do zmiennej typu long warto�� zmiennej typu int.
		// Nast�pnie spr�buj wykona� operacj� odwrotn�, do zmiennej int warto�� zmiennej
		// long.
		// Czy obie instrukcje dzia�aj�? Je�li jaka� powoduje b��d kompilacji, wy��cz j�
		// wykorzystuj�c komentarz liniowy.
		// Mo�esz r�wnie� przetestowa� rzutowanie warto�ci zmiennej na inny typ.
		int a = 3;
		long b = 345345894651L;
		double c = 453.5;

		// b= a;
		a = (int) b;
		System.out.println(a);

		a = (int) c;
		System.out.println(a);

		// Zadeklaruj zmienn� typu byte i typu int warto�ciami 1 i 127
		// wykorzystaj castowanie aby wstawi� do warto�ci typu byte warto�� zmiennej
		// int,
		// nadpisz zmienn� typu byte wstawiaj�c do niej liczb� 128 i wy�wietl wynik
		// ponownie.

		int t = 127;
		byte g = 1;

		g = (byte) t;
		System.out.println(g);
		g++;
		System.out.println(g);

		// Zadeklaruj zmienn� typu int i typu double warto�ciami -3 i 5,55
		// wykorzystaj castowanie aby wstawi� zawarto�� zmiennej double do zmiennej int
		// i wy�wietl wynik,
		// ponownie wstaw zawarto�� zmiennej double do int, tym razem dodatkowo
		// przemna�aj�c j� przez 2,5 w tej samej linijce.

		int o = -3;
		double p = 5.55;

		o = (int) p;
		System.out.println(o);

		o = (int) (p * 2.5);
		System.out.println(o);

	}

}
