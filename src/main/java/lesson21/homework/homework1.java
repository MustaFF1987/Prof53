package lesson21.homework;

/*Есть набор строк
        String [] lines = {
                "one two three four we need this", // 0
                "can one be happy", // 1
                "three of us make one need", // 2
                "this will be four" }; // 3
Создать map из строки в ее длину через лямбда выражение*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class homework1 {
    public static void main(String[] args) {
        String[] lines = {
                "one two three four we need this",
                "can one be happy",
                "three of us make one need",
                "this will be four"};

        Map<String, Integer> map = Arrays.stream(lines)
                .collect(Collectors.toMap(l -> l, String::length));
            System.out.println(map);
        }
    }

