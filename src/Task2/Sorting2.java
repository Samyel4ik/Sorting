package Task2;

import java.util.Arrays;

public class Sorting2 {
    public static void main(String[] args) {
        //Реализуйте сортировку выбора. (найти минимальный элемент и поместит его в начало размер массива уменьшит на 1 эл)
        int array[] = {9, 4, 5, 3, 6, 8, 7, 2, 1, 0};


        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;                                  // минимальный индекс по циклу для начала индекс 0

            for (int j = i + 1; j < array.length; j++) {        // индекс минимального элемента
                if (array[min_index] > array[j]) {
                    min_index = j;
                }
            }
            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
