package eclipse.programowanko;

import java.util.Arrays;

public class Programowanko {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {10, 20, 30, 40, 50};

        System.arraycopy(array1, 0, array2, 2, 2);

        System.out.println(Arrays.toString(array2));
    }
}
