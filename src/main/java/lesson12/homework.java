package lesson12;


import java.util.*;

public class homework {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 4, 3, 2, 3));

        removeOddNumbers(list);
    }


    public static void removeOddNumbers(List<Integer> list) {
        /* Идём в цикле foreach и добавляем в set числа которые, встречаются
        впервые или удаляем, если встречаются повторно */
        Set<Integer> set = new HashSet<>();
        for (int i : list) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);

            }
        }
        System.out.println("Элементы, которые встречаются нечетное кол-во раз " + set);

        // Удаляем из списка все элементы, которые содержатся в set.

//        обычный цикл:

//        for (int i = 0; i < list.size(); i++) {
//            if (set.contains(list.get(i))) {
//                list.remove(i);
//                i--;
//            }
//        }

//        в цикле foreach:

        for (Integer i : new ArrayList<>(list)) {
            if (set.contains(i)) {
                list.remove(i);
            }
        }
        System.out.println("Числа, встречающиеся нечетное количество раз " + list);
        }
    }

