package lesson25.homework;
/* Напишите функцию
public static String getExtension(String filename)
возвращающую расширение передаваемого в нее имени файла.
Расширение это то что после последней точки.
Например
"hello.png" -> "png"
"my.resume.1.doc" -> "doc" */


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework2 {
    public static void main(String[] args) {

        String string1 = "hello.png";
        String string2 = "my.resume.1.doc";
        String string3 = "file.txt";

        System.out.println(getExtension(string1));
        System.out.println(getExtension(string2));
        System.out.println(getExtension(string3));

    }

    public static String getExtension(String filename) {
        String regex = "\\.([^\\.]+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(filename);

        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }
}



