package zmienne;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("hello world");
		
		int ocena = 5;
		
		switch (ocena) {
		case 2:
			System.out.println("Nie zaliczyłeś!");
			break;
		case 3:
			System.out.println("Zaliczyłeś ledwo");
			break;
		case 4:
			System.out.println("Zaliczyłeś całkiem dobrze");
		case 5:
			System.out.println("Zaliczyłeś bardzo dobrze");
			break;
			default:
				System.out.println("Ocena jest niepoprawna");
		}
		

	}

}
