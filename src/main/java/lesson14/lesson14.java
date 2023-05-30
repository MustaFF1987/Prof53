package lesson14;

import java.util.*;

public class lesson14 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(
                Arrays.asList("Kiwi", "Apple", "Pear", "Banana", "Apricot", "Peach")

        );

        // Компаратор, который сортирует список по 3ей букве слова (лямбда выражение)
        Collections.sort(fruits, Comparator.comparing(s -> s.charAt(2)));
        System.out.println(fruits);

        // без лямбда выражения
        Collections.sort(fruits, new ThirdLetterComparator());
        System.out.println(fruits);

//        fruits.sort(thirdLetterComparator2);
//        System.out.println(fruits);

//        System.out.println(Collections.max(fruits)); // output Strawberry
//        System.out.println(Collections.max(fruits, thirdLetterComparator)); // Kiwi

        List<Fruit> f = new ArrayList<>(
                Arrays.asList(
                        new Fruit("Kiwi",57),
                        new Fruit("Apple", 52),
                        new Fruit("Banana", 89),
                        new Fruit("Cherry",50)
                )
        );

        // написать компаратор на основе калорий и добавить  их всех в fruitSet из списка
        TreeSet<Fruit> fruitSet = new TreeSet<>(
                new Comparator<Fruit>() {
                    @Override
                    public int compare(Fruit o1, Fruit o2) {
                        return Integer.compare(o1.getCalories(), o2.getCalories());
                    }
                }
        );

        fruitSet.addAll(f);
        System.out.println(fruitSet);

        System.out.println(
        fruitSet.subSet(
                new Fruit("Fake", 51),
                new Fruit("Fake",65)
            )
        );

        System.out.println(fruits);

//        System.out.println(
//        Collections.binarySearch(fruits,"Lemon", ThirdLetterComparator)
//        );

    }

    // напишите компаратор, который отсортирует этот список по 3 букве названия
    // убедитесь что это работает
    // "abc".substring(..)
    Comparator<String> thirdLetterComparator2 = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.substring(2,3).compareTo(o2.substring(2,3));
        }
    };

    static class ThirdLetterComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            char thirdLetter1 = s1.charAt(2);
            char thirdLetter2 = s2.charAt(2);
            return Character.compare(thirdLetter1, thirdLetter2);
        }
    }

}
