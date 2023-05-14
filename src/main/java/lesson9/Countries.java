package lesson9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Countries {
    public static void main(String[] args) {

        Set<String> countries = new HashSet<>();
        Arrays.asList("Andorra", "Belize", "France",
                "Argentina", "Cuba", "Sweden");
        Set<String> words = new HashSet<>();
        Arrays.asList("Andorra", "Canada", "wood", "parrot", "Cuba", "Argentina",
                "Aruba", "Alex", "Finland");

        Iterator<String> wordsIterator = words.iterator();
        while (wordsIterator.hasNext()) {
            String word = wordsIterator.next();
            if (!word.startsWith("A"))
                wordsIterator.remove();
        }
        System.out.println(words);
        countries.retainAll(words);
        System.out.println(countries);
        }

    }

