package hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    private Hotel hotel = new Hotel();


    public List<Room> getRooms() {
        return hotel.getRooms();
    }


    public List<Room> getAvaiableRooms() {
        List<Room> rooms = new ArrayList<>();
        for (Room room : getRooms()) {
            if (room.isAvailable()) {
                rooms.add(room);
            }
        }
        return rooms;
    }

    public void book(int number, List<Guest> guests) throws UserServiceException {
        boolean pelnoletniZnaleziony = czyPelnoletniZnaleziony(guests);
        if (!pelnoletniZnaleziony) { //warunek czy  nie bylo nikogo pelnoletniego
            throw new UserServiceException("Nie było nikogo pełnoletniego");
        }

        boolean bylCzysty = false, znalezlismy = false;
        for (Room avaiableRoom : getAvaiableRooms()) {
            if (avaiableRoom.getNumber() == number) {
                znalezlismy = true;
                if (avaiableRoom.isClean()) {
                    avaiableRoom.setAvailable(false);
                    avaiableRoom.setGuests(guests);
                    bylCzysty = true;
                    avaiableRoom.setCheckIn(LocalDate.now());
                }
            }
        }
        if (!znalezlismy) {
            throw new UserServiceException("Nie było pokoju o podanym numerze");
        }
        if (!bylCzysty) {
            throw new UserServiceException("Nie był posprzątany");
        }
    }

    private boolean czyPelnoletniZnaleziony(List<Guest> guests) {
        for (Guest guest : guests) {
            if (guest.getAge() >= 18) {
                return true;
            }
        }
        return false;
    }

    public void release(int number) {
        for (Room room : getRooms()) {
            if (room.getNumber() == number) {
                room.setAvailable(true);
                room.setClean(false);
                room.setGuests(null);
                room.setCheckOut(LocalDate.now());
            }
        }
    }

    public void cleanRoom(int number) {
        for (Room room : getRooms()) {
            if (room.getNumber() == number) {
                room.setClean(true);
            }
        }
    }

    public List<Room> getUnAvaiableRooms() {
        List<Room> rooms = new ArrayList<>();
        for (Room room : getRooms()) {
            if (!room.isAvailable()) {
                rooms.add(room);
            }
        }
        return rooms;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "hotel=" + hotel +
                '}';
    }
}
