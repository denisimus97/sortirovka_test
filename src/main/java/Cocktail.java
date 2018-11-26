import java.util.Arrays;
import java.util.Collections;

public class Cocktail {
    public static void main(String[] args) {
        int[] a = {2, 3, 65, 7, 8, 93};
        int[] b = sort(a);
        for (int i : b) {
            System.out.println(i);
        }

        System.out.println(hasDublicates(a));
    }

    public static int[] sort(int[] mas) {
        int start = 0;
        int end = mas.length - 1;
        int elem;

        do {
            for (int i = start; i < end; i++) {
                if(mas[i] > mas[i+1]) {
                    elem = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = elem;
                }
            }
            end--;
            for (int i = end; i > start ; i--) {
                if(mas[i] < mas[i-1]) {
                    elem = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = elem;
                }
            }
            start++;
        } while (start <= end);

        return mas;
    }

    public static boolean hasNegative(int[] mas) {
        for (int i : mas) {
            if (i < 0) {
                return true;
            }
        }

        return false;
    }

    public static boolean hasDublicates(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[i] == mas[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
