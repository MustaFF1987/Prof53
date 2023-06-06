package lesson17;

import java.util.List;

public class homework2 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        int n = 2;
        int sum = countSumOfLast(n, list);
        System.out.println(sum); // Выводит 9
    }

    public static int countSumOfLast(int n, List<Integer> list) {
        int sum = 0;
        int size = list.size();

        // Проверка, что N не превышает размер списка
        if (n <= size) {
            // Обратный цикл, начиная с последнего элемента списка
            for (int i = size - 1; i >= size - n; i--) {
                sum += list.get(i);
            }
        } else {
            // Если N превышает размер списка, сумма будет равна сумме всех элементов списка
            for (int num : list) {
                sum += num;
            }
        }
        return sum;
    }
}
