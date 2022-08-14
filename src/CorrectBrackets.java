
import java.util.ArrayDeque;

// Problem URL -
class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0)
            return true;
        ArrayDeque<Character> stack = new ArrayDeque<Character>(s.length());

        for (Character ch : s.toCharArray()) {
            System.out.println("Stack is:");
            System.out.println(stack);
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    continue;

                default:
                    if (stack.isEmpty()) {
                        System.out.println("Stack size is 0");
                        return false;
                    }

                    Character element = stack.peek();

                    if ((element.equals('(') && ch.equals(')')) || (element.equals('[') && ch.equals(']'))
                            || (element.equals('{') && ch.equals('}'))) {

                        stack.pop();
                    } else {

                        return false;
                    }
            }
        }
        if(stack.isEmpty()) return true;
        return false;

    }
}

/**
 * CorrectBrackets
 */
public class CorrectBrackets {

    public static void main(String[] args) {
        Solution s = new Solution();
        boolean result = s.isValid("[");
        System.out.println("Result is " + result);

    }
}