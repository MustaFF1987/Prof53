package lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction {
    // Array
    // List - список элементов определенного типа - может динамически менятся в размерах
    // Set - набор неповторяюшихся элементов определенного типа
    // Map - пара из ключа и значения заданных типов
    // ... - другие контейнеры

    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();

        countries.add("France");
        countries.add("Germany");
        countries.add("Denmark");

        System.out.println(countries);

        // добавление по индексу
        countries.add(1, "Poland");
        System.out.println(countries);

        // Получить кол-во элементов в списке
        System.out.println(countries.size());

        // Получить элемент из списка
        System.out.println(countries.get(3));

        // Заменить элемент в списке
        countries.set(0, "Norway");
        System.out.println(countries);

//        countries.add(8, "Andora");
//        System.out.println(countries);

        // Удалить элемент из списка по индексу
        countries.remove(0);

        // Удалить элемент из списка по значению
        countries.remove("Poland");
        System.out.println(countries);

        // есть ли элемент в списке
        countries.contains("Denmark");

        // Позиция элемента в списке
        System.out.println(countries.indexOf("Denmark"));

        countries.add("Chad");
        System.out.println(countries);
        printStringsGreaterThan4(countries);

        // вместо цикла for можно воспользоваться stream
        // countries.stream().filter(s -> s.length() > 5).forEach(System.out::println);

        // константного размера, не может менять размер (read only) не можем добавлять новые элементы
        List<String> names = Arrays.asList("Max", "Amalia", "Dina", "Sergey");
        System.out.println(names);

        // инициализация листа с возможностью увеличить лист в размерах
        List<String> capitals = new ArrayList<>(
                Arrays.asList("Warsaw", "Vilnius", "Riga", "Berlin")
        );
        capitals.add("Prague");
        System.out.println(capitals);

        countries.addAll(capitals);
        System.out.println(countries);

        // напишите функцию которая принимает на вход два списка строк одинаковой длины
        // и возвращает список Boolean - true если элементы с одним и тем-же индексом
        // попарно одинаковы и false наоборот


        // напишите функцию которая принимает на вход два списка строк одинаковой длины
        // и возвращает список Boolean - true если элементы с одним и тем-же индексом
        // попарно одинаковы и false наоборот
        // [Dima, Max, Sveta], [Dima, Anna, Alina] -> [true, false, false]

        System.out.println(
                compare(
                        Arrays.asList("Dima", "Max", "Sveta"),
                        Arrays.asList("Dima", "Anna", "Alina")
                )
        );

        // в коллекциях могут быть только объекты ссылочных типов
        // List<int> b; !!!
        List<Integer> ints = new ArrayList<>();


    }

    public static List<Boolean> compare(List<String> a, List<String> b)
    {
        List<Boolean> r = new ArrayList<>();
        for(int i = 0; i < a.size(); i++)
        {
//            if(a.get(i).equals(b.get(i)))
//                r.add(true);
//            else
//                r.add(false);
            r.add(
                    a.get(i).equals(b.get(i))
            );
        }
        return r;
    }


    // Напишите функцию, которая принимает List<String> и распечатывает только
    // элементы длины больше 5
    public static void printStringsGreaterThan4(List<String> a)
    {
//        for(int i = 0; i < a.size(); i++)
//        {
//            if(a.get(i).length() > 5)
//                System.out.println(a.get(i));
//        }

        // for each способ

        for (String s : a) {
            if (s.length() > 5)
                System.out.println(s);
        }
    }
}
