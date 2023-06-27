package lesson23.homework;

/*  1. Вывести все уникальные слова из текстового файла
      на Ваш выбор (слова в строках отделяются пробелами).

    2. Найти самое длинное слово в текстовом файле на
    выбор (слова в строках отделяются пробелами).  */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Stream;

public class ExercisesWithFile {

        public static void write()
        {
            // создадим файл exercise.txt и заполняем его
            try(
                    FileOutputStream fos = new FileOutputStream("exercise.txt");
                    DataOutputStream dos = new DataOutputStream(fos);
            )
            {
                dos.writeUTF(" Hello, World ! It's a new day. It's a good weather outside. An Amazing time. LongestWordForTheTest ");
            }
            catch (Exception e)
            {
                System.err.println(e.getMessage());
            }
        }

    public static void main(String[] args) {
      write();  // создаём файл и записываем в него текст


        // 1ое. Задание

                //Путь к файлу
//                String filePath = "exercise.txt";
//
//                try {
//                    Set<String> uniqueWords = Files.lines(Path.of(filePath))
//                            .flatMap(line -> Arrays.stream(line.split(" ")))
//                            .map(word -> word.replaceAll("[^\\p{Print}]", ""))
//                            .filter(word -> !word.isEmpty())
//                            .collect(Collectors.toSet());
//
//                    // Выводим слова
//                    uniqueWords.forEach(System.out::println);
//
//                } catch (Exception e) {
//                    System.out.println(e.getMessage());
//                }

        // 2ое. Задание

        String filePath = "exercise.txt";

        try {
            String longestWord = Files.lines(Path.of(filePath))
                    .flatMap(line -> Stream.of(line.split(" ")))
                    .map(word -> word.replaceAll("[^\\p{Print}]", " "))
                    .filter(word -> !word.isEmpty())
                    .max(Comparator.comparingInt(String::length))
                    .orElse("");

            if (!longestWord.isEmpty()) {
                System.out.println("Самое длинное слово: " + longestWord);
            } else {
                System.out.println("Файл пустой");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

     }
 }




