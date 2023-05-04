package lesson6.list;

import java.util.Iterator;

public class MyArrayList implements MyList, Iterable<Integer> {

   @Override
    public Iterator<Integer> iterator()
    {
        // если hasNext() == true, то можно вызвать next()
        // реализация итератора через анонимный внутренний класс
        return new Iterator<Integer>() {
            // позиция по умолчанию
            private int position = -1;
            @Override
            public boolean hasNext() {
                return ++position < size;
            }

            @Override
            public Integer next() {
                return get(position);
            }
            @Override
            public void remove(){
                MyArrayList.this.remove(position--);
            }
        };
    }


    private static final int INITIAL_SIZE = 4; //начальная ёмкость контейнера
    private int size = 0 ; // длинна контейнера
    private int [] data; // тут будут храниться элементы

    // конструктор
    public MyArrayList() {
        data = new int[INITIAL_SIZE];
    }

    // количество элементов в списке
    @Override
    public int size() {
        return size;
    }

    // получение элемента по индексу
    @Override
    public int get(int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        return data[index];
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0 ; i < size; i++)
        {
            if(data[i] == value)
                return true;
        }
        return false;
    }


    @Override
    public void set(int index, int value) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        data[index] = value;
    }

    // добавление нового элемента в конец контейнера
    @Override
    public void add(int value) {
        if(size == data.length)
        {
            // увеличить размер массива data
            increaseCapacity();
        }
        data[size] = value;
        size++;
    }

    private void increaseCapacity()
    {
        int[] newData = new int[size*2];
        for(int i = 0; i < size; i++)
        {
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public void add(int index, int value) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        if(size == data.length)
            increaseCapacity();
        for(int i = size - 1; i >= index; i--)
        {
            data[i+1] = data[i];
        }
        data[index] = value;
        size++;
    }


    // удалить элемент с порядковым номером index из контейнера
    @Override
    public void remove(int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        for(int i = index + 1; i < size; i++)
        {
            data[i-1] = data[i];
        }
        size--;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("[");
        for(int i = 0; i < size; i++)
        {
            if(i != 0)
                b.append(", ");
            b.append(data[i]);
        }
        b.append("]");
        return b.toString();
    }


}
