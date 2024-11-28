package podstawy.zadaniaArkusz;

import java.util.Calendar;
import java.util.TimeZone;

public class KalendarzJava {
    public static void main(String args[]) {
        Calendar kalendarz = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        System.out.println("Dzisiejsza data :" + kalendarz.getTime());
    }
}