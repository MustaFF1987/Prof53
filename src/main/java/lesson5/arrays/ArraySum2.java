package lesson5.arrays;

import java.util.Arrays;

public class ArraySum2 {

    public static void main(String[] args) {

        int[][] twoDimensionalArray = {{1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}, {6, 7, 8, 9, 10}, {10, 9, 8, 7, 6}};

        int sum = DimensionalArraySum(twoDimensionalArray);

        System.out.println("Сумма чисел двумерного массива: " + sum);

        System.out.print("Двумерный массив: ");
                printArrays(twoDimensionalArray);


     //     сумма элементов двухмерного массива целых чисел:

    }
    public static int DimensionalArraySum (int [][] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array[i].length; j++)
                sum += array [i][j];
        return sum;
    }

    // функция, распечатывающую двухмерный массив на экране:

    public static void printArrays (int[][] array){
        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");

    }


}
