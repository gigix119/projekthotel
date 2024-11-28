package hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private UserService userService = new UserService();


    public void runMenu() {
        int input;
        do {
            showOptions();
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();
            scanner.nextLine();


            executeOptions(input);

        } while (input != 7);

        System.out.println("Zakończenie programu ");
    }

    public void showOptions() {
        System.out.println("Opcja 1 to stan pokoi ");
        System.out.println("Opcja 2 to dostepnosc pokoi ");
        System.out.println("Opcja 3 to Lista zajęctych pokoi wraz z datą opuszcania go");
        System.out.println("Opcja 4 to rezerwacja pokoi ");
        System.out.println("Opcja 5 to zwolnienie pokoju ");
        System.out.println("Opcja 6 to sprzątanie pokoju ");
        System.out.println("Opcja 7 to zamykanie programu");
    }

    public void executeOptions(int input) {
        Scanner scanner = new Scanner(System.in);
        switch (input) {
            case 1:
                System.out.println("Opcja 1" + userService.getRooms()); //zaprezentuj pokoje w przejrzystej formie jeden pod drugim przyda sie petla
                break;
            case 2:
                System.out.println("Opcja 2" + userService.getAvaiableRooms()); // tak samo jak pierwsze
                break;
            case 3:
                System.out.println("Opcja 3" + userService.getUnAvaiableRooms());
                break;
            case 4:
                System.out.println("Opcja 4");
                List<Guest> guests = new ArrayList<>();
                System.out.println("Ile osob chcesz zaarejestrowac ? ");
                int iloscOsob = scanner.nextInt();
                for (int i = 0; i < iloscOsob; i++) {
                    guests.add(createGuest());
                }
                System.out.println("Podaj numer pokoju");
                try {
                    userService.book(scanner.nextInt(), guests);
                    System.out.println("Pokoj zarezerwowany");
                } catch (UserServiceException e) {
                    System.out.println(e.getMessage());
                }

                System.out.println(guests);
                break;
            case 5:
                System.out.println("Opcja 5");
                System.out.println("Podaj numer pokoju do zwolnienia");
                userService.release(scanner.nextInt());
                System.out.println("Pokoj zwolniony");
                break;

            case 6:
                System.out.println("Opcja 6");
                System.out.println("Podaj numer pokoju który chcesz posprzątać");
                userService.cleanRoom(scanner.nextInt());
                System.out.println("Pokój posprzątany");
                break;
        }
    }

    public Guest createGuest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imie");
        String nameGuests = scanner.nextLine();
        System.out.println("Nazwisko");
        String surnameGuests = scanner.nextLine();
        System.out.println("Data urodzenia, napisz w formacie : Rok-Miesiac-Dzien");
        String birthdayGuests = scanner.nextLine();
        System.out.println(nameGuests);
        System.out.println(surnameGuests);
        System.out.println(birthdayGuests);
        LocalDate birthdayLD = LocalDate.parse(birthdayGuests);
        return new Guest(nameGuests, surnameGuests, birthdayLD);
    }


}
