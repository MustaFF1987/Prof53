package lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>(Arrays.asList("Andora", "Costa-Rica", "Salvador","Chad","South Korea"));

        countries.add("Serbia");


    // создайте реализацию фильтра которая возвращает true,
    // только для тех строк, в где есть буква "s"
    // и с помощью функции filter отфильтруйте список стран

    Filter fil = s -> s.contains("s");
    Filter fill = s -> s.length() > 8;

        System.out.println (filter(countries, fill));

    }

    public static List<String>filter(List<String> s, Filter f){
        List<String> result = new ArrayList<>();
        for(String string : s)
            if(f.filter(string))
                result.add(string);
        return result;
    }

    interface Filter{
        boolean filter(String s);
    }

}
