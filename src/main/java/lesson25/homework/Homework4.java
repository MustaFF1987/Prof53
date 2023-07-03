package lesson25.homework;

/* Напишите функцию, удаляющую из строки все гласные в любом регистре */

public class Homework4 {
    public static void main(String[] args) {
        String string = "What a wonderful day";
        String result = removeVowels(string);
        System.out.println("Исходная строка: " + string);
        System.out.println("Строка без гласных: " + result);

    }

    public static String removeVowels(String str) {
        return str.replaceAll("(?i)[aeiouy]", "");
    }
}
