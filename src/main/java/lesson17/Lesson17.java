package lesson17;

// Lambdas, Functional Interface, Method
// SAM interface - Single abstract method - интерфейс с единственным абстрактным методом

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson17 {
    public static void main(String[] args) {

        NoArgsReturnDouble return10 = new NoArgsReturnDouble() {
            @Override
            public double function() {
                return 10;
            }
        };

        // Реализация SAM interface может быть записано как лямбда-выражение
        NoArgsReturnDouble randomDouble = (/* Параметры функции */) -> Math.random()*33;

        TwoIntsReturnBoolean equalityCheck = (i, j) -> i == j;
        System.out.println(" Равны ли числа 10 & 12 "  + equalityCheck.function(10,12));
        System.out.println(" Равны ли числа 3 & 3 "  + equalityCheck.function(3,3));
        System.out.println(" Равны ли числа 5 & 7 " + process(5,7,equalityCheck) );

        System.out.println("делится ли 33 на 11 без остатка " +
                process(
                        33,
                        11,
                        (i, j) -> i % j == 0
                )
        );

        // Interface

        List<Integer> ints = Arrays.asList(1,3,5,7,2,8);

        // создайте предикат, который проверит числа на четность
        // отфильтруйте список чисел с помощью этого предиката и
        // распечатайте результат

        PredicateInt numbers = i -> i % 2 == 0;
        System.out.println(filter(ints, numbers));


        List<String> names = Arrays.asList("Masha", "Sveta", "Max", "Alex", "Sam");
        // напишите преобразование этого списка к верхнему регистру
        // через mapper
        // до 20:15
//        System.out.println(
//                mapper(names, String::toUpperCase)
//        );



        // StringProcessor toUpper = (s) -> s.toUpperCase();
        // тоже выражение, но написано по другому
        StringProcessor toUpper = String::toUpperCase;

        consume(names, System.out::println);

    }

    // напишите функцию static boolean process(int i, int j, TwoIntsReturnsBoolean c)
    // которая возвращает результат выполнения TwoIntsReturnsBoolean с целыми аргументами

        public static boolean process(int i, int j, TwoIntsReturnBoolean c)
        {
            return c.function(i, j);
        }

        TwoIntsReturnBoolean dividedBy = (i, j) -> i % j == 0;

    // StringConsumer printer = s -> System.out.println(s);
    StringConsumer printer = System.out::println; // ссылка на статический метод


    // напишите функцию, которая принимает на вход List<Integer> и
    // возвращает список только тех целых, для которых PredicateInt возвратит true
    public static List<Integer> filter(List<Integer> ints, PredicateInt p)
    {
        List<Integer> result = new ArrayList<>();
        for (int i: ints) {
            if(p.function(i))
                result.add(i);
        }
        return result;
    }


    // нужно возвращать список строк после применения к каждой из них
    // StringProcessor-а

    public static List<String> mapper(List<String> strings, StringProcessor p){
        List<String> result = new ArrayList<>();
        for(String s: strings){
                strings.add(p.function(s));
        }
        return result;
    }

    // напишите StringConsumer который распечатывает строку
    // и вызовите его для всех строк в списке

    public static void consume(List<String> strings, StringConsumer c)
    {
        for(String s: strings){
            c.function(s);
        }
    }

}





