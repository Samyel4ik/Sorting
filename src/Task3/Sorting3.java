package Task3;

import java.util.Arrays;

public class Sorting3 {
    public static void main(String[] args) {
        //Реализуйте сортировку обменами. (сравнить соседние или сортировка пузырьком )
        int array[] = {5, 3, 2, 1, 0, 6, 7, 4, 8, 9};

        int t = 0;                                                      // флажок для захода в цикл
        while (t == 0) {
            t = 1;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {                       //сравниваем два числа если первое больше следуещего меняем их
                    int zam = array[i];
                    t = 0;                                          // если замена произошла то меняем значение, что б цикл опять заработал
                    array[i] = array[i + 1];
                    array[i + 1] = zam;

                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
