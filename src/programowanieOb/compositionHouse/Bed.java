package programowanieOb.compositionHouse;

public class Bed {
    //madeBed
    private boolean made;


    public void madeBed(){
        made=true;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "made=" + made +
                '}';
    }
}
