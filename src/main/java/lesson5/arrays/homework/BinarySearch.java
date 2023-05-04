package lesson5.arrays.homework;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int r [] = {1, 2, 7, 12, 33,  35, 37, 50, 77};

        // System.out.println(Arrays.binarySearch(r, 50)); // 7
        System.out.println(binarySearch(r, 50));

        // System.out.println(Arrays.binarySearch(r, 10)); // -4
        System.out.println(binarySearch(r, 10));

    }

    public static int binarySearch(int [] a, int value)
    {
        int minIndex = 0;
        int maxIndex = a.length - 1;
        while (minIndex <= maxIndex)
        {
            int midIndex = (minIndex + maxIndex) /2;
            if(a[midIndex] < value)
            {
                minIndex = midIndex + 1;
            }
            else if (value < a[midIndex])
            {
                maxIndex = midIndex - 1;
            }
            else
                return midIndex;
        }
        return  -minIndex - 1;
    }


}
