package lesson15.homework;

import java.util.*;

public class homework {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>(Arrays.asList(
                "Kiwi", "Apple", "Kiwi", "Apple", "Banana", "Banana", "Banana"
        ));

        Map<String, Integer> countFruit = new HashMap<>();
        for (String f : fruits)
            if (countFruit.containsKey(f)) {
                countFruit.put(f, countFruit.get(f) + 1);
            } else {
                countFruit.put(f, 1);
            }

        for (Map.Entry<String, Integer> entry : countFruit.entrySet()) {
            System.out.println("Фрукт: " + entry.getKey() + ", Кол-во раз: " + entry.getValue());
            }
        }

    }

