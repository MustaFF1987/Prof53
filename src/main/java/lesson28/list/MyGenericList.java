package lesson28.list;

// интерфейс это набор методов, которые должны реализовывать наследники

// контракт, которому должны следовать дочерние классы

// класс может реализовывать несколько интерфейсов, но наследовать только один класс

public interface MyGenericList<T> {
    int size(); // возвращать размер списка
    T get(int index); // получение элемента по списку
    boolean contains(T value); // содержится ли элемент в списке
    void set(int index, T value); // изменение элемента
    void add(T value); // добавление элемента в конец
    void add(int index, T value); // добавление элемента
    void remove(int index); // удаление элемента по индексу
}
