package lesson6;

import java.util.Arrays;

public class lesson5Repeat {
    public static void main(String[] args) {

        int[][] d = {
                {1,3,5},
                {10,20},
                {-1}
        };

        System.out.println(Arrays.toString(flattening(d)));
    }
    // напишите функцию уплощения двухмерного массива
    // задача в том чтобы возвратить одномерный массив
    // со всеми элементами двухмерного

    public static int[] flattening(int[][] a) {
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            n += a[i].length;
        }
        System.out.println(n);
        // создать одномерный массив с этим количеством
        int[] r = new int[n];
        // в еще одном цикле добавить в него элементы из двухмерного
        // пробежаться по двухмерному массиву и узнать общее количество элементов
        int array = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                r[array++] = a[i][j];
            }
        }
        return r;
    }
}
