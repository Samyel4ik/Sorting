package Task5;

import java.util.Arrays;

public class Sorting5 {
    //Реализуйте сортировку Шелла.
    public static void main(String[] args) {
        int array[] = {5, 3, 2, 1, 0, 6, 7, 4, 8, 9};
        int d = array.length / 2;                           // шаг сравнивания
        while (d > 0) {
            for (int i = 0; i < (array.length - d); i++) {
                int j = i;
                while (j >= 0 && array[j] > array[j + d]) {            //array[j]>array[j+d] сравниваем 1 эл и эл с шагом Д т е с числом второй части масива
                    int t = array[j];                           // если условие верно то мы должны поменять их местами
                    array[j] = array[j + d];
                    array[j + d] = t;
                    j--;                                         // для выхода из цикла while
                }
            }
            d = d / 2;                                              // шаг меняем на меньший , что б еще раз пройти по циклу с меньшим шагом
            //пока не дойдем до д=1;
        }
        System.out.println(Arrays.toString(array));
    }
}
