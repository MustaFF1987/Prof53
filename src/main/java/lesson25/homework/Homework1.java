package lesson25.homework;

/* Напишите функцию
public static String format(List strings, String delimiter)
которая бы принимала на вход список строк и форматировала их, добавляя разделитель между элементами
Например:
{"Dima", "Max", "Alena"}, "|" -> "Dima|Max|Alena" */

import java.util.Arrays;
import java.util.List;

public class Homework1 {
    public static void main(String[] args) {

        List<String> string = Arrays.asList(
                "Dima", "Max", "Alena"
        );

        String delimeter = "|";

        System.out.print("Без метода формат: ");
        System.out.println(string);
        System.out.print("С методом формат: ");
        System.out.println(format(string, delimeter));

    }

    public static String format(List strings, String delimiter) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strings.size(); i++) {
            result.append(strings.get(i));

            if (i < strings.size() - 1) {
                result.append(delimiter);
            }
        }
        return result.toString();
    }
}
