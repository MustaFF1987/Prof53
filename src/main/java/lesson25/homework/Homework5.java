package lesson25.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Если в строке встречается целое число, отделенное пробелами,
то добавьте этому числу ".0"
Пример: "расходы 20 доходы 50.3" -> "расходы 20.0 доходы 50.3" */

public class Homework5 {

        public static void main(String[] args) {
            String input = "расходы 20 доходы 50.3";
            String output = addDecimalToNumbers(input);
            System.out.println(output);
        }

        public static String addDecimalToNumbers(String input) {
            Pattern pattern = Pattern.compile("\\b(\\d+)\\b");
            Matcher matcher = pattern.matcher(input);
            StringBuffer output = new StringBuffer();

            while (matcher.find()) {
                String number = matcher.group(1);
                matcher.appendReplacement(output, number + ".0");
            }

            matcher.appendTail(output);
            return output.toString();
        }
    }
