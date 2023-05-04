package lesson6;

import java.util.ArrayList;
import java.util.List;

//Напишите функцию, меняющую порядок следования элементов передаваемого в нее списка на противоположный
//["Dima", "Max", "Alina"] -> ["Alina", "Max", "Dima"]

public class Lesson6HomeWork {

    public static void main(String[] args) {

        // Создаём список names по умолчанию
        List<String> names = new ArrayList<>();

        // Добавляем в список names имена с помощью names.add()
        names.add("Dima");
        names.add("Max");
        names.add("Alina");
        names.add("Pavel");
        names.add("Sergej");
        names.add("Alex");
        names.add("Nicola");

            // Выводим на экран первоначальный созданный список
            System.out.println();
            System.out.println("Первоначальный список имён " + names);
            System.out.println("====================================");
            // Запускаем наш метод со списком names
            newOrder(names);
            // Выводим на экран список с изменённым порядком
            System.out.println("Список имён после изменения порядка " + names);
    }

     public static void newOrder(List<String> names){

         // создаем переменную и записываем в неё кол-во элементов в листе
        int arraySize = names.size();
        // с помощью цикла for идем до середины списка
         for (int i = 0; i < arraySize / 2 ; i++) {
             {
                 // с помощью names.get(i) получаем элемент из списка и записываем его в переменную temp типа String
                 String temp = names.get(i);
                 // с помощью names.set(i, "String") задаём ИТОМУ элементу значение
                 names.set(i, names.get(arraySize - i - 1));
                 names.set(arraySize - i - 1, temp);
                 // На каждой итерации цикла, метод меняет местами элементы с начала и конца списка
             }
         }
    }
}
