package lesson25.homework;

/* Напишите функцию, проверяющую, что строка является пин-кодом.
Пин-код состоит из 4 или 6 цифр. */

public class Homework3 {

    public static void main(String[] args) {

        String string1 = "123456";
        String string2 = "1478";
        String string3 = "1234567";
        String string4 = "123";

        System.out.println(checkPinCode(string1));
        System.out.println(checkPinCode(string2));
        System.out.println(checkPinCode(string3));
        System.out.println(checkPinCode(string4));

    }

    public static boolean checkPinCode(String filename)
        {
            return filename.matches("^[0-9]{4}$|^[0-9]{6}$");
        }

    }

