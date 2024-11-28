package hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hotel {
    private List<Room> rooms = new ArrayList<>();


    public Hotel() {
        Random random = new Random();
        for (int i = 1; i < 10; i++) {
            rooms.add(new Room(i,true,i,random.nextBoolean()));

        }
    }

    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + rooms +
                '}';
    }
}
