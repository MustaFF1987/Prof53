package lesson7;

import lesson6.list.MyArrayList;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {

        List<String> rivers = new ArrayList<>(Arrays.asList("Volga", "Danube", "Rein", "Sena"));

        // iterator это способ обхода произвольного контейнера с элементами
        // boolean hasNext() - проверка есть ли следующий элемент
        // T next() - возвращение следующего элемента

        Iterator<String> riversIterator = rivers.iterator();

        // System.out.println(riversIterator.hasNext()); // true
        // System.out.println(riversIterator.next()); // Volga
        // System.out.println(riversIterator.hasNext()); // true
        // System.out.println(riversIterator.next()); // Danube

        // пройтись по списку используя итератор и вывести значения на экран

       while (riversIterator.hasNext())
           System.out.println(riversIterator.next());

        //==========================================================================


//        while(arrayIterator.hasNext())
//        {
//            int value = arrayIterator.next();
//            System.out.println(arrayIterator.next());
//            if(value > 25)
//                arrayIterator.remove();
//        }
//
//        // для того что бы работал foreach, контейнер
//        // должен реализовывать интерфейс Iterable<T>
//        for(int i: list)
//        {
//            System.out.println("" + i);
//        }

        //==========================================================================

//        Iterator<Integer> backwardIterator = list.backwardIterator();
//        while (backwardIterator.hasNext())
//            System.out.println("<" + backwardIterator.next() + ">");

        //==========================================================================

//        list.add(-10);
//        System.out.println(list);
//
//        Iterator<Integer> minToMax = list.smallToBigIterator();
//        while (minToMax.hasNext())
//            System.out.println("(" + minToMax.next() + ")");


    }
}
