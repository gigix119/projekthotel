package konwertowanie;

public class Main {

	public static void main(String[] args) {

		// W nowej klasie zadeklaruj zmienne typu int,
		// long oraz double i zainicjalizuj je dowolnymi wartoœciami liczbowymi.
		// Spróbuj wstawiæ do zmiennej typu long wartoœæ zmiennej typu int.
		// Nastêpnie spróbuj wykonaæ operacjê odwrotn¹, do zmiennej int wartoœæ zmiennej
		// long.
		// Czy obie instrukcje dzia³aj¹? Jeœli jakaœ powoduje b³¹d kompilacji, wy³¹cz j¹
		// wykorzystuj¹c komentarz liniowy.
		// Mo¿esz równie¿ przetestowaæ rzutowanie wartoœci zmiennej na inny typ.
		int a = 3;
		long b = 345345894651L;
		double c = 453.5;

		// b= a;
		a = (int) b;
		System.out.println(a);

		a = (int) c;
		System.out.println(a);

		// Zadeklaruj zmienn¹ typu byte i typu int wartoœciami 1 i 127
		// wykorzystaj castowanie aby wstawiæ do wartoœci typu byte wartoœæ zmiennej
		// int,
		// nadpisz zmienn¹ typu byte wstawiaj¹c do niej liczbê 128 i wyœwietl wynik
		// ponownie.

		int t = 127;
		byte g = 1;

		g = (byte) t;
		System.out.println(g);
		g++;
		System.out.println(g);

		// Zadeklaruj zmienn¹ typu int i typu double wartoœciami -3 i 5,55
		// wykorzystaj castowanie aby wstawiæ zawartoœæ zmiennej double do zmiennej int
		// i wyœwietl wynik,
		// ponownie wstaw zawartoœæ zmiennej double do int, tym razem dodatkowo
		// przemna¿aj¹c j¹ przez 2,5 w tej samej linijce.

		int o = -3;
		double p = 5.55;

		o = (int) p;
		System.out.println(o);

		o = (int) (p * 2.5);
		System.out.println(o);

	}

}
