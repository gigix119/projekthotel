package zmienne;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("hello world");
		
		int ocena = 5;
		
		switch (ocena) {
		case 2:
			System.out.println("Nie zaliczy³eœ!");
			break;
		case 3:
			System.out.println("Zaliczy³eœ ledwo");
			break;
		case 4:
			System.out.println("Zaliczy³eœ ca³kiem dobrze");
		case 5:
			System.out.println("Zaliczy³eœ bardzo dobrze");
			break;
			default:
				System.out.println("Ocena jest niepoprawna");
		}
		

	}

}
