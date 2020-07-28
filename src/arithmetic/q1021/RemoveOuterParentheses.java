package arithmetic.q1021;

import java.util.Stack;

/**
 * 删除最外层的括号
 *
 * @author LinYan
 * @date 2020/7/28 8:48
 */
public class RemoveOuterParentheses {

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
    }

    public static String removeOuterParentheses(String S) {
        if (S == null || "".equals(S)) {
            return "";
        }

        Stack<Character> sourceStack = new Stack();
        Stack<Character> targetStack = new Stack();
        String result = "";

        for (char c : S.toCharArray()) {
            sourceStack.push(c);
        }

        int count = 0;
        while (!sourceStack.isEmpty()) {
            char temp = sourceStack.pop();
            if ('(' == temp) {
                count--;
            } else if (')' == temp) {
                count++;
            }

            if ((count == 1 && ')' == temp) || count == 0) {
                continue;
            }
            targetStack.push(temp);
        }

        while (!targetStack.isEmpty()) {
            result += targetStack.pop();
        }
        return result;
    }
}
