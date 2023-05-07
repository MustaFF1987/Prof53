package lesson10;

import java.util.*;

public class JavaPractice {
    public static void main(String[] args) {
        String sentence = "два раза это два раза";

        System.out.println(countWords(sentence));

        concordance("два раза это два раза");

    }

    public static HashSet<Word> countWords(String s) {
        HashSet<Word> words = new HashSet<>();
        for (String w : s.split(" ")) {
            Word word = new Word(w);
            // если слово word уже есть в words,
            if (words.contains(word)) {
                word = findWord(words, word);
            }
            // получим его из сета и увеличим count на 1
            word.count++;
            // если слова нет, то добавим
            words.add(word);

        }
        return words;
    }

    // поиск слова перебором в наборе слов
    public static Word findWord(Set<Word> words, Word sample) {
        for (Word w : words) {
            if (w.equals(sample))
                return w;
        }
        return null;
    }

    static class Word {
        public String key;
        public int count = 0;

        public Word(String key) {
            this.key = key;
        }


        @Override
        public String toString() {
            return key + ":" + count;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Word word = (Word) o;

            return key.equals(word.key);
        }

        @Override
        public int hashCode() {
            return key.hashCode();
        }
    }

        /*  В функцию, которая создает по фразе concordance - в каком порядке и на каких позициях слова присутствуют во фразе
            "один раз это один раз" -> "один":[0,3], "раз":[1,4], "это":[2]  */

    public static void concordance(String phrase) {
        // разбиваем заданную фразу на слова с помощью метода split()
        String[] words = phrase.split(" ");
        // Создаём Set StringOv
        Set<String> uw = new HashSet<>(Arrays.asList(words));
        for (String word : uw) {
            List<Integer> positions = new ArrayList<>();
            /* Для каждого уникального слова мы проходим по всей фразе
            и добавляем в список positions все позиции,
            на которых данное слово встречается фразе */
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(word)) {
                    positions.add(i);
                }
            }
            System.out.print(" " + word + ": " + positions);
        }
    }
}
