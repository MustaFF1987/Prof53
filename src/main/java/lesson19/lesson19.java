package lesson19;

import lesson17.PredicateInt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

public class lesson19 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("10", "20", "1", "10", "15", "50", "25");

        System.out.println(strings.stream()
                .filter(s-> s.equals("10")) // промежуточная
                .toList()  // терминальная
        );

        System.out.println(strings.stream()
                .filter(s-> s.equals("10")) // промежуточная
                .count()  // терминальная
        );

        // пропустить 3 первых элемента
        System.out.println(strings.stream().skip(3).toList());

        // показать элементы с 3 по 6
        System.out.println(strings.stream()
                .limit(6)
                .skip(3)
                .toList());

        // distinct - не повторяющиеся элементы
        System.out.println(
                strings.stream().distinct().collect(Collectors.toList())
        );

        // преобразуйте элементы в Integer, сделайте distinct и умножьте на 3
        System.out.println(
                strings.stream()
                        .map(Integer::parseInt)
                        .distinct()
                        .peek(e -> System.out.println("element is " + e)) // заглянуть в поток
                        .map(i -> 3*i)
                        .toList());


        // сортировка
        System.out.println(
                strings.stream()
                        .sorted(Comparator.reverseOrder()) //  сортировка в обратном порядке
                        .toList());



        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("one", "two", "three"),
                Arrays.asList("for"),
                Arrays.asList("five", "six")
        );

        // flatmap
        System.out.println(
                listOfList.stream()
                        .flatMap(
                                list -> list.stream() // уплощение листов
                        )
                        .collect(Collectors.toList())
        );


        // терминальные операции
        // findFirst
        // Optional - класс, который представляет собой либо
        // значение, либо отсутствие значения

        System.out.println(strings.stream()
                .filter(s -> s.contains("7")) // нет элементов с 7кой
                .findFirst() // вернётся Optional.empty
                .orElse("No such element") // если элемента нет, то вернется строка
            );

        // forEach
        strings.stream()
                .forEach(System.out::println);

        // anyMatch(Predicate<T>) хотя бы один элемент не удовлетворяет предикату
        System.out.println(
                strings.stream()
                        .anyMatch(s -> s.contains("5"))
        );

        // allMatch(Predicate<T>) - все элементы удовлетворяют
        System.out.println(
                strings.stream()
                        .allMatch(s -> s.contains("1"))
        );

        // noneMatch - никакой элемент не удовлетворяет предикату
        System.out.println(
                strings.stream().noneMatch(s -> s.contains("8"))
        );

        // 2ой вариант написания
        System.out.println(
                strings.stream().noneMatch("8"::contains)
        );


        // min // max

        System.out.println(
                strings.stream()
                        .max(Comparator.naturalOrder())
                        .get()
        );

        // reduce
        int [] digits = {2,7,3};

        System.out.println(
                Arrays.stream(digits).reduce(0, (i, j) -> i + j)
        );

        System.out.println(
                Arrays.stream(digits).reduce((i, j) -> i * j)
        );


        // List<String> strings = Arrays.asList("10", "20", "1", "10", "15", "50", "25");
        // преобразуйте в Integer и посчитайте сумму
        // используя reduce

        System.out.println(
                strings.stream()
                        .mapToInt(Integer::parseInt)
                        .reduce(0, (i, j) -> i + j));

        // второй вариант написания

        System.out.println(
                strings.stream()
                        .mapToInt(Integer::parseInt)
                        .reduce(0, Integer::sum)
        );


        // объединит в строку все элементы через reduce
        // "10, 20, 1, 10, 15, 50, 25"

        System.out.println(
                strings.stream()
                        .reduce("", (accumulator, element) -> accumulator + element));

        // то же клод написан по другому
        // объедините в строку все элементы через reduce
        // "10, 20, 1, 10, 15, 50, 25"

        strings.stream()
                .reduce((s1, s2) -> s1 + ", " + s2)
                .ifPresent(System.out::println);


// collect()
        // collect(toList()) - в список
        // collect(toCollection()) - в коллекцию
        // collect(toSet()) - в набор
        // collect(groupingBy()) - в map

        // List<String> strings = Arrays.asList("10", "20", "1", "10", "15", "50", "25");


        // groupingBy
        System.out.println(
                strings.stream()
                        .collect(
                                Collectors.groupingBy(
                                        s -> s.length()
                                )
                        )
        );


        System.out.println(
                strings.stream()
                        .collect(
                                Collectors.groupingBy(
                                        s -> Integer.parseInt(s) % 5 == 0
                                )
                        )
          );

        // List<String> strings = Arrays.asList("10", "20", "1", "10", "15", "50", "25");
        // toMap

        System.out.println(
                strings.stream()
                        .distinct()
                        .collect(
                                Collectors.toMap(
                                        Function.identity(), // отдает вход на выход
                                        // s -> s, // ключ
                                        s -> s.length() // значение
                                )

                        )

        );

    }

}
