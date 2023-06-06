package lesson15.homework;

import java.util.*;

public class homeworkMarat {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("one", "two", "three", "two", "four", "four");
        System.out.println(getDuplicatesFromList(words)
        );


    }
    public static Map<String,Integer> getDuplicatesFromList(List<String> strings)
    {
        Map<String, Integer> result = new HashMap<>();
        for(String s: strings)
        {
            Integer number = result.get(s);
            if(number == null) // если, слово новое и не встречалось
                result.put(s,1);
            else
                result.put(s,number+1);
        }
        return result;
    }
}
