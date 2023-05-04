package lesson7;


import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

    /* Написать функцию в MyArrayList, возвращающую итератор, обходящий контейнер по возрастанию значений элементов
    порядок элементов в контейнере меняться не должен */

    public class MyArrayList<T extends Comparable<T>> implements Iterable<T> {

        private T[] array;
        private int size;

        public MyArrayList() {
            array = (T[]) new Comparable[10];
            size = 0;
        }

        public void add(T value) {
            if (size >= array.length) {
                resize();
            }
            array[size] = value;
            size++;
        }

        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
            return array[index];
        }

        public int size() {
            return size;
        }

        public Iterator<T> ascendingIterator() {
            return new AscendingIterator();
        }

        private void resize() {
            T[] newArray = (T[]) new Comparable[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }

        @Override
        public Iterator<T> iterator() {
            return null;
        }

        @Override
        public void forEach(Consumer<? super T> action) {
            Iterable.super.forEach(action);
        }

        @Override
        public Spliterator<T> spliterator() {
            return Iterable.super.spliterator();
        }

        private class AscendingIterator implements Iterator<T> {

            private int currentIndex = 0;
            private T current = null;

            public AscendingIterator() {
                current = get(0);
            }

            public boolean hasNext() {
                return currentIndex < size;
            }

            public T next() {
                T result = current;
                currentIndex++;

                for (int i = currentIndex; i < size; i++) {
                    T nextValue = get(i);
                    if (nextValue.compareTo(current) < 0) {
                        continue;
                    }
                    current = nextValue;
                    break;
                }

                return result;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public static void main(String[] args) {
            MyArrayList<Integer> list = new MyArrayList<>();
            list.add(5);
            list.add(3);
            list.add(9);
            list.add(1);
            list.add(7);

            Iterator<Integer> ascendingIterator = list.ascendingIterator();
            while (ascendingIterator.hasNext()) {
                System.out.print(ascendingIterator.next() + " ");
            }
            // Output: 1 3 5 7 9
        }
    }



