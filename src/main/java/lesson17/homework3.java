package lesson17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class homework3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList(
                "Dima", "Max", "Anna"));
        names.stream().map(String::toUpperCase).toList().forEach(System.out::println);



    }

//    private static String reverseString(String str) {
//        StringBuilder reversed = new StringBuilder();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed.append(str.charAt(i));
//        }
//        return reversed.toString();
//    }
}
