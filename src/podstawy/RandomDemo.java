package podstawy;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int liczba =  random.nextInt(4) + 2; // 0,1,2,3  2-5 po modyfikacji
        int liczba1 =  random.nextInt(30) + 2; // 0,1,2,3  2-5 po modyfikacji
        int liczba2 =  random.nextInt(50) + 10; // 0,1,2,3  2-5 po modyfikacji

        System.out.println(liczba);
        System.out.println(liczba1);
        System.out.println(liczba2);

    }
}
