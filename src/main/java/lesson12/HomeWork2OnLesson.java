package lesson12;

import java.util.Stack;

public class HomeWork2OnLesson {
    public static void main(String[] args) {

        System.out.println(checkBrackets("{}{}")); // true
        System.out.println(checkBrackets("{()[]}")); // true
//        System.out.println(checkBrackets("}{")); // false
//        System.out.println(checkBrackets("[[]")); // false
//        System.out.println(checkBrackets("{(][)}")); // false

    }
    public static boolean checkBrackets(String w)
    {
        // {()[]}
        Stack<Character> chars = new Stack<>();
        for(char c : w.toCharArray())
        {
            // если символ это открывающая скобка {[( то заносим его в стэк
            if(c == '{' || c == '[' || c == '(' )
                chars.push(c);
                // если символ это } то нужно убедиться что в вершине стэка {
                // если символ это ] то нужно убедиться что в вершине стэка [
                // если символ это ) то нужно убедиться что в вершине стэка (
            else if (
                    (c == '}' && chars.peek() == '{') ||
                            (c == ']' && chars.peek() == '[') ||
                            (c == ')' && chars.peek() == '(')
            ) {
                chars.pop();
            }
            // любой другой символ пропускаем
        }
        return chars.size() == 0;
    }
}

