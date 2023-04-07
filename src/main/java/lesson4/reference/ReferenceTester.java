package lesson4.reference;

public class ReferenceTester {
    public static void main(String[] args) {
        // int, double, char, float, boolean, byte, long, shot, - примитивные типы все с маленькой буквы
        // String Integer Double

        int a[] = new int[1];
        a[0] = 10;
        changeArray(a);
        System.out.println(a[0]);
    }

    public static void changeArray(int[] array){
        array[0] = 1000;
    }
}
