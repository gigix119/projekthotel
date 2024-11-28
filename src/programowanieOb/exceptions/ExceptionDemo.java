package programowanieOb.exceptions;

public class ExceptionDemo {

    public static void main(String[] args) {
        String text = null;

        try {
            System.out.println(text.toUpperCase());
            text = text.toUpperCase();
            System.out.println("coś jeszcze" + text);
        }
        catch (NullPointerException exception) {
            System.out.println("Wystapil nullpointer!!");
        }

        System.out.println("Cos dalej...");

    }


}
