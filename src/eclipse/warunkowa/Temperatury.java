package eclipse.warunkowa;


import java.util.Scanner;

public class Temperatury {
    public static void main(String[] args) {
        //program ma zapytać o temperaturę wody a następnie wyświetlić w jakim jest ona stanie skupienia
        // przy danej temperaturze ( woda zamarza przy 0 stopni, a przy 100C zaczyna się gotować

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaka jest temperatura wody :");
        int temperatura = scanner.nextInt();
        if (temperatura<0){
            System.out.println("Woda zamarza");
        } else if (temperatura>100){
            System.out.println("Woda zaczyan sie gotowac");
        } else {
            System.out.println("Woda jest w stanie plynnym");
        }

    }
}
