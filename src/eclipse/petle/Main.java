package petle;

public class Main {

	public static void main(String[] args) {

		
		int a = 5;
		System.out.println(a);
		
		// zwiekszenie inta o jakas wartosc 
		a = a + 3;
		System.out.println(a);
		
		// to samo co wyzej ale ladniej
		a +=3;
		System.out.println(a);
		
		// zwiekszenie o jeden
		a++;
		System.out.println(a);
		
		//zmniejszenie o 1
		a--;
		System.out.println(a);
		
		//petla for 
		//for (nowa zmienna iterujaca; warunek wejscia do petli; instrukcja co sie 
		// dzieje ze zmienna iterujaca po kazdym obrocie petli
		for (int i = 0; i < 10; i++) {
			System.out.print("witam ");
		}
	
		System.out.println();
		
		// petle while
		int j = 0;
		
		while (j < 10) {
			System.out.print("hejka ");
			
			j++;
		}
		
		System.out.println();
		
		// stworz petle while i for, niech wypisza jakis napis na konsoli 20 razy
		for (int i = 1; i<20; i++) {
			System.out.print(i+ "czesc ");
		}
		
		int x = 7;
		
		if( 4 < x)  {
			for(int i=4; i<=x; i++) {
				System.out.println("- " + i);
				
			}
		}else {
			System.out.println("Niepoprawna wartoœæ: " + x + " < 4");
		}
		
		
		int l = 5;
		int b = 10;
		int suma1 = 0;
		
		if(l < b) {
			
			for(int i=l; i<=b; i++) {
				
				suma1 = suma1 + i;
				if(i != l) {
					System.out.print("+");
				}
				System.out.print(i);
			}		
			System.out.println("=" + suma1);
			
		} else {
			
			System.out.println("Niepoprawne dane: b musi byc wieksze niz a.");
		}
		}
	}

	
	
	
	

