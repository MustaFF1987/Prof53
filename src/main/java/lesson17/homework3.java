package lesson17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class homework3 {
    public static void main(String[] args) {
        // Элементы списка строк преобразуйте в верхний регистр и добавьте к длину;
        // потом вызовите функцию которая преобразует строки в обратный порядок
        // Пример: ["Dima", "Max"] -> ["4-AMID", "3-XAM"]
        List<String> names = Arrays.asList("Dima", "Max");
        System.out.println(
                names.stream()
                        .map(String::toUpperCase)
                        .map(s -> s + "-" + s.length())
                        .map(s -> new StringBuilder(s))
                        .map(b -> b.reverse())
                        .map(b -> b.toString())
                        .collect(Collectors.toList())
        );



    }

//    private static String reverseString(String str) {
//        StringBuilder reversed = new StringBuilder();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed.append(str.charAt(i));
//        }
//        return reversed.toString();
//    }
}
