package lesson5.arrays;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.compare;

public class SortTester {
    public static void main(String[] args) {
        String [] countries = new String[]
                {
                        "France",
                        "Cyprus",
                        "Germany",
                        "Burkina-Faso",
                        "Switzerland"
                };

        Arrays.sort(countries);

        System.out.println(Arrays.toString(countries));

        int[] a = new int [] {1,-10,2,5,3};
        Arrays.sort(a);
        System.out.println(
                Arrays.toString(a)
    );

        Arrays.sort(countries, new StringLengthComparator());
        System.out.println(Arrays.toString(countries));

        System.out.println(
                Arrays.binarySearch(a, 5)
        );

        System.out.println(
                Arrays.binarySearch(a, -20)
        );

        // [-10, 1, 2, 3, 5] двоичный поиск O(log(n))
        //   0   1  2  3  4

        // вначале отсортировать а потом искать двоичным поиском?
        //         O(n*log(n)) + O(log(n)) -> O(n*log(n))

        // что возвращает binarySearch при отсутствии элемента в массиве?
        // возвращается место элемента M при его вставке в массив, которое бы не
        // нарушило порядок сортировки -(M + 1)

        // binarySearch возвращает отрицательное число если такого элемента в контейнере нет
        // либо порядковый номер найденного элемента


        int [] a1 = {1,2,3};
        int [] b1 = {1,2,3};
        System.out.println(compare(a1, b1));

        Object [] o = {3.14, "Cloud"};


        // ** написать функцию бинарного поиска

    }


}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        // сравнить строки по их длине
        // если o1 < o2 вернуть что-то отрицательное
        // если o1 > o2 вернуть что-то положительное
        // если o1 == o2 вернуть 0
        return o1.length() - o2.length();
    }

    // напишите функцию которая получает на вход два массива целых одинаковой длины
    // возвращает true если элементы массивов совпадают
    public static boolean compare(int [] a, int [] b)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] != b[i])
                return false;
        }
        return true;
    }



}






