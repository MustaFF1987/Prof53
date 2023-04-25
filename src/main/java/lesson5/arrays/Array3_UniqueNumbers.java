package lesson5.arrays;

import java.util.Arrays;
public class Array3_UniqueNumbers {

    //напишите функцию, возвращающую массив из не повторяющиеся элементов двух массивов
    public static void main(String[] args) {

        //создаём два одномерных массива
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,7,8};

        //создаём результирующий массив длинной из двух массивов куда будем записывать неповторяющиеся элементы
        int[] resultArray = new int[array1.length+array2.length];

        //создаём переменную целых чисел для и инициализируем её 0
        int result = 0;

        //с помощью цикла for записываем элементы первого массива в новый массив resultArray
        for (int i = 0; i < array1.length; i++) {
            resultArray[result] = array1[i];
            result++;
        }

        // с помощью цикла for сравниваем элементы первого массива со вторым и если они не равны добавляем в массив resultArray
        for(int i = 0; i < array2.length; i++) {
            boolean sameNumber = false;
            for(int j = 0; j < array1.length; j++)
                if(array1 == array2){
                    sameNumber = true;
                    break;
                }
            if(!sameNumber){
                resultArray[result] = array2[i];
                result++;
            }
        }
        System.out.println(Arrays.toString(resultArray));

        // Создаем новый массив, содержащий только неповторяющиеся элементы
        int[] finalArray = new int[result];
        for(int i = 0; i < result; i++){
            finalArray[i] = resultArray[i];
        }
        System.out.println(Arrays.toString(finalArray));
    }
}
