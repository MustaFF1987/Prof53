package lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;
import java.util.function.Consumer;

public class IteratorHomeWork {

//    // Написать функцию в MyArrayList, возвращающую итератор,
//    // обходящий контейнер по возрастанию значений элементов
//    // порядок элементов в контейнере меняться не должен
//
//    public Iterator<Integer> smallToBigIterator() {
//        return new SmallToBigIterator();
//    }
//
//
//    public class SallToBigIterator implements Iterator<Integer> {
//
//        private int[] source = new int[size];
//
//        private int position = -1;
//
//
//        @Override
//        public void forEachRemaining(Consumer<? super Integer> action) {
//            Iterator.super.forEachRemaining(action);
//        }
//
//        public class SmallToBigIterator implements Iterator<Integer> {
//
//            // массив с данными для итератора
//            private int[] source = new int[size];
//            // позиция итератора
//            private int position = -1;
//
//            public SmallToBigIterator() {
//                // скопировать данные из массива data в массив source
//                System.arraycopy(data, 0, source, 0, size);
//                // отсортировать данные в source
//                Arrays.sort(source);
//            }
//
//            @Override
//            public boolean hasNext() {
//                return ++position < size;
//            }
//
//            @Override
//            public Integer next() {
//                if (position < 0 || position >= size)
//                    throw new NoSuchElementException();
//                return source[position];
//            }
//        }
//    }



//===========================================================

    //1. Написать функцию в MyArrayList, возвращающую итератор,
    // обходящий контейнер в обратном порядке


//    public Iterator<Integer> backwardIterator() {
//        return new Iterator<Integer> () {
//
//            private int position = size;
//
//            @Override
//            public boolean hasNext() {
//                return --position >= 0 ;
//            }
//
//            @Override
//            public Integer next() {
//                return get(position);
//            }
//        };
//    }



    public static void main(String[] args) {

        // Функция, возвращающую итератор, обходящий контейнер в обратном порядке

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> reversedList = new ArrayList<>(list);

        Iterator<Integer> listIterator = list.iterator();

        // Функция, возвращающую итератор, обходящий контейнер последовательно

        while (listIterator.hasNext())
            System.out.println(listIterator.next());

        System.out.println("=========================");

        // Функция, возвращающую итератор, обходящий контейнер в обратном порядке

        Collections.reverse(reversedList);
        for (Integer i : reversedList) {
            System.out.println(i);
        }
    }
}
