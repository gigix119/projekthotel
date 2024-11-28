package programowanieOb.compositionHouse;

import java.util.Arrays;

public class House {
    private Door doorr;//=new Door();
    private Room[] rooms;


    public House(Room[] rooms) {
        this.rooms = rooms;
        doorr = new Door();
    }

    public void cleanHouse() {
        for (Room room : rooms) {
            room.clean();
        }

    }

    @Override
    public String toString() {
        return "House{" +
                "doorr=" + doorr +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
