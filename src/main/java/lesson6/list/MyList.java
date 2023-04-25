package lesson6.list;

public interface MyList {
    int size(); // возвращать размер списка
    int get(int index); // получение элемента по списку
    boolean contains(int value); // содержится ли элемент в списке
    void set(int index, int value); // изменение элемента
    void add(int value); // добавление элемента в конец
    void add(int index, int value); // добавление элемента
    void remove(int index); // удаление элемента по индексу
}
