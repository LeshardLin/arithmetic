package arithmetic.q1290;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author LinYan
 * @date 2020/7/29 16:15
 */
public class GetDecimalValue {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(0);
        listNode.next.next = new ListNode(0);

        System.out.println(getDecimalValue(listNode));
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static int getDecimalValue(ListNode head) {
        int result = 0;
        int length = 0;

        Stack<Integer> stack = new Stack();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        while (!stack.isEmpty()) {
            result += (int) (stack.pop() * Math.pow(2, length++));
        }

        return result;
    }
}
