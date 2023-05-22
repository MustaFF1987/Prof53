package lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeWorkOnLesson {
    public static void main(String[] args) {

        // Напишите функцию, которая удалит из списка все числа,
        // встречающиеся там нечетное количество раз
        // Пример: [1,2,3,1,4,3,2,3] -> [1,2,1,2]

        List<Integer> l = new ArrayList<>(Arrays.asList(
                1,2,3,1,4,3,2,3
        ));
        removeOddNumberOfElements(l);

        System.out.println(l);
    }

    public static void removeOddNumberOfElements(List<Integer> l)
    {
        List<Integer> i = new ArrayList<>(l);
        Collections.sort(i); // 1,1,2,2,3,3,3,4
        int prev = i.get(0);
        int counter = 1; // сколько раз встретилось число
        for(int j = 1; j < i.size(); j++)
        {
            int current = i.get(j);
            if(prev == current)
                counter++;
            else {
                if(counter % 2 == 1)
                    l.removeAll(List.of(prev));
                counter = 1;
            }
            prev = current;
        }
        if(counter % 2 == 1)
            l.removeAll(List.of(prev));
    }

}
