package lesson5.arrays.homework;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int a [][] = {
                {1,2,3},
                {4},
                {-5}
        };
        System.out.println(sumOf2DArray(a));

        print2DArray(a);

    }


    public static void print2DArray(int [][] a)
    {
        System.out.println("[");
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(
                    Arrays.toString(a[i])
            );
        }
        System.out.println("]");
    }


// напишите функцию, вычисляющую сумму элементов двухмерного массива целых

    public static int sumOf2DArray(int [] [] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {

            }
        }
        return 0;
    }

}