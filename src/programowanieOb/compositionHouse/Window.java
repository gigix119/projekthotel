package programowanieOb.compositionHouse;

public class Window {
    private boolean close=true;

    public void openWindow(){
        close=false;
    }

    @Override
    public String toString() {
        return "Window{" +
                "close=" + close +
                '}';
    }
}
