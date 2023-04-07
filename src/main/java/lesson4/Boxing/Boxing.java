package lesson4.Boxing;

import lesson4.animals.BigDog;
import lesson4.animals.Cat;
import lesson4.animals.Dog;


public class Boxing {
    public static void main(String[] args) {
        int i = 10;
        Integer i1 = new Integer(10);

//        List<Integer> integers = new ArrayList();
        // List<int> anc = new ArrayList<>();

        Integer i2 = 10; //boxing

        if(i2 < 100) // unboxing
            System.out.println("Hello");

        // примитивные типы стравниваються по значению
        int a = 10;
        int b = 10;
        System.out.println(a == b);

        Integer i3 = new Integer(10);
        Integer i4 = new Integer(10);
        System.out.println(i3 == i4);
        // ==> сравнивает ссылочные типы по адресу в памяти

        System.out.println(i3.equals(i4));
        // ==> equals сравнивает по значению

        Cat d1 = new Cat("George");
        Cat d2 = new Cat("George");

        Dog dog12 = new Dog("Semjon");


        // поправить равенство

        System.out.println(d1.equals(d2));
        System.out.println(d2);



    }
}
