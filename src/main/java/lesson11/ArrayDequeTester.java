package lesson11;

public class ArrayDequeTester {
    public static void main(String[] args) {
        CustomArrayDeque deque = new CustomArrayDeque();

        deque.addFirst(14);
        deque.addFirst(15);
        deque.addFirst(16);
        System.out.println(deque);
        deque.addLast(90);
        System.out.println(deque);
        System.out.println(deque.getLast());
        deque.removeLast();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

    }
}
