package lesson5.arrays;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};

            System.out.println();
            System.out.println("Массив целых чисел " + Arrays.toString(array));
            System.out.println("===============================");
            System.out.println("Индекс элемента массива 6, равен: " + binarySearch(array,6));
            System.out.println("Индекс элемента массива 10, равен: " + binarySearch(array,10));
    }

    public static int binarySearch(int[] array,int key){
        int start = 0;
        int end = array.length - 1;
        int current = end / 2;
        while (start <= end){
            if(array[current] ==  key) return current;
            if(array[current] > key) end = current - 1;
            if(array[current] < key) start = current + 1;
            current = start + (end-start) / 2;
        }
        return -1;
    }

}
