package arithmetic.q83;

/**
 * @author by LinYan
 * @classname Solution
 * @description 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。
 * <p>
 * 返回同样按升序排列的结果链表。
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [1,1,2]
 * 输出：[1,2]
 * <p>
 * 示例 2：
 * <p>
 * 输入：head = [1,1,2,3,3]
 * 输出：[1,2,3]
 * <p>
 * 提示：
 * <p>
 * <p>
 * 链表中节点数目在范围 [0, 300] 内
 * -100 <= Node.val <= 100
 * 题目数据保证链表已经按升序排列
 * <p>
 * @date 2021/5/21 9:34
 */

public class Solution {

    public static void main(String[] args) {
        ListNode fifthNode = new ListNode(3);
        ListNode fourthNode = new ListNode(3, fifthNode);
        ListNode thirdNode = new ListNode(2, fourthNode);
        ListNode secondNode = new ListNode(1, thirdNode);
        ListNode rootNode = new ListNode(1, secondNode);

        ListNode resultNode = deleteDuplicates(rootNode);

        do {
            System.out.println(resultNode.val);
            resultNode = resultNode.next;
        } while (resultNode != null);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
