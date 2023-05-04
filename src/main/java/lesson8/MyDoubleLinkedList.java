package lesson8;

import lesson6.list.MyList;

public class MyDoubleLinkedList implements MyList {
    private int size = 0;
    private Node head;
    private Node tail;

    public MyDoubleLinkedList() {
        this.size = size;
        this.head = head;
        this.tail = tail;
    }

    private static class Node{
        Node prev;
        Node next;
        int value;
        public Node(int value)
        {
            this.value = value;
        }

        public Node(Node next, Node prev, int value)
        {
            this.next = next;
            this.prev = prev;
            this.value = value;
            if(next != null)
                next.prev = this;
            if(prev != null)
                prev.next = this;
        }
    }

    @Override
    public int get(int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        Node n = getNodeByIndex(index);
        return n.value;
    }

    private Node getNodeByIndex(int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        Node n = head;
        while (n != null && index > 0)
        {
            index--;
            n = n.next;
        }
        return n;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getLast(int i) {return 0;}

/* Чтобы удалить первый элемент в (double linked list), необходимо выполнить следующие шаги:
    Проверить, есть ли вообще элементы в списке. Если список пустой, то удаление не требуется.
    Если список не пустой, то установить указатель на головной элемент списка.
    Установить указатель на головной элемент списка на следующий элемент, после чего освободить память, занятую первым элементом.
    Установить указатель на предыдущий элемент новой головы в NULL.
    Вернуть новую голову списка.*/

    public Node removeFirstElement() {
        if (head == null) {
            return null;
        }
        if (head.next != null) {
            head.next.prev = null;
        }
        head = head.next;
        return head;
    }

    /* То же самое делаем с конца */
    public Node removeLastElement() {
        if(tail == null) {
            return null;
        }
       if (tail.prev != null){
           tail.prev.next = null;
       }
       tail = tail.prev;
        Node prev = null;
        return null;
    }

    public void addFirst(int value) {
        Node node =  new Node(value);
        if (head == null) { // если список пустой
            head = node; // новый узел становится головным узлом
        } else { // если список не пустой
            head.prev = null; // устанавливаем указатель на предыдущий узел текущего головного узла на новый узел
            node.next = head; // устанавливаем указатель на следующий узел нового узла на текущий головной узел
            head = node; // новый узел становится головным узлом
        }

    }
    public void addLast(int value) {
        Node node = new Node(value);
        if(head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) { // ищем последний узел в списке
                current = current.next;
            }
            current.next = node; // устанавливаем указатель на следующий узел текущего последнего узла на новый узел
            node.prev = current; // устанавливаем указатель на предыдущий узел нового узла на текущий последний узел
        }
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(int value) {
        Node n = head;
        while (n != null)
        {
            if(n.value == value)
                return true;
            n = n.next;
        }
        return false;
    }


    @Override
    public void set(int index, int value) {
        Node n = getNodeByIndex(index);
        if(n != null)
            n.value = value;
    }


    @Override
    public void add(int value) {
        Node node;
        // нет ни одного элемента
        if(size() == 0)
        {
            node = new Node(value);
            head = node;
        }
        else {
            node = new Node(null, tail, value);
        }
        tail = node;
        size++;
        }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("[");
        Node n = head;
        while (n != null)
        {
            b.append(n.value);
            if(n.next != null)
                b.append(", ");
            n = n.next;
        }
        b.append("]");
        return b.toString();
    }


    public void add(int index, int value) {
        if(size() == 0 && index == 0) {
            add(value);
            return;
        }
        if(index == 0)
        {
            Node n = new Node(head, null, value);
            head = n;
        }
        else if(index == size())
        {
            Node n = new Node(null, tail, value);
            tail = n;
        }
        else {
            Node n = getNodeByIndex(index);
            Node p = n.prev;
            Node newNode = new Node(n, p, value);
        }
        size++;
    }

    @Override
    public void remove(int index) {

        if(index < 0 || index >= size())
            throw new IndexOutOfBoundsException();
        if(index == 0 && head != null)
        {
            head = head.next;
            if(head != null)
                head.prev = null;
        }
        else if(index == size() -1)
        {
            tail = tail.prev;
                if(tail != null)
            tail.next = null;
        }
        else
        {
            Node c = getNodeByIndex(index);
            Node p = c.prev;
            Node n = c.next;
            if(n != null)
                p.next = n;
            if(n != null)
                n.prev = p;
        }
        size--;
        }

}
