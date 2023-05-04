package lesson5.arrays.homework;

import java.util.Arrays;

public class ArrayUniqueNumbers {
    public static void main(String[] args) {

        int [] c = {1,2,3};
        int [] d = {3,5};
        System.out.println(
                Arrays.toString(removeDuplicates(c,d))
        );


    }

    // напишите функцию, возвращающую массив из не повторяющиеся элементов двух массивов
    /*
        [1,2,3]
        [3,5]

        перебор всех элементов O(n^2)
        сортировка O(n*log(n))
     */
    public static int [] removeDuplicates(int [] a, int [] b)
    {
        int [] c = new int[a.length + b.length];
        for(int i = 0; i < a.length; i++)
        {
            c[i] = a[i];
        }
        for(int i = 0; i < b.length; i++)
        {
            c[i + a.length] = b[i];
        }
        Arrays.sort(c);
        int [] d = new int[c.length];
        int current = c[0];
        int index = 1;
        d[0] = c[0];
        for(int i = 1; i < c.length; i++)
        {
            if(current != c[i])
            {
                d[index] = c[i];
                index++;
            }
            current = c[i];
        }

        int [] e = new int[index];
        for(int i = 0; i < e.length; i++)
        {
            e[i] = d[i];
        }
        return e;
    }

}
