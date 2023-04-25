package lesson6;

import java.util.ArrayList;
import java.util.List;

//Напишите функцию, меняющую порядок следования элементов передаваемого в нее списка на противоположный
//["Dima", "Max", "Alina"] -> ["Alina", "Max", "Dima"]

public class Lesson6HomeWork {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Dima");
        names.add("Max");
        names.add("Alina");
        names.add("Pavel");
        names.add("Sergej");
        names.add("Alex");
        names.add("Nicola");

            System.out.println();
            System.out.println("Первоначальный список имён " + names);
            System.out.println("====================================");
            newOrder(names);
            System.out.println("Список имён после изменения порядка " + names);
    }

     public static void newOrder(List<String> names){

         // создаем переменную и записываем в неё кол-во элементов в листе
        int arraySize = names.size();
        // с помощью цикла for идем до середины массива
         for (int i = 0; i < arraySize / 2 ; i++) {
             {
                 // с помощью names.get(i) получаем элемент из списка и записываем его в переменную типа String temp
                 String temp = names.get(i);
                 // с помощью names.set(i, "String") задём ИТОМУ элементу значение
                 names.set(i, names.get(arraySize - i - 1));
                 names.set(arraySize - i - 1, temp);
                 // На каждой итерации цикла, метод меняет местами элементы с начала и конца списка
             }
         }
    }
}
