package Task4;

import java.util.Arrays;

public class Sorting4 {
    public static void main(String[] args) {
        //Реализуйте сортировку вставками.
        int array[] = {5, 3, 2, 1, 0, 6, 7, 4, 8, 9};

        int j;
        int t;
        for (int i = 0; i < array.length; i++) {
            t = array[i];                                       // хранит значение которое я сравниваю
            for (j = i - 1; j >= 0 && array[j] > t; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = t;
        }
        System.out.println(Arrays.toString(array));
    }
}
