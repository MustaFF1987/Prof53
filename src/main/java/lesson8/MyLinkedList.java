package lesson8;

import lesson6.list.MyList;

public class MyLinkedList implements MyList {


    // возвращает значение удаляемого первого элемента
    public int removeFirst()
    {
        int value = getFirst(0);
        remove(0);
        return value;
    }


    public int getFirst(int index)
    {
       return get(0);
    }

    public void addFirst(int value)
    {
       add(0,value);
    }

    // добавление элемента в конец списка
    @Override
    public void add(int value)
    {
        size++; // так как мы вставляем новый элемент
        if (head == null)
        {
            head = new Node(value, null);
            return;
        }
        // найти элемент у которого getNext() == null
        Node n = head;
        while (n.getNext() != null)
            n = n.getNext();
        n.setNext(new Node(value, null));
    }

    @Override
    public void add(int index, int value) {
            // если Index = 0
            if(index == 0)
        {
            // нужно создать новый узел
            Node n = new Node(value, head);
            head = n;
        }
        else {
            Node prev = getNodeByIndex(index - 1);
            Node next = prev.getNext();
            Node newNode = new Node(value, next);
            prev.setNext(newNode);
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if(index == 0) {
            if (head == null)
                return;
            head = head.getNext();
            size--;
            return;
        }
        Node prev = getNodeByIndex(index - 1);
        if(prev != null)
        {
            Node current = prev.getNext();
            if(current != null)
            {
                prev.setNext(current.getNext());
                size--;
            }
        }
    }

    @Override
    public String toString()
    {
        StringBuilder b = new StringBuilder("[");
        Node n = head;
        while(n != null)
        {
            b.append(n.getValue());
            n = n.getNext();
            if(n != null)
                b.append(", ");
        }
        b.append("]");
        return b.toString();
    }


    // проверка, что элемент с нужным значением содержится в LinkedList
    @Override
    public boolean contains(int value)
    {
        Node n = head; // текущий узел
        while(n != null)
        {
            // проверить значение
            if(n.getValue() == value) // если элемент найден, возвращаем true
                return true;
            n = n.getNext(); // если же нет, проверяем следующий узел
        }
        return false;
    }

    // изменение значения элемента по порядковому номеру
    @Override
    public void set(int index, int value)
    {
        Node n = getNodeByIndex(index);
        if(n != null)
            n.setValue(value);
    }


    // важно проверить что полученный узел не null
    // если в процессе определится что текущий узел null нужно

    // получение узла по индексу
    private Node getNodeByIndex(int index)
    {
        Node n = head;
        // нужно index раз сделать getNext()
        for(int i = 0; i < index; i++)
        {
            // важно проверить что полученный узел не null
            if(n != null)
                n = n.getNext();
            else
                // если в процессе определится что текущий узел null нужно
                throw new IndexOutOfBoundsException();
        }
        return n;
    }

    // структура для хранения данных в Linked листе
    private static class Node {
        private int value; // значение
        private Node next; // ссылка на след. узел

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    private Node head; // ссылка на первый узел (элемент) LinkedList

    private int size = 0; // количество элементов в Linked List

    @Override
    public int size()
    {
        return size;
    }

    // получение значения элемента по индексу
    @Override
    public int get(int index) {
        Node n = getNodeByIndex(index);
        return n.getValue();
    }

}
