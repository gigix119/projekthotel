package hotel;

import java.time.LocalDate;
import java.util.List;

public class Room {
    private int number;
    private boolean bathroom = true;
    private int size;
    private boolean available;
    private List<Guest> guests;
    private boolean clean = true;
    private LocalDate checkIn;
    private LocalDate checkOut;


    public Room(int number, boolean bathroom, int size, boolean available) {
        this.number = number;
        this.bathroom = bathroom;
        this.size = size;
        this.available = available;
    }


    public int getNumber() {
        return number;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public boolean isClean() {
        return clean;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }


    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", bathroom=" + bathroom +
                ", size=" + size +
                ", available=" + available +
                ", guests=" + guests +
                ", clean=" + clean +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                '}';
    }
}

