package programowanieOb.compositionHouse;

import java.util.Arrays;

public class Room {
    private Bed bed;
    private Window[] windows;



    public Room(int windowsAmount) {
        windows = new Window[windowsAmount];
        for (int i = 0; i < windowsAmount; i++) {
            windows[i] = new Window();
        }
        bed= new Bed();
    }
    public void clean(){
        bed.madeBed();
        for (Window window : windows) {
            window.openWindow();
        }
    }


    @Override
    public String toString() {
        return "Room{" +
                "bed=" + bed +
                ", windows=" + Arrays.toString(windows) +
                '}';
    }
}
