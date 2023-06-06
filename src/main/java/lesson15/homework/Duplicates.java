package lesson15.homework;

import java.util.*;

public class Duplicates {
    public static void main(String[] args) {

        System.out.println(
                getUniqueLetters("student")
        );
        System.out.println(
                getUniqueLetters("students")
        );

        List<String> w = Arrays.asList("student", "students", "dog", "god", "cat", "act", "flow", "wolf");
        System.out.println(getUniqueWordsList(w));


    }

    // Сгруппируйте элементы списка по уникальному набору символов
    public static Map<String, List<String>> getUniqueWordsList(List<String> strings)
    {
        Map<String, List<String>> result = new LinkedHashMap<>();
        for(String s: strings)
        {
            String key = getUniqueLetters(s);
            List<String> now = result.get(key);
            if(now == null)
                now = new ArrayList<>();
            now.add(s);
            result.put(key, now);
        }
        return result;
    }


    public static String getUniqueLetters(String string)
    {
        Set<String> key = new TreeSet<>();
        for(String s: string.split(""))
        {
            key.add(s);
        }
        return key.toString();
    }


}
