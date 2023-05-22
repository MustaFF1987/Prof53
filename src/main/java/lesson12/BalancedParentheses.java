package lesson12;

    import java.util.*;

    /*  {}{} -> true
        {()[]} - > true
        [} -> false
        [[] -> false
        {{{]) -> false
        {(][)} -> false
        ({)}() -> false */

    public class BalancedParentheses {

        public static void main(String[] args) {

            String[] test = {"{}{}", "{()[]}","[}", "[[]", "{{{])","{(][)}","({)}()"};

                isBalanced("{()[]}");

        }

        public static boolean isBalanced(String s) {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if (c == ')' || c == '}' || c == ']') {
                    if (stack.isEmpty()) {
                        System.out.println("Balanced");
                        return false;

                    }
                    char last = stack.peek();
                    if ((c == ')' && last == '(') || (c == '}' && last == '{') || (c == ']' && last == '[')) {
                        stack.pop();
                    } else {
                        System.out.println("Not Balanced");
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }

