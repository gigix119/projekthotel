package programowanieOb.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {
        File file = new File("src/programowanieOb/exceptions/tekst.txt");


        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String tekst = scanner.nextLine();
                System.out.println(tekst);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
        }

    }
}
