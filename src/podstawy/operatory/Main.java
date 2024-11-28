package podstawy.operatory;

public class Main {
    public static void main(String[] args) {
//        Zadanie 3.*
//        Napisz program który oblicza wskaźnik bmi: wzór: waga/wzrost².
//        Waga ma być podana w kilogramach granicaNadwagi wzrost w metrach.
//        Dodatkowo program ma sprawdzić czy bmi jest powyżej 24,9 - nadwaga lub czy bmi jest poniżej 18,5 - niedowaga.
//        Poinformuj o każdym działaniu programu.
        double granicaNadwagi=24.9, granicaNiedowagi=18.5;
        int waga = 59;
        double wzrost = 1.80;
        double bmi = waga/(wzrost*wzrost);
        System.out.println("Twoje bmi to :" + bmi);
        if(bmi>=granicaNadwagi){
            System.out.println("Jest nadwaga :" + bmi);
        } else if(bmi<=granicaNiedowagi) {
            System.out.println("Jest niedowaga :" + bmi);
        }else{ System.out.println("Twoja waga jest dobra");

        }

        System.out.println( );







    }
}
