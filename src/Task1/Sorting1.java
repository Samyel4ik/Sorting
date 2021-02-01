package Task1;

import java.util.Arrays;

public class Sorting1 {
    public static void main(String[] args) {
        //Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объед
        // инить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
        // при этом не используя дополнительный массив.
        int k = 4;
         int array1 [] = {1,2,3,4,5};
         int array2 []= {6,7,8,9,10};

         int one = array1.length;
         int two = array2.length;

         int []result = new int[one+two];


         System.arraycopy(array1,0,result,0,k);
         System.arraycopy(array2,0,result,k,two);
         System.arraycopy(array1,k,result,k+two,one-k);
         System.out.println(Arrays.toString(result));
    }
}
