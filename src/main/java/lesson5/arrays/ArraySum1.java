package lesson5.arrays;

import java.util.Arrays;

public class ArraySum1 {

    // сумма элементов двух одномерных массивов
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4 ,5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] sumArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            sumArray[i] = array1[i] + array2[i];
        }

        System.out.println("Сумма чисел двух массивов: " + Arrays.toString(sumArray));
    }

}


