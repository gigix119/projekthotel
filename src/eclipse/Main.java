package eclipse;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//Napisz program drukujacy na ekranie prostokat z literek X. Wysokosc i szerokosc prostokata
		//wczytujemy z klawiatury.
		//Dla szerokosci = 10 oraz wysokosci = 4 tak powinien wygladac prostokat:
		
		//while   do while    for    for each
		//do pewnego momentu (nie wiadomo ile razy ) -> while
		//je�li znamy konkretna ilo�� wykona� lub potrzebujemy liczyc wykonania petli -> for
		
		
		
		int liczba = 101;
		
		if(liczba > 0) {
		  System.out.println("dodatnia");
		}else if (liczba == 0) {
			System.out.println("zero");
		}else {
			 System.out.println("ujemna");
		}
		
		
	//	||
	//	&&
		
		
		if(liczba >100 && liczba %2 == 0) {
			  System.out.println("wysoka i parzysta liczba");
		}
		
		if(liczba >100 || liczba %2 == 0) {
			  System.out.println("wysoka lub parzysta liczba");
		}
		
		for(int i = 0; i < 4 ; i++ ) {
			//drukuje 1 rzad
			for(int j = 0 ; j < 10  ; j++ ) {
				if(i==0 || i==3 || j==0 || j==9) {
					System.out.print("X");
				}else {
					System.out.print(" ");
				}
			
			}
			//przechodzi do kolejnej linii
			System.out.println();
			
			//tablice
			
		}
		
		
		int[] wynikiLosowania = new int[6];
		liczba = 3; // nadpisywanie zwykle zmiennej
		wynikiLosowania[0] = 10;
		wynikiLosowania[1] = 33;
		wynikiLosowania[2] = 50;
		 System.out.println(Arrays.toString(wynikiLosowania));
		 
		
		
		
		
		
		
		
		
		
		

	}

}
