package lesson17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class homework1 {
    public static void main(String[] args) {
        String input = "aaaabbccc";
        String encodedString = encode(input);
        System.out.println(encodedString);

        String string = "4a2b3c";
        String decodedString = decode(string);
        System.out.println(decodedString);
    }

    public static String encode(String input) {
        StringBuilder encodedString = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= input.length(); i++) {
            // Проверяем, является ли текущий символ равным предыдущему
            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                // Добавляем количество и символ к закодированной строке
                encodedString.append(count);
                encodedString.append(input.charAt(i - 1));

                // Сбрасываем счетчик
                count = 1;
            }
        }

        return encodedString.toString();
    }

        public static String decode(String input) {
            StringBuilder decodedString = new StringBuilder();

            for (int i = 0; i < input.length(); i += 2) {
                int count = Character.getNumericValue(input.charAt(i));
                char character = input.charAt(i + 1);

                // Добавляем символ count раз к декодированной строке
                for (int j = 0; j < count; j++) {
                    decodedString.append(character);
                }
            }

            return decodedString.toString();
        }
    }

